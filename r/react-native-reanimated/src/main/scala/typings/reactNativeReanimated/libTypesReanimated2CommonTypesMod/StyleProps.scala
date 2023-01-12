package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleProps
  extends StObject
     with TextStyle
     with /* key */ StringDictionary[Any] {
  
  var originX: js.UndefOr[Double] = js.undefined
  
  var originY: js.UndefOr[Double] = js.undefined
}
object StyleProps {
  
  inline def apply(): StyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleProps] (val x: Self) extends AnyVal {
    
    inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: Double): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
  }
}
