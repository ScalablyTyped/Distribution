package typings.storybookApi.anon

import typings.storybookApi.refsMod.ComposedRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends js.Object {
  
  var ref: ComposedRef = js.native
  
  var refId: String = js.native
  
  var source: String = js.native
  
  var sourceLocation: String = js.native
  
  var sourceType: String = js.native
  
  var `type`: String = js.native
}
object Ref {
  
  @scala.inline
  def apply(
    ref: ComposedRef,
    refId: String,
    source: String,
    sourceLocation: String,
    sourceType: String,
    `type`: String
  ): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefOps[Self <: Ref] (val x: Self) extends AnyVal {
    
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
    def setRef(value: ComposedRef): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: String): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
