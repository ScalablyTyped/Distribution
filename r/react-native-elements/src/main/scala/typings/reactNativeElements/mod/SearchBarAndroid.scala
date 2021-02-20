package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarAndroid extends SearchBarPlatform {
  
  /**
    * Override the cancel Icon props or use a custom component. Use null or false to hide the icon.
    */
  var cancelIcon: js.UndefOr[IconNode] = js.native
}
object SearchBarAndroid {
  
  @scala.inline
  def apply(): SearchBarAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarAndroid]
  }
  
  @scala.inline
  implicit class SearchBarAndroidMutableBuilder[Self <: SearchBarAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelIcon(value: IconNode): Self = StObject.set(x, "cancelIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelIconUndefined: Self = StObject.set(x, "cancelIcon", js.undefined)
  }
}
