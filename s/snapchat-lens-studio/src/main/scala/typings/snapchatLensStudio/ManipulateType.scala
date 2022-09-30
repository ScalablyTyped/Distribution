package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ManipulateType extends StObject
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
  
  /** The object can be moved by touching and dragging. */
  @js.native
  sealed trait Drag
    extends StObject
       with ManipulateType
  
  /** The object can be scaled by pinching with two fingers. */
  @js.native
  sealed trait Scale
    extends StObject
       with ManipulateType
  
  /** The object can be rotated by swiveling with two fingers. */
  @js.native
  sealed trait Swivel
    extends StObject
       with ManipulateType
}
