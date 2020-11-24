package typings.pulumiPulumi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Urn extends js.Object {
  
  var urn: String = js.native
}
object Urn {
  
  @scala.inline
  def apply(urn: String): Urn = {
    val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urn]
  }
  
  @scala.inline
  implicit class UrnOps[Self <: Urn] (val x: Self) extends AnyVal {
    
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
    def setUrn(value: String): Self = this.set("urn", value.asInstanceOf[js.Any])
  }
}
