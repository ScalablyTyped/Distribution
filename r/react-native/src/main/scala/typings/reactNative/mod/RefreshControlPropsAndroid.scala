package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshControlPropsAndroid extends ViewProps {
  
  /**
    * The colors (at least one) that will be used to draw the refresh indicator.
    */
  var colors: js.UndefOr[js.Array[ColorValue]] = js.native
  
  /**
    * Whether the pull to refresh functionality is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The background color of the refresh indicator.
    */
  var progressBackgroundColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Progress view top offset
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.native
  
  /**
    * Size of the refresh indicator, see RefreshControl.SIZE.
    */
  var size: js.UndefOr[Double] = js.native
}
object RefreshControlPropsAndroid {
  
  @scala.inline
  def apply(): RefreshControlPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshControlPropsAndroid]
  }
  
  @scala.inline
  implicit class RefreshControlPropsAndroidOps[Self <: RefreshControlPropsAndroid] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: ColorValue*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[ColorValue]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setProgressBackgroundColor(value: ColorValue): Self = this.set("progressBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBackgroundColor: Self = this.set("progressBackgroundColor", js.undefined)
    
    @scala.inline
    def setProgressViewOffset(value: Double): Self = this.set("progressViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressViewOffset: Self = this.set("progressViewOffset", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
