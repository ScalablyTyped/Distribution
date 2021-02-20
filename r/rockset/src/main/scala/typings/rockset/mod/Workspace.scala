package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspace extends StObject {
  
  // number of collections that are immediate children of workspace
  var collection_count: js.UndefOr[Double] = js.native
  
  // ISO-8601 date of when workspace was created
  var created_at: js.UndefOr[String] = js.native
  
  // email of user who created the workspace
  var created_by: js.UndefOr[String] = js.native
  
  // longer explanation for the workspace
  var description: js.UndefOr[String] = js.native
  
  // descriptive label and unique identifier
  var name: js.UndefOr[String] = js.native
}
object Workspace {
  
  @scala.inline
  def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  
  @scala.inline
  implicit class WorkspaceMutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_count(value: Double): Self = StObject.set(x, "collection_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_countUndefined: Self = StObject.set(x, "collection_count", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
