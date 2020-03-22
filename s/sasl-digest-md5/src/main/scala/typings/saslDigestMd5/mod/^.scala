package typings.saslDigestMd5.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saslDigestMd5.TypeofDigestMd5Mechanism
import typings.saslDigestMd5.saslDigestMd5Booleans.`false`
import typings.saslDigestMd5.saslDigestMd5Strings.`DIGEST-MD5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-digest-md5", JSImport.Namespace)
@js.native
class ^ () extends DigestMd5Mechanism {
  def this(options: Options) = this()
  /* CompleteClass */
  override var clientFirst: `false` = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_DigestMd5Mechanism: `DIGEST-MD5` = js.native
  /* CompleteClass */
  override def challenge(chal: String): Unit = js.native
  /* CompleteClass */
  override def response(cred: StringDictionary[js.Any]): String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): String = js.native
}

@JSImport("sasl-digest-md5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: TypeofDigestMd5Mechanism = js.native
}

