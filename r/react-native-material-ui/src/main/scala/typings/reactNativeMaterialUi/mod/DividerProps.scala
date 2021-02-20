package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DividerProps extends StObject {
  
  var inset: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[`0`] = js.native
}
object DividerProps {
  
  @scala.inline
  def apply(): DividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerProps]
  }
  
  @scala.inline
  implicit class DividerPropsMutableBuilder[Self <: DividerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setStyle(value: `0`): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
