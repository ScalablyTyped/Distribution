package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalOverflow extends StObject
/** Options for handling vertical text overflow. Used by Text component’s verticalOverflow property. */
@JSGlobal("VerticalOverflow")
@js.native
object VerticalOverflow extends StObject {
  
  /** Text will continue to draw past the end of the vertical boundaries. */
  @js.native
  sealed trait Overflow
    extends StObject
       with VerticalOverflow
  
  /** Text will shrink to fit within the vertical boundaries. */
  @js.native
  sealed trait Shrink
    extends StObject
       with VerticalOverflow
  
  /** Text will be clipped at the end of the vertical boundaries. */
  @js.native
  sealed trait Truncate
    extends StObject
       with VerticalOverflow
}
