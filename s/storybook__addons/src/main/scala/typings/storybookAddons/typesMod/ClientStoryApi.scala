package typings.storybookAddons.typesMod

import typings.webpackEnv.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientStoryApi[StoryFnReturnType] extends StObject {
  
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
  
  def addParameters(parameter: Parameters): StoryApi[StoryFnReturnType]
  
  def storiesOf(
    kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any,
    module: NodeModule
  ): StoryApi[StoryFnReturnType]
}
object ClientStoryApi {
  
  inline def apply[StoryFnReturnType](
    addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
    addParameters: Parameters => StoryApi[StoryFnReturnType],
    storiesOf: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any, NodeModule) => StoryApi[StoryFnReturnType]
  ): ClientStoryApi[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
  }
  
  extension [Self <: ClientStoryApi[?], StoryFnReturnType](x: Self & ClientStoryApi[StoryFnReturnType]) {
    
    inline def setAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
    
    inline def setAddParameters(value: Parameters => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
    
    inline def setStoriesOf(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any, NodeModule) => StoryApi[StoryFnReturnType]
    ): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
  }
}
