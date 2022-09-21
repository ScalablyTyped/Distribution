package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSession extends StObject {
  
  /* standard dom */
  var metadata: MediaMetadata | Null = js.native
  
  /* standard dom */
  var playbackState: MediaSessionPlaybackState = js.native
  
  /* standard dom */
  def setActionHandler(action: MediaSessionAction): Unit = js.native
  def setActionHandler(action: MediaSessionAction, handler: MediaSessionActionHandler): Unit = js.native
  
  /* standard dom */
  def setPositionState(): Unit = js.native
  def setPositionState(state: MediaPositionState): Unit = js.native
}
