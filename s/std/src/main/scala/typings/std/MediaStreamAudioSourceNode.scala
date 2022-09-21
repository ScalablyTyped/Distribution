package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs. */
@js.native
trait MediaStreamAudioSourceNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  val mediaStream: MediaStream = js.native
}
