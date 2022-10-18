package typings.storybookCoreServer

import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import typings.storybookCoreServer.anon.WorkingDir
import typings.storybookStore.distTs3Dot9TypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsWatchStorySpecifiersMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/watch-story-specifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def watchStorySpecifiers(
    specifiers: js.Array[NormalizedStoriesSpecifier],
    options: WorkingDir,
    onInvalidate: js.Function3[
      /* specifier */ NormalizedStoriesSpecifier, 
      /* path */ Path, 
      /* removed */ Boolean, 
      Unit
    ]
  ): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchStorySpecifiers")(specifiers.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onInvalidate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
}
