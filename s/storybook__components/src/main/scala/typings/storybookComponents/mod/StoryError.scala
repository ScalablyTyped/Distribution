package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoryError extends StObject
@JSImport("@storybook/components", "StoryError")
@js.native
object StoryError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StoryError & String] = js.native
  
  @js.native
  sealed trait NO_STORY
    extends StObject
       with StoryError
  /* "No component or story to display" */ val NO_STORY: typings.storybookComponents.mod.StoryError.NO_STORY & String = js.native
}
