package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseStory[Args, StoryFnReturnType] extends StObject {
  
  def apply(args: Args, context: StoryContext): StoryFnReturnType = js.native
  
  /**
    * Override the display name in the UI
    */
  var storyName: js.UndefOr[String] = js.native
}
