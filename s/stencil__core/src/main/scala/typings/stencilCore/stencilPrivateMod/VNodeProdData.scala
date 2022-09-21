package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNodeProdData
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `class`: js.UndefOr[StringDictionary[Boolean] | String] = js.undefined
  
  var className: js.UndefOr[StringDictionary[Boolean] | String] = js.undefined
  
  var key: js.UndefOr[String | Double] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
}
object VNodeProdData {
  
  inline def apply(): VNodeProdData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeProdData]
  }
  
  extension [Self <: VNodeProdData](x: Self) {
    
    inline def setClass(value: StringDictionary[Boolean] | String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: StringDictionary[Boolean] | String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
