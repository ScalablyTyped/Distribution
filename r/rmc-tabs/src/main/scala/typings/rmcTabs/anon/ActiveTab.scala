package typings.rmcTabs.anon

import typings.rmcTabs.propsTypeMod.PropsType
import typings.rmcTabs.tabsBaseMod.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveTab[S /* <: StateType */, P /* <: PropsType */] extends js.Object {
  
  var activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any = js.native
  
  var animated: Boolean = js.native
  
  var goToTab: js.Any = js.native
  
  var instanceId: Double = js.native
  
  var onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any = js.native
  
  var tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any = js.native
  
  var tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any = js.native
  
  var tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any = js.native
  
  var tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any = js.native
  
  var tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any = js.native
  
  var tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any = js.native
  
  var tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any = js.native
}
object ActiveTab {
  
  @scala.inline
  def apply[S /* <: StateType */, P /* <: PropsType */](
    activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any,
    animated: Boolean,
    goToTab: js.Any,
    instanceId: Double,
    onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any,
    tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any,
    tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any,
    tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any,
    tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any,
    tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any,
    tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any,
    tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any
  ): ActiveTab[S, P] = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], onTabClick = onTabClick.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], tabBarTextStyle = tabBarTextStyle.asInstanceOf[js.Any], tabBarUnderlineStyle = tabBarUnderlineStyle.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTab[S, P]]
  }
  
  @scala.inline
  implicit class ActiveTabOps[Self <: ActiveTab[_, _], S /* <: StateType */, P /* <: PropsType */] (val x: Self with (ActiveTab[S, P])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveTab(
      value: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any
    ): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToTab(value: js.Any): Self = this.set("goToTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: Double): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTabClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any
    ): Self = this.set("onTabClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarActiveTextColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
    ): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarBackgroundColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
    ): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarInactiveTextColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
    ): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPosition(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any
    ): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarTextStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
    ): Self = this.set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarUnderlineStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
    ): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabs(value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
