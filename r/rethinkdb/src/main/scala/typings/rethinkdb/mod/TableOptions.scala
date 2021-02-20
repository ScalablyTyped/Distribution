package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends StObject {
  
  // 'soft'
  var cache_size: js.UndefOr[Double] = js.native
  
  var datacenter: js.UndefOr[String] = js.native
  
  // 'id'
  var durability: js.UndefOr[String] = js.native
  
  var primary_key: js.UndefOr[String] = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache_size(value: Double): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache_sizeUndefined: Self = StObject.set(x, "cache_size", js.undefined)
    
    @scala.inline
    def setDatacenter(value: String): Self = StObject.set(x, "datacenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatacenterUndefined: Self = StObject.set(x, "datacenter", js.undefined)
    
    @scala.inline
    def setDurability(value: String): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    @scala.inline
    def setPrimary_key(value: String): Self = StObject.set(x, "primary_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_keyUndefined: Self = StObject.set(x, "primary_key", js.undefined)
  }
}
