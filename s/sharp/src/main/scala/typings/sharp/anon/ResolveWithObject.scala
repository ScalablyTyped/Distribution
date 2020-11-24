package typings.sharp.anon

import typings.sharp.sharpBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveWithObject extends js.Object {
  
  var resolveWithObject: `false` = js.native
}
object ResolveWithObject {
  
  @scala.inline
  def apply(resolveWithObject: `false`): ResolveWithObject = {
    val __obj = js.Dynamic.literal(resolveWithObject = resolveWithObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveWithObject]
  }
  
  @scala.inline
  implicit class ResolveWithObjectOps[Self <: ResolveWithObject] (val x: Self) extends AnyVal {
    
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
    def setResolveWithObject(value: `false`): Self = this.set("resolveWithObject", value.asInstanceOf[js.Any])
  }
}
