package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radius", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add_dictionary(path: java.lang.String): scala.Unit = js.native
  def decode(args: radiusLib.radiusMod.DecodeArgsWithSecret): radiusLib.radiusMod.RadiusPacket = js.native
  def decode_without_secret(args: radiusLib.radiusMod.DecodeArgs): radiusLib.radiusMod.RadiusPacket = js.native
  def encode(args: radiusLib.radiusMod.EncodeArgs): nodeLib.Buffer = js.native
  def encode_response(args: radiusLib.radiusMod.EncodeResponseArgs): nodeLib.Buffer = js.native
  def unload_dictionaries(): scala.Unit = js.native
  def verify_response(args: radiusLib.radiusMod.VerifyResponseArgs): scala.Boolean = js.native
}

