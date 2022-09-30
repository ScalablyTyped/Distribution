package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TileZone extends StObject
/** Defines the bounding area used for texture tiling with TextFill’s tileZone property. */
@JSGlobal("TileZone")
@js.native
object TileZone extends StObject {
  
  /** Each character uses its own drawn area for texture tiling */
  @js.native
  sealed trait Character
    extends StObject
       with TileZone
  
  /** The Text component’s drawn area (extents) is used for texture tiling */
  @js.native
  sealed trait Extents
    extends StObject
       with TileZone
  
  /** The attached ScreenTransform’s bounding rectangle is used for texture tiling */
  @js.native
  sealed trait Rect
    extends StObject
       with TileZone
  
  /** The position of each character in screen space is used for tiling */
  @js.native
  sealed trait Screen
    extends StObject
       with TileZone
}
