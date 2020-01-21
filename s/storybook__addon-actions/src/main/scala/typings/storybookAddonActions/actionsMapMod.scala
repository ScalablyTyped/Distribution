package typings.storybookAddonActions

import typings.std.Record
import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/models/ActionsMap", JSImport.Namespace)
@js.native
object actionsMapMod extends js.Object {
  type ActionsMap[T /* <: String */] = Record[T, HandlerFunction]
}

