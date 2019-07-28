package typings.radius.radiusMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radius", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add_dictionary(path: String): Unit = js.native
  def decode(args: DecodeArgsWithSecret): RadiusPacket = js.native
  def decode_without_secret(args: DecodeArgs): RadiusPacket = js.native
  def encode(args: EncodeArgs): Buffer = js.native
  def encode_response(args: EncodeResponseArgs): Buffer = js.native
  def unload_dictionaries(): Unit = js.native
  def verify_response(args: VerifyResponseArgs): Boolean = js.native
}

