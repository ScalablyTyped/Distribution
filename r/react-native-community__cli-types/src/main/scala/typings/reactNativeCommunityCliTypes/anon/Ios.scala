package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ios extends StObject {
  
  var ios: js.UndefOr[SourceDir] = js.undefined
}
object Ios {
  
  inline def apply(): Ios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ios]
  }
  
  extension [Self <: Ios](x: Self) {
    
    inline def setIos(value: SourceDir): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
