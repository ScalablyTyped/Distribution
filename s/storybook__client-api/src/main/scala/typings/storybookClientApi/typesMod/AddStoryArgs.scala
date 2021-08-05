package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryIdentifier
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.StoryName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddStoryArgs
  extends StObject
     with StoryIdentifier {
  
  var decorators: js.UndefOr[js.Array[DecoratorFunction[js.Any]]] = js.undefined
  
  var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.undefined
  
  var parameters: js.UndefOr[Parameters] = js.undefined
  
  var storyFn: StoryFn[js.Any]
}
object AddStoryArgs {
  
  inline def apply(id: StoryId, kind: StoryKind, name: StoryName, storyFn: StoryFn[js.Any]): AddStoryArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStoryArgs]
  }
  
  extension [Self <: AddStoryArgs](x: Self) {
    
    inline def setDecorators(value: js.Array[DecoratorFunction[js.Any]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: DecoratorFunction[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    inline def setLoaders(value: js.Array[LoaderFunction]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    inline def setLoadersVarargs(value: LoaderFunction*): Self = StObject.set(x, "loaders", js.Array(value :_*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setStoryFn(value: StoryFn[js.Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    inline def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => js.Any): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
    
    inline def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => js.Any): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
  }
}
