package typings.saslPlain.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saslPlain.anon.TypeofPlainMechanism
import typings.saslPlain.saslPlainBooleans.`true`
import typings.saslPlain.saslPlainStrings.PLAIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-plain", JSImport.Namespace)
@js.native
class ^ () extends PlainMechanism {
  /* CompleteClass */
  override var clientFirst: `true` = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_PlainMechanism: PLAIN = js.native
  /* CompleteClass */
  override def challenge(chal: String): Unit = js.native
  /* CompleteClass */
  override def response(cred: StringDictionary[js.Any]): String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): String = js.native
}

@JSImport("sasl-plain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: TypeofPlainMechanism = js.native
}

