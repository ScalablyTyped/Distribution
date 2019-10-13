package typings.atStorybookAddons.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryApi[StoryFnReturnType] extends /* k */ StringDictionary[String | ClientApiReturnFn[StoryFnReturnType]] {
  var kind: String = js.native
  def add(storyName: String, storyFn: StoryFn[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  def add(storyName: String, storyFn: StoryFn[StoryFnReturnType], parameters: Parameters): StoryApi[StoryFnReturnType] = js.native
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  def addParameters(parameters: Parameters): StoryApi[StoryFnReturnType] = js.native
}

