package typings
package saslDashPlainLib.saslDashPlainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-plain", JSImport.Namespace)
@js.native
class namespaced () extends PlainMechanism {
  /* CompleteClass */
  override var clientFirst: saslDashPlainLib.saslDashPlainLibNumbers.`true` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_PlainMechanism: saslDashPlainLib.saslDashPlainLibStrings.PLAIN = js.native
  /* CompleteClass */
  override def challenge(chal: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  /* CompleteClass */
  override def response(cred: saslDashPlainLib.saslDashPlainMod.PlainMechanismNs.Credentials): java.lang.String = js.native
}

@JSImport("sasl-plain", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var Mechanism: org.scalablytyped.runtime.Instantiable0[saslDashPlainLib.saslDashPlainMod.PlainMechanism] = js.native
}

