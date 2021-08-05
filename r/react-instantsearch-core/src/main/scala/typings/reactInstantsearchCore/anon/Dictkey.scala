package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* widgetId */ StringDictionary[js.Any] {
  
  var aroundLatLng: Boolean
}
object Dictkey {
  
  inline def apply(aroundLatLng: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setAroundLatLng(value: Boolean): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
  }
}
