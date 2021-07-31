package typings.reactNativeElements.mod

import typings.reactNativeElements.reactNativeElementsStrings.android
import typings.reactNativeElements.reactNativeElementsStrings.default
import typings.reactNativeElements.reactNativeElementsStrings.ios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarWrapper extends StObject {
  
  /**
    * What style of search bar to display
    *
    * @default is 'default
    */
  var platform: js.UndefOr[default | ios | android] = js.undefined
}
object SearchBarWrapper {
  
  @scala.inline
  def apply(): SearchBarWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarWrapper]
  }
  
  @scala.inline
  implicit class SearchBarWrapperMutableBuilder[Self <: SearchBarWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: default | ios | android): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
