package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScreenRegionType extends StObject
/** Types of screen regions that can be used with ScreenRegionComponent. */
@JSGlobal("ScreenRegionType")
@js.native
object ScreenRegionType extends StObject {
  
  /** The screen area shown to the user when recording. On some devices, this region is a subset of FullFrame region. */
  @js.native
  sealed trait Capture
    extends StObject
       with ScreenRegionType
  
  /** The entire screen area of the device. */
  @js.native
  sealed trait FullFrame
    extends StObject
       with ScreenRegionType
  
  /** The screen area shown to the user when previewing a Snap. On some devices, this region is a subset of Capture region. */
  @js.native
  sealed trait Preview
    extends StObject
       with ScreenRegionType
  
  /** The screen area where the round “Snap” button is drawn. */
  @js.native
  sealed trait RoundButton
    extends StObject
       with ScreenRegionType
  
  /** A screen area that will be visible on all devices and won’t overlap Snapchat UI. Safe area to place any UI elements. */
  @js.native
  sealed trait SafeRender
    extends StObject
       with ScreenRegionType
}
