package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MediaElementSourceNode has no inputs and exactly one output, and is created using the AudioContext.createMediaElementSource method. The amount of channels in the output equals the number of channels of the audio referenced by the HTMLMediaElement used in the creation of the node, or is 1 if the HTMLMediaElement has no audio.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode)
  */
@js.native
trait MediaElementAudioSourceNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode/mediaElement) */
  /* standard dom */
  val mediaElement: HTMLMediaElement = js.native
}
