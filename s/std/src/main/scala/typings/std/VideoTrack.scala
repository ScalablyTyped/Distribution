package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single video track from a <video> element. */
trait VideoTrack extends js.Object {
  val id: java.lang.String
  var kind: java.lang.String
  val label: java.lang.String
  var language: java.lang.String
  var selected: scala.Boolean
  val sourceBuffer: SourceBuffer | Null
}

@JSGlobal("VideoTrack")
@js.native
object VideoTrack extends Instantiable0[VideoTrack]

