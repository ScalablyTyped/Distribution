package typings
package pumpifyLib.pumpifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pumpify", JSImport.Namespace)
@js.native
class ^ protected () extends Pumpify {
  def this(streams: nodeLib.streamMod.Stream*) = this()
  def this(streams: js.Array[nodeLib.streamMod.Stream]) = this()
}

@JSImport("pumpify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var obj: org.scalablytyped.runtime.Instantiable1[/* streams (repeated) */ nodeLib.streamMod.Stream, Pumpify] = js.native
  def ctor(opts: PumpifyFactoryOptions): org.scalablytyped.runtime.Instantiable1[/* streams (repeated) */ nodeLib.streamMod.Stream, Pumpify] = js.native
}

