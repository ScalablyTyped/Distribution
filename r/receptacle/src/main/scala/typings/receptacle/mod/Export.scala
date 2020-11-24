package typings.receptacle.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Export[T, X] extends js.Object {
  
  var id: Double | String = js.native
  
  var items: js.Array[Items[T] with InternalItemData[T]] = js.native
  
  var lastModified: Date = js.native
  
  var max: js.UndefOr[Double] = js.native
}
object Export {
  
  @scala.inline
  def apply[T, X](id: Double | String, items: js.Array[Items[T] with InternalItemData[T]], lastModified: Date): Export[T, X] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export[T, X]]
  }
  
  @scala.inline
  implicit class ExportOps[Self <: Export[_, _], T, X] (val x: Self with (Export[T, X])) extends AnyVal {
    
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
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: (Items[T] with InternalItemData[T])*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Items[T] with InternalItemData[T]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
  }
}
