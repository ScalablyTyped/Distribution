package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Widget")
@js.native
class Widget protected () extends js.Object {
  def this(arg: js.Object) = this()
  
  val _id: String = js.native
  
  var _objClass: String = js.native
  
  // Instace methods
  def container(): Obj | Widget = js.native
  
  def copy(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def get(attributeName: String): js.Any = js.native
  
  def id(): String = js.native
  
  def obj(): Obj = js.native
  
  def objClass(): String = js.native
  
  def update(attributes: js.Any): Unit = js.native
}
