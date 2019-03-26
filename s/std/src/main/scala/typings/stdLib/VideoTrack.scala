package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoTrack extends js.Object {
  val id: java.lang.String
  var kind: java.lang.String
  val label: java.lang.String
  var language: java.lang.String
  var selected: scala.Boolean
  val sourceBuffer: SourceBuffer
}

@JSGlobal("VideoTrack")
@js.native
class VideoTrackCls () extends VideoTrack {
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override var kind: java.lang.String = js.native
  /* CompleteClass */
  override val label: java.lang.String = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var selected: scala.Boolean = js.native
  /* CompleteClass */
  override val sourceBuffer: SourceBuffer = js.native
}

@JSGlobal("VideoTrack")
@js.native
object VideoTrack
  extends org.scalablytyped.runtime.Instantiable0[VideoTrack]

