package typings.storybookApi.eventsMod

import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.storybookApiStrings.external
import typings.storybookApi.storybookApiStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  
  var ref: js.UndefOr[ComposedRef] = js.native
  
  var refId: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sourceLocation: js.UndefOr[String] = js.native
  
  var sourceType: js.UndefOr[local | external] = js.native
  
  var `type`: String = js.native
  
  var v: js.UndefOr[Double] = js.native
}
object Meta {
  
  @scala.inline
  def apply(`type`: String): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: ComposedRef): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: String): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    
    @scala.inline
    def setSourceType(value: local | external): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
}
