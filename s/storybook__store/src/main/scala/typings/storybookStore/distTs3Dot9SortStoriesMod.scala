package typings.storybookStore

import typings.std.Parameters
import typings.storybookAddons.distTs3Dot9TypesMod.StorySortParameter
import typings.storybookAddons.distTs3Dot9TypesMod.StorySortParameterV7
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.Story
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndexEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9SortStoriesMod {
  
  @JSImport("@storybook/store/dist/ts3.9/sortStories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sortStoriesV6(
    stories: js.Array[
      js.Tuple4[
        String, 
        Story[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
        ], 
        Parameters[js.Function1[/* args */ Any, Any]], 
        Parameters[js.Function1[/* args */ Any, Any]]
      ]
    ],
    storySortParameter: StorySortParameter,
    fileNameOrder: js.Array[Path]
  ): js.Array[StoryIndexEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortStoriesV6")(stories.asInstanceOf[js.Any], storySortParameter.asInstanceOf[js.Any], fileNameOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[StoryIndexEntry]]
  
  inline def sortStoriesV7(
    stories: js.Array[StoryIndexEntry],
    storySortParameter: StorySortParameterV7,
    fileNameOrder: js.Array[Path]
  ): js.Array[StoryIndexEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortStoriesV7")(stories.asInstanceOf[js.Any], storySortParameter.asInstanceOf[js.Any], fileNameOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[StoryIndexEntry]]
}
