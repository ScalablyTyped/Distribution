package typings.rmcDashTabs

import typings.rmcDashTabs.libPropsTypeMod.PropsType
import typings.rmcDashTabs.libTabsDotBaseMod.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTabAnimated[S /* <: StateType */, P /* <: PropsType */] extends js.Object {
  var activeTab: /* import warning: ImportType.apply Failed type conversion: S['currentTab'] */ js.Any
  var animated: Boolean
  var goToTab: js.Any
  var instanceId: Double
  var onTabClick: /* import warning: ImportType.apply Failed type conversion: P['onTabClick'] */ js.Any
  var tabBarActiveTextColor: /* import warning: ImportType.apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
  var tabBarBackgroundColor: /* import warning: ImportType.apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
  var tabBarInactiveTextColor: /* import warning: ImportType.apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
  var tabBarPosition: /* import warning: ImportType.apply Failed type conversion: P['tabBarPosition'] */ js.Any
  var tabBarTextStyle: /* import warning: ImportType.apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
  var tabBarUnderlineStyle: /* import warning: ImportType.apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
  var tabs: /* import warning: ImportType.apply Failed type conversion: P['tabs'] */ js.Any
}

object Anon_ActiveTabAnimated {
  @scala.inline
  def apply[S /* <: StateType */, P /* <: PropsType */](
    activeTab: /* import warning: ImportType.apply Failed type conversion: S['currentTab'] */ js.Any,
    animated: Boolean,
    goToTab: js.Any,
    instanceId: Double,
    onTabClick: /* import warning: ImportType.apply Failed type conversion: P['onTabClick'] */ js.Any,
    tabBarActiveTextColor: /* import warning: ImportType.apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any,
    tabBarBackgroundColor: /* import warning: ImportType.apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any,
    tabBarInactiveTextColor: /* import warning: ImportType.apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any,
    tabBarPosition: /* import warning: ImportType.apply Failed type conversion: P['tabBarPosition'] */ js.Any,
    tabBarTextStyle: /* import warning: ImportType.apply Failed type conversion: P['tabBarTextStyle'] */ js.Any,
    tabBarUnderlineStyle: /* import warning: ImportType.apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any,
    tabs: /* import warning: ImportType.apply Failed type conversion: P['tabs'] */ js.Any
  ): Anon_ActiveTabAnimated[S, P] = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, goToTab = goToTab, instanceId = instanceId, onTabClick = onTabClick, tabBarActiveTextColor = tabBarActiveTextColor, tabBarBackgroundColor = tabBarBackgroundColor, tabBarInactiveTextColor = tabBarInactiveTextColor, tabBarPosition = tabBarPosition, tabBarTextStyle = tabBarTextStyle, tabBarUnderlineStyle = tabBarUnderlineStyle, tabs = tabs)
  
    __obj.asInstanceOf[Anon_ActiveTabAnimated[S, P]]
  }
}

