package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOptions extends StObject {
  
  // 'soft'
  var cache_size: js.UndefOr[Double] = js.undefined
  
  var datacenter: js.UndefOr[String] = js.undefined
  
  // 'id'
  var durability: js.UndefOr[String] = js.undefined
  
  var primary_key: js.UndefOr[String] = js.undefined
}
object TableOptions {
  
  inline def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  extension [Self <: TableOptions](x: Self) {
    
    inline def setCache_size(value: Double): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    inline def setCache_sizeUndefined: Self = StObject.set(x, "cache_size", js.undefined)
    
    inline def setDatacenter(value: String): Self = StObject.set(x, "datacenter", value.asInstanceOf[js.Any])
    
    inline def setDatacenterUndefined: Self = StObject.set(x, "datacenter", js.undefined)
    
    inline def setDurability(value: String): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    inline def setPrimary_key(value: String): Self = StObject.set(x, "primary_key", value.asInstanceOf[js.Any])
    
    inline def setPrimary_keyUndefined: Self = StObject.set(x, "primary_key", js.undefined)
  }
}
