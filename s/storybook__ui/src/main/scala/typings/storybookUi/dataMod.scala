package typings.storybookUi

import typings.storybookApi.storiesMod.StoriesHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/data", "DEFAULT_REF_ID")
  @js.native
  val DEFAULT_REF_ID: /* "storybook_internal" */ String = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/data", "collapseAllStories")
  @js.native
  def collapseAllStories(stories: StoriesHash): StoriesHash = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/data", "collapseDocsOnlyStories")
  @js.native
  def collapseDocsOnlyStories(storiesHash: StoriesHash): StoriesHash = js.native
}
