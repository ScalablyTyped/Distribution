package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The AudioTrack interface represents a single audio track from one of the HTML media elements, <audio> or <video>.  */
trait AudioTrack extends js.Object {
  var enabled: scala.Boolean
  val id: java.lang.String
  var kind: java.lang.String
  val label: java.lang.String
  var language: java.lang.String
  val sourceBuffer: SourceBuffer | scala.Null
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
  override val sourceBuffer: SourceBuffer | scala.Null = js.native
}

@JSGlobal("AudioTrack")
@js.native
object AudioTrack
  extends org.scalablytyped.runtime.Instantiable0[AudioTrack]

