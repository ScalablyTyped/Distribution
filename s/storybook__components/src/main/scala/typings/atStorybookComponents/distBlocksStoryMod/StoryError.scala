package typings.atStorybookComponents.distBlocksStoryMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookComponents.distBlocksStoryMod.StoryError.NO_STORY
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StoryError with String] = js.native
  /* "No component or story to display" */ @js.native
  object NO_STORY extends TopLevel[NO_STORY with String]
  
}

