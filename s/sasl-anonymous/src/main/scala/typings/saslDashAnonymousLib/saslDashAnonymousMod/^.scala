package typings
package saslDashAnonymousLib.saslDashAnonymousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-anonymous", JSImport.Namespace)
@js.native
class ^ () extends AnonymousMechanism {
  /* CompleteClass */
  override var clientFirst: saslDashAnonymousLib.saslDashAnonymousLibNumbers.`true` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_AnonymousMechanism: saslDashAnonymousLib.saslDashAnonymousLibStrings.ANONYMOUS = js.native
  /* CompleteClass */
  override def challenge(chal: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): java.lang.String = js.native
}

@JSImport("sasl-anonymous", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: saslDashAnonymousLib.TypeofClassAnonymousMechanism = js.native
}

