package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateSerializeMode extends StObject
@JSGlobal("SP.JsGrid.UpdateSerializeMode")
@js.native
object UpdateSerializeMode extends StObject {
  
  @js.native
  sealed trait Cancel extends UpdateSerializeMode
  
  // 0,
  @js.native
  sealed trait Default extends UpdateSerializeMode
  
  // 3,
  @js.native
  sealed trait PropBoth extends UpdateSerializeMode
  
  // 1,
  @js.native
  sealed trait PropDataOnly extends UpdateSerializeMode
  
  // 2,
  @js.native
  sealed trait PropLocalizedOnly extends UpdateSerializeMode
}
