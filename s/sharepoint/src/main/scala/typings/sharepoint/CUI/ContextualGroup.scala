package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextualGroup extends StObject {
  
  def dispose(): scala.Unit
  
  def get_color(): Double
  
  def get_command(): String
  
  def get_count(): Double
  
  def get_id(): String
  
  def get_title(): String
}
object ContextualGroup {
  
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    get_color: () => Double,
    get_command: () => String,
    get_count: () => Double,
    get_id: () => String,
    get_title: () => String
  ): ContextualGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), get_color = js.Any.fromFunction0(get_color), get_command = js.Any.fromFunction0(get_command), get_count = js.Any.fromFunction0(get_count), get_id = js.Any.fromFunction0(get_id), get_title = js.Any.fromFunction0(get_title))
    __obj.asInstanceOf[ContextualGroup]
  }
  
  @scala.inline
  implicit class ContextualGroupMutableBuilder[Self <: ContextualGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => scala.Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_color(value: () => Double): Self = StObject.set(x, "get_color", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_command(value: () => String): Self = StObject.set(x, "get_command", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_id(value: () => String): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
  }
}
