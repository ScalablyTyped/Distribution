package typings.reactDates.anon

import typings.reactDates.mod.OrientationShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGetNextScrollableMonths extends StObject {
  
  var onGetNextScrollableMonths: js.UndefOr[scala.Nothing] = js.undefined
  
  var onGetPrevScrollableMonths: js.UndefOr[scala.Nothing] = js.undefined
  
  var orientation: js.UndefOr[OrientationShape] = js.undefined
}
object OnGetNextScrollableMonths {
  
  inline def apply(): OnGetNextScrollableMonths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnGetNextScrollableMonths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnGetNextScrollableMonths] (val x: Self) extends AnyVal {
    
    inline def setOrientation(value: OrientationShape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
