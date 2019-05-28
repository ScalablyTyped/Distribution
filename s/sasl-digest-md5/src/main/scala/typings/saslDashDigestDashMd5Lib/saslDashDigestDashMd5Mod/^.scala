package typings
package saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-digest-md5", JSImport.Namespace)
@js.native
class ^ () extends DigestMd5Mechanism {
  def this(options: Options) = this()
  /* CompleteClass */
  override var clientFirst: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibNumbers.`false` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_DigestMd5Mechanism: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibStrings.`DIGEST-MD5` = js.native
  /* CompleteClass */
  override def challenge(chal: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): java.lang.String = js.native
}

@JSImport("sasl-digest-md5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: saslDashDigestDashMd5Lib.TypeofClassDigestMd5Mechanism = js.native
}

