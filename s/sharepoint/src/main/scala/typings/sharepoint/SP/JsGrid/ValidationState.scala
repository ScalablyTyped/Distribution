package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationState extends js.Object

@JSGlobal("SP.JsGrid.ValidationState")
@js.native
object ValidationState extends js.Object {
  @js.native
  sealed trait Invalid extends ValidationState
  
   // 1,
  @js.native
  sealed trait Pending extends ValidationState
  
   // 0,
  @js.native
  sealed trait Valid extends ValidationState
  
}

