package typings.storybookMdx2Csf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArgTypes extends StObject {
    
    var argTypes: String
    
    var args: String
    
    var component: String
    
    var decorators: String
    
    var id: String
    
    var loaders: String
    
    var parameters: String
    
    var render: String
    
    var subcomponents: String
    
    var title: String
  }
  object ArgTypes {
    
    inline def apply(
      argTypes: String,
      args: String,
      component: String,
      decorators: String,
      id: String,
      loaders: String,
      parameters: String,
      render: String,
      subcomponents: String,
      title: String
    ): ArgTypes = {
      val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], subcomponents = subcomponents.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgTypes] (val x: Self) extends AnyVal {
      
      inline def setArgTypes(value: String): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDecorators(value: String): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoaders(value: String): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setSubcomponents(value: String): Self = StObject.set(x, "subcomponents", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
