package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import typings.std.Pick
import typings.std.Record
import typings.storybookAddons.distMod.Addon
import typings.storybookApi.mod.API
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import typings.storybookRouter.routerMod.RenderData
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.List
import typings.storybookUi.anon.Location
import typings.storybookUi.anon.Right
import typings.storybookUi.anon.Shown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "ToolRes")
  @js.native
  val ToolRes: FunctionComponent[ToolData with RenderData] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "Toolbar")
  @js.native
  val Toolbar: StyledComponent[
    PropsWithChildren[Shown with (Record[String, _])], 
    Pick[PropsWithChildren[Shown with (Record[String, _])], String], 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "ToolbarComp")
  @js.native
  val ToolbarComp: NamedExoticComponent[ToolData] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "Tools")
  @js.native
  val Tools: NamedExoticComponent[List] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "createTabsTool")
  @js.native
  def createTabsTool(tabs: js.Array[Addon]): Addon = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "defaultTools")
  @js.native
  val defaultTools: js.Array[Addon] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "defaultToolsExtra")
  @js.native
  val defaultToolsExtra: js.Array[Addon] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "filterTools")
  @js.native
  def filterTools(
    tools: js.Array[Addon],
    toolsExtra: js.Array[Addon],
    tabs: js.Array[Addon],
    hasViewModeStoryLocationPath: Location
  ): Right = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "fullScreenTool")
  @js.native
  val fullScreenTool: Addon = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "getToolsExtra")
  @js.native
  def getToolsExtra_getElements(
    getFn: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.API['getElements'] */ js.Any
  ): js.Array[Addon] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "getTools")
  @js.native
  def getTools_getElements(
    getFn: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.API['getElements'] */ js.Any
  ): js.Array[Addon] = js.native
  
  @js.native
  trait ToolData extends StObject {
    
    var api: API = js.native
    
    var isShown: Boolean = js.native
    
    var story: Story | Group = js.native
    
    var tabs: js.Array[Addon] = js.native
  }
  object ToolData {
    
    @scala.inline
    def apply(api: API, isShown: Boolean, story: Story | Group, tabs: js.Array[Addon]): ToolData = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolData]
    }
    
    @scala.inline
    implicit class ToolDataMutableBuilder[Self <: ToolData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsShown(value: Boolean): Self = StObject.set(x, "isShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory(value: Story | Group): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: js.Array[Addon]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: Addon*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
