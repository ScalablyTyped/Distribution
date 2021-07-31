package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarPlatform
  extends StObject
     with SearchBarBase {
  
  /**
    * Callback fired when the cancel button is pressed
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SearchBarPlatform {
  
  @scala.inline
  def apply(): SearchBarPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarPlatform]
  }
  
  @scala.inline
  implicit class SearchBarPlatformMutableBuilder[Self <: SearchBarPlatform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
  }
}
