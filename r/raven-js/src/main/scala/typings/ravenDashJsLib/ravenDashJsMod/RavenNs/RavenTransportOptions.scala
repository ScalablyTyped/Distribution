package typings
package ravenDashJsLib.ravenDashJsMod.RavenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenTransportOptions extends js.Object {
  var auth: ravenDashJsLib.Anon_Sentrykey
  var data: js.Any
  var url: java.lang.String
  def onError(error: stdLib.Error with ravenDashJsLib.Anon_Request): scala.Unit
  def onSuccess(): scala.Unit
}

