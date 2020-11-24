package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCServer extends js.Object {
  
  var codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any = js.native
}
object SCServer {
  
  @scala.inline
  def apply(
    codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
  ): SCServer = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCServer]
  }
  
  @scala.inline
  implicit class SCServerOps[Self <: SCServer] (val x: Self) extends AnyVal {
    
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
    def setCodec(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
    ): Self = this.set("codec", value.asInstanceOf[js.Any])
  }
}
