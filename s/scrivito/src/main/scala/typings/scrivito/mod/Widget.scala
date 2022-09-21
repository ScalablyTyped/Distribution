package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Widget")
@js.native
open class Widget protected () extends StObject {
  def this(arg: js.Object) = this()
  
  /* private */ val _id: String = js.native
  
  /* private */ var _objClass: String = js.native
  
  // Instace methods
  def container(): Obj | Widget = js.native
  
  def copy(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def get(attributeName: String): Any = js.native
  
  def id(): String = js.native
  
  def obj(): Obj = js.native
  
  def objClass(): String = js.native
  
  def update(attributes: Any): Unit = js.native
}
