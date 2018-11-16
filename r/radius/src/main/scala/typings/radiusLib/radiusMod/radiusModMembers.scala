package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radius", JSImport.Namespace)
@js.native
object radiusModMembers extends js.Object {
  def add_dictionary(path: java.lang.String): scala.Unit = js.native
  def decode(args: DecodeArgsWithSecret): RadiusPacket = js.native
  def decode_without_secret(args: DecodeArgs): RadiusPacket = js.native
  def encode(args: EncodeArgs): nodeLib.Buffer = js.native
  def encode_response(args: EncodeResponseArgs): nodeLib.Buffer = js.native
  def unload_dictionaries(): scala.Unit = js.native
  def verify_response(args: VerifyResponseArgs): scala.Boolean = js.native
}

