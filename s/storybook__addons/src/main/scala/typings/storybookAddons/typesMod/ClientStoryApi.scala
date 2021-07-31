package typings.storybookAddons.typesMod

import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientStoryApi[StoryFnReturnType] extends StObject {
  
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
  
  def addParameters(parameter: Parameters): StoryApi[StoryFnReturnType]
  
  def storiesOf(kind: StoryKind, module: NodeModule): StoryApi[StoryFnReturnType]
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
  implicit class ClientStoryApiMutableBuilder[Self <: ClientStoryApi[?], StoryFnReturnType] (val x: Self & ClientStoryApi[StoryFnReturnType]) extends AnyVal {
    
    @scala.inline
    def setAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddParameters(value: Parameters => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoriesOf(value: (StoryKind, NodeModule) => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
  }
}
