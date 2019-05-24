package typings
package sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is ported from UA.contact.
  * FIXME: TODO: This is not a great rep for Contact
  * and is used in a kinda hacky way herein.
  */
@js.native
trait Contact extends js.Object {
  var pubGruu: js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  var tempGruu: js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  var uri: sipDotJsLib.libURIMod.URI = js.native
  def toString(options: js.Any): java.lang.String = js.native
}

