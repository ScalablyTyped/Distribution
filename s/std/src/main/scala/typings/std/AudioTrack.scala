package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single audio track from one of the HTML media elements, <audio> or <video>.  */
trait AudioTrack extends js.Object {
  var enabled: scala.Boolean
  val id: java.lang.String
  var kind: java.lang.String
  val label: java.lang.String
  var language: java.lang.String
  val sourceBuffer: SourceBuffer | Null
}

@JSGlobal("AudioTrack")
@js.native
class AudioTrackCls () extends AudioTrack {
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override var kind: java.lang.String = js.native
  /* CompleteClass */
  override val label: java.lang.String = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override val sourceBuffer: SourceBuffer | Null = js.native
}

@JSGlobal("AudioTrack")
@js.native
object AudioTrack extends Instantiable0[AudioTrack]

