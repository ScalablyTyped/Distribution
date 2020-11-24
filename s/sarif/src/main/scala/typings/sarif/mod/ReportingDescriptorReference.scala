package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingDescriptorReference extends js.Object {
  
  /**
    * A guid that uniquely identifies the descriptor.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * The id of the descriptor.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors,
    * or toolComponent.taxonomyDescriptors, depending on context.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A reference used to locate the toolComponent associated with the descriptor.
    */
  var toolComponent: js.UndefOr[ToolComponentReference] = js.native
}
object ReportingDescriptorReference {
  
  @scala.inline
  def apply(): ReportingDescriptorReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingDescriptorReference]
  }
  
  @scala.inline
  implicit class ReportingDescriptorReferenceOps[Self <: ReportingDescriptorReference] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setToolComponent(value: ToolComponentReference): Self = this.set("toolComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolComponent: Self = this.set("toolComponent", js.undefined)
  }
}
