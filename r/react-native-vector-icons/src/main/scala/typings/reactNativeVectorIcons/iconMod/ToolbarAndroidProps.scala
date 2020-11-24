package typings.reactNativeVectorIcons.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarAndroidProps
  extends typings.reactNative.mod.ToolbarAndroidProps {
  
  /**
    * Color of the icons
    *
    * @default 'black'
    */
  var iconColor: String = js.native
  
  /**
    * Size of the icons
    *
    * @default 24
    */
  var iconSize: Double = js.native
  
  /**
    * Name of the navigation logo icon
    * (similar to ToolbarAndroid logo)
    *
    */
  var logoName: String = js.native
  
  /**
    * Name of the navigation icon
    * (similar to ToolbarAndroid navIcon)
    *
    */
  var navIconName: String = js.native
  
  /**
    * Name of the overflow icon
    * (similar to ToolbarAndroid overflowIcon)
    *
    */
  var overflowIconName: String = js.native
}
object ToolbarAndroidProps {
  
  @scala.inline
  def apply(
    iconColor: String,
    iconSize: Double,
    logoName: String,
    navIconName: String,
    overflowIconName: String
  ): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
  
  @scala.inline
  implicit class ToolbarAndroidPropsOps[Self <: ToolbarAndroidProps] (val x: Self) extends AnyVal {
    
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
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoName(value: String): Self = this.set("logoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavIconName(value: String): Self = this.set("navIconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowIconName(value: String): Self = this.set("overflowIconName", value.asInstanceOf[js.Any])
  }
}
