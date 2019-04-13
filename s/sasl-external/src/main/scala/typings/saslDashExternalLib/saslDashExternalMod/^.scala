package typings
package saslDashExternalLib.saslDashExternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-external", JSImport.Namespace)
@js.native
class ^ () extends ExternalMechanism {
  /* CompleteClass */
  override var clientFirst: saslDashExternalLib.saslDashExternalLibNumbers.`true` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_ExternalMechanism: saslDashExternalLib.saslDashExternalLibStrings.EXTERNAL = js.native
  /* CompleteClass */
  override def challenge(chal: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): java.lang.String = js.native
}

@JSImport("sasl-external", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: saslDashExternalLib.Anon_Mechanism = js.native
}

