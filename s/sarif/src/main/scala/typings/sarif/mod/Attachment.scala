package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
  /**
    * The location of the attachment.
    */
  var artifactLocation: ArtifactLocation = js.native
  
  /**
    * A message describing the role played by the attachment.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the attachment.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of rectangles specifying areas of interest within the image.
    */
  var rectangles: js.UndefOr[js.Array[Rectangle]] = js.native
  
  /**
    * An array of regions of interest within the attachment.
    */
  var regions: js.UndefOr[js.Array[Region]] = js.native
}
object Attachment {
  
  @scala.inline
  def apply(artifactLocation: ArtifactLocation): Attachment = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactLocation(value: ArtifactLocation): Self = StObject.set(x, "artifactLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRectangles(value: js.Array[Rectangle]): Self = StObject.set(x, "rectangles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectanglesUndefined: Self = StObject.set(x, "rectangles", js.undefined)
    
    @scala.inline
    def setRectanglesVarargs(value: Rectangle*): Self = StObject.set(x, "rectangles", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
