package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarProps
  extends StObject
     with StatusBarPropsIOS
     with StatusBarPropsAndroid {
  
  /**
    * If the transition between status bar property changes should be
    * animated. Supported for backgroundColor, barStyle and hidden.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the status bar is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object StatusBarProps {
  
  @scala.inline
  def apply(): StatusBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarProps]
  }
  
  @scala.inline
  implicit class StatusBarPropsMutableBuilder[Self <: StatusBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
