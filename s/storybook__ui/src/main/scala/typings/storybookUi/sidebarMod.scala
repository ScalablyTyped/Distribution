package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.std.Error
import typings.storybookApi.storiesMod.StoriesHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar", "Sidebar")
  @js.native
  val Sidebar: FunctionComponent[SidebarProps] = js.native
  
  @js.native
  trait SidebarProps extends StObject {
    
    var enableShortcuts: js.UndefOr[Boolean] = js.native
    
    var menu: js.Array[_] = js.native
    
    var menuHighlighted: js.UndefOr[Boolean] = js.native
    
    var refId: js.UndefOr[String] = js.native
    
    var refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any = js.native
    
    var stories: StoriesHash = js.native
    
    var storiesConfigured: Boolean = js.native
    
    var storiesFailed: js.UndefOr[Error] = js.native
    
    var storyId: js.UndefOr[String] = js.native
  }
  object SidebarProps {
    
    @scala.inline
    def apply(
      menu: js.Array[_],
      refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any,
      stories: StoriesHash,
      storiesConfigured: Boolean
    ): SidebarProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit class SidebarPropsMutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableShortcuts(value: Boolean): Self = StObject.set(x, "enableShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableShortcutsUndefined: Self = StObject.set(x, "enableShortcuts", js.undefined)
      
      @scala.inline
      def setMenu(value: js.Array[_]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHighlighted(value: Boolean): Self = StObject.set(x, "menuHighlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHighlightedUndefined: Self = StObject.set(x, "menuHighlighted", js.undefined)
      
      @scala.inline
      def setMenuVarargs(value: js.Any*): Self = StObject.set(x, "menu", js.Array(value :_*))
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setRefs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any
      ): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStories(value: StoriesHash): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesFailed(value: Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
    }
  }
}
