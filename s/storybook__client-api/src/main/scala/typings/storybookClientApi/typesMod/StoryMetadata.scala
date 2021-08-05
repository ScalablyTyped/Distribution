package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryMetadata extends StObject {
  
  var decorators: js.UndefOr[js.Array[DecoratorFunction[js.Any]]] = js.undefined
  
  var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.undefined
  
  var parameters: js.UndefOr[Parameters] = js.undefined
}
object StoryMetadata {
  
  inline def apply(): StoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryMetadata]
  }
  
  extension [Self <: StoryMetadata](x: Self) {
    
    inline def setDecorators(value: js.Array[DecoratorFunction[js.Any]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: DecoratorFunction[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    inline def setLoaders(value: js.Array[LoaderFunction]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    inline def setLoadersVarargs(value: LoaderFunction*): Self = StObject.set(x, "loaders", js.Array(value :_*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
