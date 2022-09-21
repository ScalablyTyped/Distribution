package typings.raml1Parser.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: StringDictionary[java.lang.String]
  
  var regexp: js.UndefOr[js.RegExp] = js.undefined
}
object Map {
  
  inline def apply(map: StringDictionary[java.lang.String]): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setMap(value: StringDictionary[java.lang.String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
  }
}
