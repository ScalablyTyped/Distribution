package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoStatus extends StObject
/** Describes the current status of a VideoTextureProvider. Lens Studio v1.5.0+ */
@JSGlobal("VideoStatus")
@js.native
object VideoStatus extends StObject {
  
  /** The video playback is paused */
  @js.native
  sealed trait Paused
    extends StObject
       with VideoStatus
  
  /** The video is playing */
  @js.native
  sealed trait Playing
    extends StObject
       with VideoStatus
  
  /** The video is being prepared */
  @js.native
  sealed trait Preparing
    extends StObject
       with VideoStatus
  
  /** The video playback has stopped */
  @js.native
  sealed trait Stopped
    extends StObject
       with VideoStatus
}
