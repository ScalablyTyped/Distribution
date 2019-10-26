package typings.sodiumjs.sodiumjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Router")
@js.native
class Router[A, K] protected ()
  extends typings.sodiumjs.distTypingsSodiumRouterMod.Router[A, K] {
  def this(
    inStream: typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A],
    selector: js.Function1[/* a */ A, js.Array[K]]
  ) = this()
  def this(
    inStream: typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A],
    selector: js.Function1[/* a */ A, js.Array[K]],
    keyToStr: js.Function1[/* k */ K, String]
  ) = this()
}

