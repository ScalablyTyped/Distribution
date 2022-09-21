package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.Any
import typings.stencilCore.stencilCoreStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropData extends StObject {
  
  var attr: js.UndefOr[String] = js.undefined
  
  var mutable: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var reflectToAttr: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[
    typings.stencilCore.stencilCoreStrings.Boolean | Number | typings.stencilCore.stencilCoreStrings.String | Any
  ] = js.undefined
  
  var watch: js.UndefOr[js.Array[String]] = js.undefined
}
object PropData {
  
  inline def apply(): PropData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropData]
  }
  
  extension [Self <: PropData](x: Self) {
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setMutable(value: Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReflectToAttr(value: Boolean): Self = StObject.set(x, "reflectToAttr", value.asInstanceOf[js.Any])
    
    inline def setReflectToAttrUndefined: Self = StObject.set(x, "reflectToAttr", js.undefined)
    
    inline def setType(
      value: typings.stencilCore.stencilCoreStrings.Boolean | Number | typings.stencilCore.stencilCoreStrings.String | Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWatch(value: js.Array[String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setWatchVarargs(value: String*): Self = StObject.set(x, "watch", js.Array(value*))
  }
}
