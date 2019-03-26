package typings
package reactDashNativeDashUuidLib.reactDashNativeDashUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uuid extends js.Object {
  def noConflict(): java.lang.String = js.native
  def parse(id: java.lang.String): stdLib.ArrayBuffer = js.native
  def parse(id: java.lang.String, buffer: stdLib.ArrayBuffer): stdLib.ArrayBuffer = js.native
  def parse(id: java.lang.String, buffer: stdLib.ArrayBuffer, offset: scala.Double): stdLib.ArrayBuffer = js.native
  def unparse(): java.lang.String = js.native
  def unparse(buffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def unparse(buffer: stdLib.ArrayBuffer, offset: scala.Double): java.lang.String = js.native
  def v1(): java.lang.String = js.native
  def v1(options: v1): java.lang.String = js.native
  def v1(options: v1, buffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def v1(options: v1, buffer: stdLib.ArrayBuffer, offset: scala.Double): java.lang.String = js.native
  def v4(): java.lang.String = js.native
  def v4(options: v4): java.lang.String = js.native
  def v4(options: v4, buffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def v4(options: v4, buffer: stdLib.ArrayBuffer, offset: scala.Double): java.lang.String = js.native
}

