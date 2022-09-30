package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextFillMode extends StObject
/** Used in TextFill’s mode property. Controls which drawing method is used for the TextFill. */
@JSGlobal("TextFillMode")
@js.native
object TextFillMode extends StObject {
  
  /** Solid color will be used for drawing. */
  @js.native
  sealed trait Solid
    extends StObject
       with TextFillMode
  
  /** Tiled texture will be used for drawing. */
  @js.native
  sealed trait Texture
    extends StObject
       with TextFillMode
}
