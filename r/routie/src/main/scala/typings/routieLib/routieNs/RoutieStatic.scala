package typings
package routieLib.routieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutieStatic extends js.Object {
  def lookup(name: java.lang.String, fn: js.Function): java.lang.String = js.native
  def navigate(path: java.lang.String): scala.Unit = js.native
  def navigate(path: java.lang.String, options: RouteOptions): scala.Unit = js.native
  def noConflict(): Routie = js.native
  def remove(path: java.lang.String, fn: js.Function): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
}

