package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.std.Error
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.storiesMod.StoriesHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar", "Sidebar")
  @js.native
  val Sidebar: FunctionComponent[SidebarProps] = js.native
  
  trait SidebarProps extends StObject {
    
    var enableShortcuts: js.UndefOr[Boolean] = js.undefined
    
    var menu: js.Array[js.Any]
    
    var menuHighlighted: js.UndefOr[Boolean] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
    
    var refs: Refs
    
    var stories: StoriesHash
    
    var storiesConfigured: Boolean
    
    var storiesFailed: js.UndefOr[Error] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
  }
  object SidebarProps {
    
    inline def apply(menu: js.Array[js.Any], refs: Refs, stories: StoriesHash, storiesConfigured: Boolean): SidebarProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarProps]
    }
    
    extension [Self <: SidebarProps](x: Self) {
      
      inline def setEnableShortcuts(value: Boolean): Self = StObject.set(x, "enableShortcuts", value.asInstanceOf[js.Any])
      
      inline def setEnableShortcutsUndefined: Self = StObject.set(x, "enableShortcuts", js.undefined)
      
      inline def setMenu(value: js.Array[js.Any]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuHighlighted(value: Boolean): Self = StObject.set(x, "menuHighlighted", value.asInstanceOf[js.Any])
      
      inline def setMenuHighlightedUndefined: Self = StObject.set(x, "menuHighlighted", js.undefined)
      
      inline def setMenuVarargs(value: js.Any*): Self = StObject.set(x, "menu", js.Array(value :_*))
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setStories(value: StoriesHash): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailed(value: Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
    }
  }
}
