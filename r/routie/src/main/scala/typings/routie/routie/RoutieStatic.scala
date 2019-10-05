package typings.routie.routie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutieStatic extends js.Object {
  def lookup(name: String, fn: js.Function): String = js.native
  def navigate(path: String): Unit = js.native
  def navigate(path: String, options: RouteOptions): Unit = js.native
  def noConflict(): Routie = js.native
  def remove(path: String, fn: js.Function): Unit = js.native
  def removeAll(): Unit = js.native
}

