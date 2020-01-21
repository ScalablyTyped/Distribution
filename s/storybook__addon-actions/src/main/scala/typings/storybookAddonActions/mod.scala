package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.actionsFunctionMod.ActionsFunction
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import typings.storybookAddonActions.storybookAddonActionsStrings.$___storybookDotisCyclic
import typings.storybookAddonActions.storybookAddonActionsStrings.storybookSlashactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ADDON_ID: storybookSlashactions = js.native
  val CYCLIC_KEY: $___storybookDotisCyclic = js.native
  val EVENT_ID: String = js.native
  val PANEL_ID: String = js.native
  val PARAM_KEY: typings.storybookAddonActions.storybookAddonActionsStrings.actions = js.native
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

