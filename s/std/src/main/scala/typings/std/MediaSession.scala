package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession) */
@js.native
trait MediaSession extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/metadata) */
  /* standard dom */
  var metadata: MediaMetadata | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState) */
  /* standard dom */
  var playbackState: MediaSessionPlaybackState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setActionHandler) */
  /* standard dom */
  def setActionHandler(action: MediaSessionAction): Unit = js.native
  def setActionHandler(action: MediaSessionAction, handler: MediaSessionActionHandler): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/setPositionState) */
  /* standard dom */
  def setPositionState(): Unit = js.native
  def setPositionState(state: MediaPositionState): Unit = js.native
}
