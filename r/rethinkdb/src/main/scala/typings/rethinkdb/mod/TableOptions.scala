package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends js.Object {
  
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
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache_size(value: Double): Self = this.set("cache_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache_size: Self = this.set("cache_size", js.undefined)
    
    @scala.inline
    def setDatacenter(value: String): Self = this.set("datacenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatacenter: Self = this.set("datacenter", js.undefined)
    
    @scala.inline
    def setDurability(value: String): Self = this.set("durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurability: Self = this.set("durability", js.undefined)
    
    @scala.inline
    def setPrimary_key(value: String): Self = this.set("primary_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary_key: Self = this.set("primary_key", js.undefined)
  }
}
