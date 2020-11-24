package typings.storybookUi

import typings.storybookApi.storiesMod.StoriesHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/data", JSImport.Namespace)
@js.native
object dataMod extends js.Object {
  
  val DEFAULT_REF_ID: /* "storybook_internal" */ String = js.native
  
  def collapseAllStories(stories: StoriesHash): StoriesHash = js.native
  
  def collapseDocsOnlyStories(storiesHash: StoriesHash): StoriesHash = js.native
}
