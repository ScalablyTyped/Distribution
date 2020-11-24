package typings.reactUid.anon

import typings.reactUid.contextMod.IdSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends js.Object {
  
  var id: Double = js.native
  
  var prefix: String = js.native
  
  var quartz: IdSourceType = js.native
}
object Id {
  
  @scala.inline
  def apply(id: Double, prefix: String, quartz: IdSourceType): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quartz = quartz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartz(value: IdSourceType): Self = this.set("quartz", value.asInstanceOf[js.Any])
  }
}
