package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.locale
import typings.reactNativeNavigation.reactNativeNavigationStrings.ltr
import typings.reactNativeNavigation.reactNativeNavigationStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsLayout extends js.Object {
  
  /**
    * Controls the application's preferred home indicator auto-hiding.
    * #### (iOS specific)
    */
  var autoHideHomeIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the screen background color
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * Set background color only for components, helps reduce overdraw if background color is set in default options.
    * #### (Android specific)
    */
  var componentBackgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * Set language direction.
    * only works with DefaultOptions
    */
  var direction: js.UndefOr[rtl | ltr | locale] = js.native
  
  var fitSystemWindows: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the allowed orientations
    */
  var orientation: js.UndefOr[js.Array[LayoutOrientation]] = js.native
  
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.native
}
object OptionsLayout {
  
  @scala.inline
  def apply(): OptionsLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsLayout]
  }
  
  @scala.inline
  implicit class OptionsLayoutOps[Self <: OptionsLayout] (val x: Self) extends AnyVal {
    
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
    def setAutoHideHomeIndicator(value: Boolean): Self = this.set("autoHideHomeIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideHomeIndicator: Self = this.set("autoHideHomeIndicator", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setComponentBackgroundColor(value: Color): Self = this.set("componentBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentBackgroundColor: Self = this.set("componentBackgroundColor", js.undefined)
    
    @scala.inline
    def setDirection(value: rtl | ltr | locale): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFitSystemWindows(value: Boolean): Self = this.set("fitSystemWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitSystemWindows: Self = this.set("fitSystemWindows", js.undefined)
    
    @scala.inline
    def setOrientationVarargs(value: LayoutOrientation*): Self = this.set("orientation", js.Array(value :_*))
    
    @scala.inline
    def setOrientation(value: js.Array[LayoutOrientation]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
  }
}
