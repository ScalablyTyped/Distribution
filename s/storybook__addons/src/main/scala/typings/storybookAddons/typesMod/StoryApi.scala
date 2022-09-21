package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryApi[StoryFnReturnType]
  extends StObject
     with /* k */ StringDictionary[String | ClientApiReturnFn[StoryFnReturnType]] {
  
  def add(
    storyName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
    storyFn: StoryFn[StoryFnReturnType]
  ): StoryApi[StoryFnReturnType] = js.native
  def add(
    storyName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
    storyFn: StoryFn[StoryFnReturnType],
    parameters: Parameters
  ): StoryApi[StoryFnReturnType] = js.native
  
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  
  def addLoader(decorator: LoaderFunction): StoryApi[StoryFnReturnType] = js.native
  
  def addParameters(parameters: Parameters): StoryApi[StoryFnReturnType] = js.native
  
  var kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any = js.native
}
