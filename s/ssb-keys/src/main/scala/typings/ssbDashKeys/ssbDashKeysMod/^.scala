package typings.ssbDashKeys.ssbDashKeysMod

import typings.node.Buffer
import typings.ssbDashKeys.Anon_Signature
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssb-keys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def box(content: String, recipients: js.Array[String]): String = js.native
  def box(content: js.Object, recipients: js.Array[String]): String = js.native
  def box(content: Boolean, recipients: js.Array[String]): String = js.native
  def box(content: Double, recipients: js.Array[String]): String = js.native
  def generate(): Keys = js.native
  def generate(curve: String): Keys = js.native
  def generate(curve: String, seed: Buffer): Keys = js.native
  def getTag(ssb_id: String): String = js.native
  def hash(data: Buffer): String = js.native
  def hash(data: Buffer, encoding: String): String = js.native
  def loadOrCreate(filename: String, cb: js.Function2[/* err */ Error | Null, /* keys */ Keys, _]): Unit = js.native
  def loadOrCreateSync(filename: String): Keys = js.native
  def secretBox(obj: js.Object, key: Buffer): Buffer = js.native
  def secretUnbox(boxed: Buffer, key: Buffer): js.Object = js.native
  def signObj[T /* <: js.Object */](keys: Keys, hmac_key: String, obj: T): T with Anon_Signature = js.native
  def signObj[T /* <: js.Object */](keys: Keys, obj: T): T with Anon_Signature = js.native
  def unbox(boxed: String, keys: Keys): js.UndefOr[js.Object | String | Boolean | Double] = js.native
  def unboxBody(boxed: String, msg_key: String): js.UndefOr[String | Null] = js.native
  def unboxKey(boxed: String, keys: Keys): js.UndefOr[String | Null] = js.native
  def verifyObj(keys: Keys, hmac_key: String, obj: Anon_Signature): Boolean = js.native
  def verifyObj(keys: Keys, obj: Anon_Signature): Boolean = js.native
}

