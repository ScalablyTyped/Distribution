package typings
package rlpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rlp", JSImport.Namespace)
@js.native
object rlpMod extends js.Object {
  def decode(input: js.Array[nodeLib.Buffer]): js.Array[nodeLib.Buffer] = js.native
  def decode(input: js.Array[nodeLib.Buffer], stream: scala.Boolean): js.Array[nodeLib.Buffer] = js.native
  def decode(input: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decode(input: nodeLib.Buffer, stream: scala.Boolean): nodeLib.Buffer = js.native
  def decode(input: rlpLib.distTypesMod.Input): js.Array[nodeLib.Buffer] | nodeLib.Buffer | rlpLib.distTypesMod.Decoded = js.native
  def decode(input: rlpLib.distTypesMod.Input, stream: scala.Boolean): js.Array[nodeLib.Buffer] | nodeLib.Buffer | rlpLib.distTypesMod.Decoded = js.native
  def encode(input: rlpLib.distTypesMod.Input): nodeLib.Buffer = js.native
  def getLength(input: rlpLib.distTypesMod.Input): nodeLib.Buffer | scala.Double = js.native
}

