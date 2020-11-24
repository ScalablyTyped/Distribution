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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addons.@storybook/addons.StoryIdentifier & {  storyFn :@storybook/addons.@storybook/addons.StoryFn<any>,   parameters :@storybook/addons.@storybook/addons.Parameters | undefined,   decorators :std.Array<@storybook/addons.@storybook/addons.DecoratorFunction<unknown>> | undefined,   loaders :std.Array<@storybook/addons.@storybook/addons.LoaderFunction> | undefined} */
@js.native
trait AddStoryArgs extends js.Object {
  
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
  implicit class AddStoryArgsOps[Self <: AddStoryArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFn(value: StoryFn[_]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorFunction[js.Any]*): Self = this.set("decorators", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorFunction[_]]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setLoadersVarargs(value: LoaderFunction*): Self = this.set("loaders", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(value: js.Array[LoaderFunction]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaders: Self = this.set("loaders", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
