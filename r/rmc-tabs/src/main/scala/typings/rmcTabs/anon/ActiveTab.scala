package typings.rmcTabs.anon

import typings.rmcTabs.propsTypeMod.PropsType
import typings.rmcTabs.tabsBaseMod.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTab[S /* <: StateType */, P /* <: PropsType */] extends js.Object {
  var activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any
  var animated: Boolean
  var goToTab: js.Any
  var instanceId: Double
  var onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any
  var tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
  var tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
  var tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
  var tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any
  var tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
  var tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
  var tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any
}

object ActiveTab {
  @scala.inline
  def apply[/* <: typings.rmcTabs.tabsBaseMod.StateType */ S, /* <: typings.rmcTabs.propsTypeMod.PropsType */ P](
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
}

