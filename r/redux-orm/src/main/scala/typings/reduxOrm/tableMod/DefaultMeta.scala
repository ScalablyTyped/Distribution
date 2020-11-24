package typings.reduxOrm.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMeta[MIdType] extends js.Object {
  
  var maxId: Null | Double = js.native
}
object DefaultMeta {
  
  @scala.inline
  def apply[MIdType](): DefaultMeta[MIdType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMeta[MIdType]]
  }
  
  @scala.inline
  implicit class DefaultMetaOps[Self <: DefaultMeta[_], MIdType] (val x: Self with DefaultMeta[MIdType]) extends AnyVal {
    
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
    def setMaxId(value: Double): Self = this.set("maxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIdNull: Self = this.set("maxId", null)
  }
}
