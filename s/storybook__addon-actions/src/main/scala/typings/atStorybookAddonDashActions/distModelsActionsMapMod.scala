package typings.atStorybookAddonDashActions

import typings.atStorybookAddonDashActions.distModelsHandlerFunctionMod.HandlerFunction
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/models/ActionsMap", JSImport.Namespace)
@js.native
object distModelsActionsMapMod extends js.Object {
  type ActionsMap[T /* <: String */] = Record[T, HandlerFunction]
}

