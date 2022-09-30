package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the current status of a VideoTextureProvider. Lens Studio v1.5.0+ */
@JSGlobal("VideoStatus")
@js.native
object VideoStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.VideoStatus & Double] = js.native
  
  /* 3 */ val Paused: typings.snapchatLensStudio.VideoStatus.Paused & Double = js.native
  
  /* 2 */ val Playing: typings.snapchatLensStudio.VideoStatus.Playing & Double = js.native
  
  /* 1 */ val Preparing: typings.snapchatLensStudio.VideoStatus.Preparing & Double = js.native
  
  /* 0 */ val Stopped: typings.snapchatLensStudio.VideoStatus.Stopped & Double = js.native
}
