package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.actionsFunctionMod.ActionsFunction
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/preview", JSImport.Namespace)
@js.native
object previewMod extends js.Object {
  val actions: ActionsFunction = js.native
  val config: ActionOptions = js.native
  def action(name: String): HandlerFunction = js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
  def configureActions(): Unit = js.native
  def configureActions(options: ActionOptions): Unit = js.native
  def createDecorator(actionsFn: js.Any): js.Function1[/* repeated */ js.Any, js.Function1[/* storyFn */ js.Function0[_], _]] = js.native
  def decorate(decorators: js.Array[DecoratorFunction]): AnonAction = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[ActionOptions], HandlerFunction] = js.native
  def withActions(args: js.Any*): js.Function1[/* storyFn */ js.Function0[_], _] = js.native
}

