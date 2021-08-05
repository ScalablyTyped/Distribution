package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import typings.std.Pick
import typings.std.Record
import typings.storybookAddons.distMod.Addon
import typings.storybookApi.addonsMod.Collection
import typings.storybookApi.addonsMod.Types_
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "ToolRes")
  @js.native
  val ToolRes: FunctionComponent[ToolData & RenderData] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "Toolbar")
  @js.native
  val Toolbar: StyledComponent[
    PropsWithChildren[Shown & (Record[String, js.Any])], 
    Pick[PropsWithChildren[Shown & (Record[String, js.Any])], String], 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "ToolbarComp")
  @js.native
  val ToolbarComp: NamedExoticComponent[ToolData] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "Tools")
  @js.native
  val Tools: NamedExoticComponent[List] = js.native
  
  inline def createTabsTool(tabs: js.Array[Addon]): Addon = ^.asInstanceOf[js.Dynamic].applyDynamic("createTabsTool")(tabs.asInstanceOf[js.Any]).asInstanceOf[Addon]
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "defaultTools")
  @js.native
  val defaultTools: js.Array[Addon] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "defaultToolsExtra")
  @js.native
  val defaultToolsExtra: js.Array[Addon] = js.native
  
  inline def filterTools(
    tools: js.Array[Addon],
    toolsExtra: js.Array[Addon],
    tabs: js.Array[Addon],
    hasViewModeStoryLocationPath: Location
  ): Right = (^.asInstanceOf[js.Dynamic].applyDynamic("filterTools")(tools.asInstanceOf[js.Any], toolsExtra.asInstanceOf[js.Any], tabs.asInstanceOf[js.Any], hasViewModeStoryLocationPath.asInstanceOf[js.Any])).asInstanceOf[Right]
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "fullScreenTool")
  @js.native
  val fullScreenTool: Addon = js.native
  
  inline def getTools(getFn: js.Function1[/* type */ Types_, Collection[js.Any]]): js.Array[Addon] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTools")(getFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Addon]]
  
  inline def getToolsExtra(getFn: js.Function1[/* type */ Types_, Collection[js.Any]]): js.Array[Addon] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToolsExtra")(getFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Addon]]
  
  trait ToolData extends StObject {
    
    var api: API
    
    var isShown: Boolean
    
    var story: Story | Group
    
    var tabs: js.Array[Addon]
  }
  object ToolData {
    
    inline def apply(api: API, isShown: Boolean, story: Story | Group, tabs: js.Array[Addon]): ToolData = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolData]
    }
    
    extension [Self <: ToolData](x: Self) {
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setIsShown(value: Boolean): Self = StObject.set(x, "isShown", value.asInstanceOf[js.Any])
      
      inline def setStory(value: Story | Group): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: js.Array[Addon]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: Addon*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
