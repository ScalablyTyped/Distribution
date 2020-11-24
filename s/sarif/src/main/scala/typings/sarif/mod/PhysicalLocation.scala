package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicalLocation extends js.Object {
  
  /**
    * The address of the location.
    */
  var address: js.UndefOr[Address] = js.native
  
  /**
    * The location of the artifact.
    */
  var artifactLocation: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * Specifies a portion of the artifact that encloses the region. Allows a viewer to display additional context
    * around the region.
    */
  var contextRegion: js.UndefOr[Region] = js.native
  
  /**
    * Key/value pairs that provide additional information about the physical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * Specifies a portion of the artifact.
    */
  var region: js.UndefOr[Region] = js.native
}
object PhysicalLocation {
  
  @scala.inline
  def apply(): PhysicalLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalLocation]
  }
  
  @scala.inline
  implicit class PhysicalLocationOps[Self <: PhysicalLocation] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setArtifactLocation(value: ArtifactLocation): Self = this.set("artifactLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactLocation: Self = this.set("artifactLocation", js.undefined)
    
    @scala.inline
    def setContextRegion(value: Region): Self = this.set("contextRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextRegion: Self = this.set("contextRegion", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
