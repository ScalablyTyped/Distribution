package typings.atStorybookAddonDashActions

import typings.atStorybookAddonDashActions.distModelsActionOptionsMod.ActionOptions
import typings.atStorybookAddonDashActions.distModelsDecoratorFunctionMod.DecoratorFunction
import typings.atStorybookAddonDashActions.distModelsHandlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/preview/decorateAction", JSImport.Namespace)
@js.native
object distPreviewDecorateActionMod extends js.Object {
  def decorate(decorators: js.Array[DecoratorFunction]): Anon_Action = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[ActionOptions], HandlerFunction] = js.native
}

