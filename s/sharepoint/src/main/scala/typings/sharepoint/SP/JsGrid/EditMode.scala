package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditMode extends StObject
@JSGlobal("SP.JsGrid.EditMode")
@js.native
object EditMode extends StObject {
  
  // 3,
  @js.native
  sealed trait Defer
    extends StObject
       with EditMode
  
  @js.native
  sealed trait ReadOnly
    extends StObject
       with EditMode
  
  // 1,
  @js.native
  sealed trait ReadOnlyDefer
    extends StObject
       with EditMode
  
  // 0,
  @js.native
  sealed trait ReadWrite
    extends StObject
       with EditMode
  
  // 2,
  @js.native
  sealed trait ReadWriteDefer
    extends StObject
       with EditMode
}
