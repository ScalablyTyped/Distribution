package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SessionDescription
  extends SessionAttributes
     with SharedDescriptionFields {
  // e=
  var email: js.UndefOr[java.lang.String] = js.undefined
  // m=
  var media: js.Array[sdpDashTransformLib.Anon_TypeProtocol with MediaDescription]
  // s=
  var name: js.UndefOr[java.lang.String] = js.undefined
  // o=
  var origin: js.UndefOr[sdpDashTransformLib.Anon_SessionVersion] = js.undefined
  // p=
  var phone: js.UndefOr[java.lang.String] = js.undefined
  // r=
  var repeats: js.UndefOr[java.lang.String] = js.undefined
  // z=
  var timezones: js.UndefOr[java.lang.String] = js.undefined
  // t=0 0
  var timing: js.UndefOr[sdpDashTransformLib.Anon_Stop] = js.undefined
  // u=
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

