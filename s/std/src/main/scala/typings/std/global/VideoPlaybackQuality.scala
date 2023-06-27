package typings.std.global

import typings.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoPlaybackQuality")
@js.native
/* standard dom */
open class VideoPlaybackQuality ()
  extends StObject
     with typings.std.VideoPlaybackQuality {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/corruptedVideoFrames)
    */
  /* standard dom */
  /* CompleteClass */
  override val corruptedVideoFrames: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/creationTime) */
  /* standard dom */
  /* CompleteClass */
  override val creationTime: DOMHighResTimeStamp = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/droppedVideoFrames) */
  /* standard dom */
  /* CompleteClass */
  override val droppedVideoFrames: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/totalVideoFrames) */
  /* standard dom */
  /* CompleteClass */
  override val totalVideoFrames: Double = js.native
}
