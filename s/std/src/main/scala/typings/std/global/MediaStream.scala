package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStream")
@js.native
class MediaStream ()
  extends typings.std.MediaStream {
  def this(stream: typings.std.MediaStream) = this()
  def this(tracks: js.Array[typings.std.MediaStreamTrack]) = this()
}

@JSGlobal("MediaStream")
@js.native
object MediaStream
  extends Instantiable0[typings.std.MediaStream]
     with Instantiable1[
      (/* tracks */ js.Array[typings.std.MediaStreamTrack]) | (/* stream */ typings.std.MediaStream), 
      typings.std.MediaStream
    ]

