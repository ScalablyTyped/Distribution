package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum values specifying each type of manipulation. See ManipulateComponent.
  * ```
  * // Disables the scale functionality on a manipulate component when a user taps
  * //@input Component.ManipulateComponent manip
  *
  * function onTap(eventData)
  * {
  *     script.manip.enableManipulateType(ManipulateType.Scale, false);
  * }
  * var tapEvent = script.createEvent("TapEvent");
  * tapEvent.bind(onTap);
  * ```
  */
@JSGlobal("ManipulateType")
@js.native
object ManipulateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.ManipulateType & Double] = js.native
  
  /* 2 */ val Drag: typings.snapchatLensStudio.ManipulateType.Drag & Double = js.native
  
  /* 0 */ val Scale: typings.snapchatLensStudio.ManipulateType.Scale & Double = js.native
  
  /* 1 */ val Swivel: typings.snapchatLensStudio.ManipulateType.Swivel & Double = js.native
}
