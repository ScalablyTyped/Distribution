package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshControlPropsIOS extends ViewProps {
  
  /**
    * The color of the refresh indicator.
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The title displayed under the refresh indicator.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Title color.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
}
object RefreshControlPropsIOS {
  
  @scala.inline
  def apply(): RefreshControlPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshControlPropsIOS]
  }
  
  @scala.inline
  implicit class RefreshControlPropsIOSMutableBuilder[Self <: RefreshControlPropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleColor(value: ColorValue): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
