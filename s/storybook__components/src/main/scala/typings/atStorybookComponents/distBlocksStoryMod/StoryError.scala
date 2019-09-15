package typings.atStorybookComponents.distBlocksStoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StoryError extends js.Object

@JSImport("@storybook/components/dist/blocks/Story", "StoryError")
@js.native
object StoryError extends js.Object {
  @js.native
  sealed trait NO_STORY extends StoryError
  
  /* "No component or story to display" */ val NO_STORY: typings.atStorybookComponents.distBlocksStoryMod.StoryError.NO_STORY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StoryError with String] = js.native
}

