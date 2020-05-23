package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends typings.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]

