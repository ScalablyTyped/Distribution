package typings
package qunitDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend QUnit's interface for Assert
@js.native
trait Assert extends js.Object {
  def dom(): qunitDashDomLib.QUnitDomNs.Matchers = js.native
  def dom(selector: java.lang.String): qunitDashDomLib.QUnitDomNs.Matchers = js.native
}

