package typings.reactVis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: Double | StringDictionary[Any]
  
  var target: Double | StringDictionary[Any]
}
object Source {
  
  inline def apply(source: Double | StringDictionary[Any], target: Double | StringDictionary[Any]): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setSource(value: Double | StringDictionary[Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Double | StringDictionary[Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
