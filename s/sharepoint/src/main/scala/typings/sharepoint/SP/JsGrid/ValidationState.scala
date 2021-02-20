package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationState extends StObject
@JSGlobal("SP.JsGrid.ValidationState")
@js.native
object ValidationState extends StObject {
  
  // 1,
  @js.native
  sealed trait Invalid extends ValidationState
  
  // 0,
  @js.native
  sealed trait Pending extends ValidationState
  
  @js.native
  sealed trait Valid extends ValidationState
}
