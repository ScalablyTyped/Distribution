package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var left: js.Any
  
  var top: js.Any
}
object Top {
  
  @scala.inline
  def apply(left: js.Any, top: js.Any): Top = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: js.Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
