package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overscroll extends StObject {
  
  var overscroll: js.UndefOr[Boolean] = js.undefined
}
object Overscroll {
  
  inline def apply(): Overscroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overscroll]
  }
  
  extension [Self <: Overscroll](x: Self) {
    
    inline def setOverscroll(value: Boolean): Self = StObject.set(x, "overscroll", value.asInstanceOf[js.Any])
    
    inline def setOverscrollUndefined: Self = StObject.set(x, "overscroll", js.undefined)
  }
}
