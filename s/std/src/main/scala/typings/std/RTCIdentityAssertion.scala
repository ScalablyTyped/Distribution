package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIdentityAssertion extends js.Object {
  var idp: java.lang.String
  var name: java.lang.String
}

@JSGlobal("RTCIdentityAssertion")
@js.native
class RTCIdentityAssertionCls protected () extends RTCIdentityAssertion {
  def this(idp: java.lang.String, name: java.lang.String) = this()
  /* CompleteClass */
  override var idp: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("RTCIdentityAssertion")
@js.native
object RTCIdentityAssertion
  extends Instantiable2[/* idp */ java.lang.String, /* name */ java.lang.String, RTCIdentityAssertion]

