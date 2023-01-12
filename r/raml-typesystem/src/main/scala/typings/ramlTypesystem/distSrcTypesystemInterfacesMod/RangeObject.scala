package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeObject extends StObject {
  
  var end: MarkerObject
  
  var start: MarkerObject
}
object RangeObject {
  
  inline def apply(end: MarkerObject, start: MarkerObject): RangeObject = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeObject] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: MarkerObject): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: MarkerObject): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
