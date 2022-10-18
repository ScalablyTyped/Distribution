package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  /**
    * number of collections that are immediate children of workspace
    * @type {number}
    * @memberof Workspace
    */
  var collection_count: js.UndefOr[Double] = js.undefined
  
  /**
    * ISO-8601 date of when workspace was created
    * @type {string}
    * @memberof Workspace
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /**
    * email of user who created the workspace
    * @type {string}
    * @memberof Workspace
    */
  var created_by: js.UndefOr[String] = js.undefined
  
  /**
    * longer explanation for the workspace
    * @type {string}
    * @memberof Workspace
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * descriptive label and unique identifier
    * @type {string}
    * @memberof Workspace
    */
  var name: js.UndefOr[String] = js.undefined
}
object Workspace {
  
  inline def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  
  extension [Self <: Workspace](x: Self) {
    
    inline def setCollection_count(value: Double): Self = StObject.set(x, "collection_count", value.asInstanceOf[js.Any])
    
    inline def setCollection_countUndefined: Self = StObject.set(x, "collection_count", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
