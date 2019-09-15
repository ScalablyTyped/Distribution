package typings.reactDashNativeDashVectorDashIcons.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNativeDashVectorDashIcons.entypoMod.defaultNs.ToolbarAndroid
import typings.reactDashNativeDashVectorDashIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object defaultNsToolbarAndroid
  extends ExternalComponentWithAttributesWithRefType[tag.type, ToolbarAndroid] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNativeDashVectorDashIcons.entypoMod.defaultNs.ToolbarAndroid].asInstanceOf[String | js.Object]
  def apply(
    iconColor: String,
    iconSize: Double,
    logoName: String,
    navIconName: String,
    overflowIconName: String
  ): BuildingComponent[tag.type, ToolbarAndroid] = {
    val __obj = js.Dynamic.literal(iconColor = iconColor, iconSize = iconSize, logoName = logoName, navIconName = navIconName, overflowIconName = overflowIconName)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToolbarAndroidProps
}

