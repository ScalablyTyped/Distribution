package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryApi[StoryFnReturnType] extends /* k */ StringDictionary[String | ClientApiReturnFn[StoryFnReturnType]] {
  var kind: String = js.native
  def add(storyName: String, storyFn: StoryFn[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  def add(storyName: String, storyFn: StoryFn[StoryFnReturnType], parameters: Parameters): StoryApi[StoryFnReturnType] = js.native
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  def addParameters(parameters: Parameters): StoryApi[StoryFnReturnType] = js.native
}

