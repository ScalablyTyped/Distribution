package typings.reactVis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: Double | StringDictionary[js.Any]
  
  var target: Double | StringDictionary[js.Any]
}
object Source {
  
  inline def apply(source: Double | StringDictionary[js.Any], target: Double | StringDictionary[js.Any]): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: Double | StringDictionary[js.Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Double | StringDictionary[js.Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
