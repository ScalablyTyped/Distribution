package typings.storybookUi

import typings.storybookApi.storiesMod.StoriesHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/data", "DEFAULT_REF_ID")
  @js.native
  val DEFAULT_REF_ID: /* "storybook_internal" */ String = js.native
  
  inline def collapseAllStories(stories: StoriesHash): StoriesHash = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseAllStories")(stories.asInstanceOf[js.Any]).asInstanceOf[StoriesHash]
  
  inline def collapseDocsOnlyStories(storiesHash: StoriesHash): StoriesHash = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseDocsOnlyStories")(storiesHash.asInstanceOf[js.Any]).asInstanceOf[StoriesHash]
}
