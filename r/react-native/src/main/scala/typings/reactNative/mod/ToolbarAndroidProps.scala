package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarAndroidProps
  extends StObject
     with ViewProps {
  
  /**
    * Sets possible actions on the toolbar as part of the action menu. These are displayed as icons
    * or text on the right side of the widget. If they don't fit they are placed in an 'overflow'
    * menu.
    *
    * This property takes an array of objects, where each object has the following keys:
    *
    * * `title`: **required**, the title of this action
    * * `icon`: the icon for this action, e.g. `require('./some_icon.png')`
    * * `show`: when to show this action as an icon or hide it in the overflow menu: `always`,
    * `ifRoom` or `never`
    * * `showWithText`: boolean, whether to show text alongside the icon or not
    */
  var actions: js.UndefOr[js.Array[ToolbarAndroidAction]] = js.undefined
  
  /**
    * Sets the content inset for the toolbar ending edge.
    * The content inset affects the valid area for Toolbar content other
    * than the navigation button and menu. Insets define the minimum
    * margin for these components and can be used to effectively align
    * Toolbar content along well-known gridlines.
    */
  var contentInsetEnd: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the content inset for the toolbar starting edge.
    * The content inset affects the valid area for Toolbar content
    * other than the navigation button and menu. Insets define the
    * minimum margin for these components and can be used to effectively
    * align Toolbar content along well-known gridlines.
    */
  var contentInsetStart: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the toolbar logo.
    */
  var logo: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * Sets the navigation icon.
    */
  var navIcon: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * Callback that is called when an action is selected. The only
    * argument that is passed to the callback is the position of the
    * action in the actions array.
    */
  var onActionSelected: js.UndefOr[js.Function1[/* position */ Double, Unit]] = js.undefined
  
  /**
    * Callback called when the icon is selected.
    */
  var onIconClicked: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Sets the overflow icon.
    */
  var overflowIcon: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * Used to set the toolbar direction to RTL.
    * In addition to this property you need to add
    * android:supportsRtl="true"
    * to your application AndroidManifest.xml and then call
    * setLayoutDirection(LayoutDirection.RTL) in your MainActivity
    * onCreate method.
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the toolbar subtitle.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the toolbar subtitle color.
    */
  var subtitleColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Sets the toolbar title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the toolbar title color.
    */
  var titleColor: js.UndefOr[ColorValue] = js.undefined
}
object ToolbarAndroidProps {
  
  inline def apply(): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
  
  extension [Self <: ToolbarAndroidProps](x: Self) {
    
    inline def setActions(value: js.Array[ToolbarAndroidAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: ToolbarAndroidAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setContentInsetEnd(value: Double): Self = StObject.set(x, "contentInsetEnd", value.asInstanceOf[js.Any])
    
    inline def setContentInsetEndUndefined: Self = StObject.set(x, "contentInsetEnd", js.undefined)
    
    inline def setContentInsetStart(value: Double): Self = StObject.set(x, "contentInsetStart", value.asInstanceOf[js.Any])
    
    inline def setContentInsetStartUndefined: Self = StObject.set(x, "contentInsetStart", js.undefined)
    
    inline def setLogo(value: ImageURISource): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setNavIcon(value: ImageURISource): Self = StObject.set(x, "navIcon", value.asInstanceOf[js.Any])
    
    inline def setNavIconUndefined: Self = StObject.set(x, "navIcon", js.undefined)
    
    inline def setOnActionSelected(value: /* position */ Double => Unit): Self = StObject.set(x, "onActionSelected", js.Any.fromFunction1(value))
    
    inline def setOnActionSelectedUndefined: Self = StObject.set(x, "onActionSelected", js.undefined)
    
    inline def setOnIconClicked(value: () => Unit): Self = StObject.set(x, "onIconClicked", js.Any.fromFunction0(value))
    
    inline def setOnIconClickedUndefined: Self = StObject.set(x, "onIconClicked", js.undefined)
    
    inline def setOverflowIcon(value: ImageURISource): Self = StObject.set(x, "overflowIcon", value.asInstanceOf[js.Any])
    
    inline def setOverflowIconUndefined: Self = StObject.set(x, "overflowIcon", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColor(value: ColorValue): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleColor(value: ColorValue): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
