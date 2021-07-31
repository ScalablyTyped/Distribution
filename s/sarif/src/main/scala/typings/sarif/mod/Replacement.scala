package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replacement extends StObject {
  
  /**
    * The region of the artifact to delete.
    */
  var deletedRegion: Region
  
  /**
    * The content to insert at the location specified by the 'deletedRegion' property.
    */
  var insertedContent: js.UndefOr[ArtifactContent] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the replacement.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object Replacement {
  
  @scala.inline
  def apply(deletedRegion: Region): Replacement = {
    val __obj = js.Dynamic.literal(deletedRegion = deletedRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  
  @scala.inline
  implicit class ReplacementMutableBuilder[Self <: Replacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedRegion(value: Region): Self = StObject.set(x, "deletedRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedContent(value: ArtifactContent): Self = StObject.set(x, "insertedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedContentUndefined: Self = StObject.set(x, "insertedContent", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
