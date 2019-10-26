package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumStreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Router", JSImport.Namespace)
@js.native
object distTypingsSodiumRouterMod extends js.Object {
  @js.native
  class Router[A, K] protected () extends js.Object {
    def this(inStream: Stream[A], selector: js.Function1[/* a */ A, js.Array[K]]) = this()
    def this(
      inStream: Stream[A],
      selector: js.Function1[/* a */ A, js.Array[K]],
      keyToStr: js.Function1[/* k */ K, String]
    ) = this()
    var _inStream: js.Any = js.native
    var _table: js.Any = js.native
    var _vertex: js.Any = js.native
    def filterMatches(k: K): Stream[A] = js.native
  }
  
}

