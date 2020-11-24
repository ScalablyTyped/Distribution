package typings.rx.global

import org.scalablytyped.runtime.TopLevel
import typings.rx.Iterable
import typings.rx.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends typings.rx.Map[K, V] {
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}
@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]
