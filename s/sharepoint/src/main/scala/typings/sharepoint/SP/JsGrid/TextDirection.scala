package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDirection extends js.Object
@JSGlobal("SP.JsGrid.TextDirection")
@js.native
object TextDirection extends js.Object {
  
   // 0,
  @js.native
  sealed trait Default extends TextDirection
  
  @js.native
  sealed trait LeftToRight extends TextDirection
  
   // 1,
  @js.native
  sealed trait RightToLeft extends TextDirection
}
