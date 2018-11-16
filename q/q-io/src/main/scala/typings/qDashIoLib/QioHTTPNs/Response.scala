package typings
package qDashIoLib.QioHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Response extends js.Object {
  var body: qDashIoLib.QioNs.Reader
  var headers: Headers
  var node: js.Any
  var status: scala.Double
  def onclose(): scala.Unit
}

