package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDirection extends StObject
@JSGlobal("SP.JsGrid.TextDirection")
@js.native
object TextDirection extends StObject {
  
  @js.native
  sealed trait Default extends TextDirection
  
  // 1,
  @js.native
  sealed trait LeftToRight extends TextDirection
  
  // 0,
  @js.native
  sealed trait RightToLeft extends TextDirection
}
