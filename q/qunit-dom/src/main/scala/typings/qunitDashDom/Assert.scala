package typings.qunitDashDom

import typings.qunitDashDom.QUnitDomNs.Matchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend QUnit's interface for Assert
@js.native
trait Assert extends js.Object {
  def dom(): Matchers = js.native
  def dom(selector: String): Matchers = js.native
}

