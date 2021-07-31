package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalLocation extends StObject {
  
  /**
    * The address of the location.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * The location of the artifact.
    */
  var artifactLocation: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * Specifies a portion of the artifact that encloses the region. Allows a viewer to display additional context
    * around the region.
    */
  var contextRegion: js.UndefOr[Region] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the physical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * Specifies a portion of the artifact.
    */
  var region: js.UndefOr[Region] = js.undefined
}
object PhysicalLocation {
  
  @scala.inline
  def apply(): PhysicalLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalLocation]
  }
  
  @scala.inline
  implicit class PhysicalLocationMutableBuilder[Self <: PhysicalLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setArtifactLocation(value: ArtifactLocation): Self = StObject.set(x, "artifactLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactLocationUndefined: Self = StObject.set(x, "artifactLocation", js.undefined)
    
    @scala.inline
    def setContextRegion(value: Region): Self = StObject.set(x, "contextRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRegionUndefined: Self = StObject.set(x, "contextRegion", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
