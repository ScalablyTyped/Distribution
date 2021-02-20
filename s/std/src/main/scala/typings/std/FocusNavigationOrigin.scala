package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNavigationOrigin extends StObject {
  
  var originHeight: js.UndefOr[Double] = js.native
  
  var originLeft: js.UndefOr[Double] = js.native
  
  var originTop: js.UndefOr[Double] = js.native
  
  var originWidth: js.UndefOr[Double] = js.native
}
object FocusNavigationOrigin {
  
  @scala.inline
  def apply(): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
  
  @scala.inline
  implicit class FocusNavigationOriginMutableBuilder[Self <: FocusNavigationOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginHeight(value: Double): Self = StObject.set(x, "originHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginHeightUndefined: Self = StObject.set(x, "originHeight", js.undefined)
    
    @scala.inline
    def setOriginLeft(value: Double): Self = StObject.set(x, "originLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginLeftUndefined: Self = StObject.set(x, "originLeft", js.undefined)
    
    @scala.inline
    def setOriginTop(value: Double): Self = StObject.set(x, "originTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginTopUndefined: Self = StObject.set(x, "originTop", js.undefined)
    
    @scala.inline
    def setOriginWidth(value: Double): Self = StObject.set(x, "originWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginWidthUndefined: Self = StObject.set(x, "originWidth", js.undefined)
  }
}
