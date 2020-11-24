package typings.storybookAddons.typesMod

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStoryApi[StoryFnReturnType] extends js.Object {
  
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  
  def addParameters(parameter: Parameters): StoryApi[StoryFnReturnType] = js.native
  
  def storiesOf(kind: StoryKind, module: NodeModule): StoryApi[StoryFnReturnType] = js.native
}
object ClientStoryApi {
  
  @scala.inline
  def apply[StoryFnReturnType](
    addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
    addParameters: Parameters => StoryApi[StoryFnReturnType],
    storiesOf: (StoryKind, NodeModule) => StoryApi[StoryFnReturnType]
  ): ClientStoryApi[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
  }
  
  @scala.inline
  implicit class ClientStoryApiOps[Self <: ClientStoryApi[_], StoryFnReturnType] (val x: Self with ClientStoryApi[StoryFnReturnType]) extends AnyVal {
    
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
    def setAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self = this.set("addDecorator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddParameters(value: Parameters => StoryApi[StoryFnReturnType]): Self = this.set("addParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoriesOf(value: (StoryKind, NodeModule) => StoryApi[StoryFnReturnType]): Self = this.set("storiesOf", js.Any.fromFunction2(value))
  }
}
