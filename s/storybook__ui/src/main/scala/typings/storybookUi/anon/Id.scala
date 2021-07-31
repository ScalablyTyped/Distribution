package typings.storybookUi.anon

import typings.storybookAddonActions.handlerFunctionMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var onClick: HandlerFunction
  
  var title: String
}
object Id {
  
  @scala.inline
  def apply(id: String, onClick: HandlerFunction, title: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: HandlerFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
