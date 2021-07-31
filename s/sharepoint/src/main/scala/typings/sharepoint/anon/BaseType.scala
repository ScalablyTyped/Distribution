package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseType extends StObject {
  
  var BaseType: Double
  
  var DefaultItemOpen: Double
  
  var Direction: String
  
  var EnableVesioning: Boolean
  
  var Id: String
}
object BaseType {
  
  @scala.inline
  def apply(BaseType: Double, DefaultItemOpen: Double, Direction: String, EnableVesioning: Boolean, Id: String): BaseType = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], DefaultItemOpen = DefaultItemOpen.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EnableVesioning = EnableVesioning.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseType]
  }
  
  @scala.inline
  implicit class BaseTypeMutableBuilder[Self <: BaseType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseType(value: Double): Self = StObject.set(x, "BaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultItemOpen(value: Double): Self = StObject.set(x, "DefaultItemOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVesioning(value: Boolean): Self = StObject.set(x, "EnableVesioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
