package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
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
  implicit class RefreshControlPropsAndroidMutableBuilder[Self <: RefreshControlPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[ColorValue]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: ColorValue*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setProgressBackgroundColor(value: ColorValue): Self = StObject.set(x, "progressBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBackgroundColorUndefined: Self = StObject.set(x, "progressBackgroundColor", js.undefined)
    
    @scala.inline
    def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
