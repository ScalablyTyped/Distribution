package typings.storybookAddonBackgrounds

import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withBackgroundMod {
  
  @JSImport("@storybook/addon-backgrounds/dist/decorators/withBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withBackground(StoryFn: StoryFn[js.Any], context: StoryContext): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withBackground")(StoryFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
