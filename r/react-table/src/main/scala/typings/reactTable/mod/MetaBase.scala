package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaBase[D /* <: js.Object */] extends js.Object {
  
  var instance: TableInstance[D] = js.native
  
  var userProps: js.Any = js.native
}
object MetaBase {
  
  @scala.inline
  def apply[D /* <: js.Object */](instance: TableInstance[D], userProps: js.Any): MetaBase[D] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], userProps = userProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaBase[D]]
  }
  
  @scala.inline
  implicit class MetaBaseOps[Self <: MetaBase[_], D /* <: js.Object */] (val x: Self with MetaBase[D]) extends AnyVal {
    
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
    def setInstance(value: TableInstance[D]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProps(value: js.Any): Self = this.set("userProps", value.asInstanceOf[js.Any])
  }
}
