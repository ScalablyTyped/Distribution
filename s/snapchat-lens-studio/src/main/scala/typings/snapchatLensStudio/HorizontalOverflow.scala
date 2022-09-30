package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalOverflow extends StObject
/** Options for wrapping text horizontally. Used by Text component’s horizontalOverflow property. */
@JSGlobal("HorizontalOverflow")
@js.native
object HorizontalOverflow extends StObject {
  
  /** Text will continue drawing past horizontal boundaries. */
  @js.native
  sealed trait Overflow
    extends StObject
       with HorizontalOverflow
  
  /** Text will shrink to fit within the horizontal boundaries. */
  @js.native
  sealed trait Shrink
    extends StObject
       with HorizontalOverflow
  
  /** Text is clipped to the width of horizontal boundaries. */
  @js.native
  sealed trait Truncate
    extends StObject
       with HorizontalOverflow
  
  /** Text wraps when reaching horizontal boundaries and continues on the next line. */
  @js.native
  sealed trait Wrap
    extends StObject
       with HorizontalOverflow
}
