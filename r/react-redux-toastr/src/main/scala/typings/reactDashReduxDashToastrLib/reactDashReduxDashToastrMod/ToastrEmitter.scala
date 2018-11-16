package typings
package reactDashReduxDashToastrLib.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrEmitter extends js.Object {
  def clean(): scala.Unit = js.native
  def confirm(message: java.lang.String, options: ConfirmToastrOptions): scala.Unit = js.native
  def error(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def error(title: java.lang.String, message: java.lang.String, options: BasicToastrOptions): scala.Unit = js.native
  def info(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def info(title: java.lang.String, message: java.lang.String, options: BasicToastrOptions): scala.Unit = js.native
  def light(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def light(title: java.lang.String, message: java.lang.String, options: LightToastrOptions): scala.Unit = js.native
  def message(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def message(title: java.lang.String, message: java.lang.String, options: BasicToastrOptions): scala.Unit = js.native
  def removeByType(`type`: java.lang.String): scala.Unit = js.native
  def success(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def success(title: java.lang.String, message: java.lang.String, options: BasicToastrOptions): scala.Unit = js.native
  def warning(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def warning(title: java.lang.String, message: java.lang.String, options: BasicToastrOptions): scala.Unit = js.native
}

