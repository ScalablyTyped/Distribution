package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementSourceInfo
  extends StObject
     with SourceInfo {
  
  /**
    * Source information for fields which are defined in another file rather then their owning component.
    * If all scalar fields of the component are defined in the same file, the 'scalarsSources' field is undefined.
    */
  var scalarsSources: StringDictionary[js.Array[SourceInfo]]
}
object ElementSourceInfo {
  
  inline def apply(scalarsSources: StringDictionary[js.Array[SourceInfo]]): ElementSourceInfo = {
    val __obj = js.Dynamic.literal(scalarsSources = scalarsSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementSourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementSourceInfo] (val x: Self) extends AnyVal {
    
    inline def setScalarsSources(value: StringDictionary[js.Array[SourceInfo]]): Self = StObject.set(x, "scalarsSources", value.asInstanceOf[js.Any])
  }
}
