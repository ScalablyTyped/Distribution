package typings.stamplayJsSdk.Stamplay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StamplayObject extends js.Object {
  
  var Collection: js.Any = js.native
  
  var Model: typings.stamplayJsSdk.Stamplay.Model = js.native
}
object StamplayObject {
  
  @scala.inline
  def apply(Collection: js.Any, Model: Model): StamplayObject = {
    val __obj = js.Dynamic.literal(Collection = Collection.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any])
    __obj.asInstanceOf[StamplayObject]
  }
  
  @scala.inline
  implicit class StamplayObjectOps[Self <: StamplayObject] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: js.Any): Self = this.set("Collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: Model): Self = this.set("Model", value.asInstanceOf[js.Any])
  }
}
