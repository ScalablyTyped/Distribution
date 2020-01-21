package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/preview/decorateAction", JSImport.Namespace)
@js.native
object decorateActionMod extends js.Object {
  def decorate(decorators: js.Array[DecoratorFunction]): AnonAction = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[ActionOptions], HandlerFunction] = js.native
}

