package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateSerializeMode extends StObject
@JSGlobal("SP.JsGrid.UpdateSerializeMode")
@js.native
object UpdateSerializeMode extends StObject {
  
  @js.native
  sealed trait Cancel
    extends StObject
       with UpdateSerializeMode
  
  // 0,
  @js.native
  sealed trait Default
    extends StObject
       with UpdateSerializeMode
  
  // 3,
  @js.native
  sealed trait PropBoth
    extends StObject
       with UpdateSerializeMode
  
  // 1,
  @js.native
  sealed trait PropDataOnly
    extends StObject
       with UpdateSerializeMode
  
  // 2,
  @js.native
  sealed trait PropLocalizedOnly
    extends StObject
       with UpdateSerializeMode
}
