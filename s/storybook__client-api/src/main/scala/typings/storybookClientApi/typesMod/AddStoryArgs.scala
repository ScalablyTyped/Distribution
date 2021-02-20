package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.StoryName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addons.@storybook/addons.StoryIdentifier & {  storyFn :@storybook/addons.@storybook/addons.StoryFn<any>,   parameters :@storybook/addons.@storybook/addons.Parameters | undefined,   decorators :std.Array<@storybook/addons.@storybook/addons.DecoratorFunction<unknown>> | undefined,   loaders :std.Array<@storybook/addons.@storybook/addons.LoaderFunction> | undefined} */
@js.native
trait AddStoryArgs extends StObject {
  
  var decorators: js.UndefOr[js.Array[DecoratorFunction[_]]] = js.native
  
  var id: StoryId = js.native
  
  var kind: StoryKind = js.native
  
  var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.native
  
  var name: StoryName = js.native
  
  var parameters: js.UndefOr[Parameters] = js.native
  
  var storyFn: StoryFn[_] = js.native
}
object AddStoryArgs {
  
  @scala.inline
  def apply(id: StoryId, kind: StoryKind, name: StoryName, storyFn: StoryFn[_]): AddStoryArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStoryArgs]
  }
  
  @scala.inline
  implicit class AddStoryArgsMutableBuilder[Self <: AddStoryArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorFunction[_]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorFunction[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaders(value: js.Array[LoaderFunction]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    @scala.inline
    def setLoadersVarargs(value: LoaderFunction*): Self = StObject.set(x, "loaders", js.Array(value :_*))
    
    @scala.inline
    def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setStoryFn(value: StoryFn[_]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
  }
}
