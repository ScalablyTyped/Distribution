package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastrEmitter extends js.Object {
  
  def clean(): Unit = js.native
  
  def confirm(message: String, options: ConfirmToastrOptions): Unit = js.native
  
  def error(title: String, message: String): Unit = js.native
  def error(title: String, message: String, options: BasicToastrOptions): Unit = js.native
  
  def info(title: String, message: String): Unit = js.native
  def info(title: String, message: String, options: BasicToastrOptions): Unit = js.native
  
  def light(title: String, message: String): Unit = js.native
  def light(title: String, message: String, options: LightToastrOptions): Unit = js.native
  
  def message(title: String, message: String): Unit = js.native
  def message(title: String, message: String, options: BasicToastrOptions): Unit = js.native
  
  def removeByType(`type`: String): Unit = js.native
  
  def success(title: String, message: String): Unit = js.native
  def success(title: String, message: String, options: BasicToastrOptions): Unit = js.native
  
  def warning(title: String, message: String): Unit = js.native
  def warning(title: String, message: String, options: BasicToastrOptions): Unit = js.native
}
