package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryMetadata extends StObject {
  
  var decorators: js.UndefOr[js.Array[DecoratorFunction[_]]] = js.native
  
  var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.native
  
  var parameters: js.UndefOr[Parameters] = js.native
}
object StoryMetadata {
  
  @scala.inline
  def apply(): StoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryMetadata]
  }
  
  @scala.inline
  implicit class StoryMetadataMutableBuilder[Self <: StoryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorFunction[_]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorFunction[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(value: js.Array[LoaderFunction]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    @scala.inline
    def setLoadersVarargs(value: LoaderFunction*): Self = StObject.set(x, "loaders", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
