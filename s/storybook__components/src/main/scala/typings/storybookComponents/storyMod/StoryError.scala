package typings.storybookComponents.storyMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoryError extends js.Object
@JSImport("@storybook/components/dist/blocks/Story", "StoryError")
@js.native
object StoryError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StoryError with String] = js.native
  
  @js.native
  sealed trait NO_STORY extends StoryError
  /* "No component or story to display" */ @js.native
  object NO_STORY extends TopLevel[NO_STORY with String]
}
