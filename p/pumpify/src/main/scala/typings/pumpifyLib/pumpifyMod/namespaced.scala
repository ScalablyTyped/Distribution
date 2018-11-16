package typings
package pumpifyLib.pumpifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pumpify", JSImport.Namespace)
@js.native
class namespaced protected () extends Pumpify {
  def this(streams: nodeLib.streamMod.Stream*) = this()
  def this(streams: js.Array[nodeLib.streamMod.Stream]) = this()
}

