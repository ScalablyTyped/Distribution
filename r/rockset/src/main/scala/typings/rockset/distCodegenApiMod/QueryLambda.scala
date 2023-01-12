package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambda extends StObject {
  
  /**
    * collections queried by underlying SQL query
    * @type {Array<string>}
    * @memberof QueryLambda
    */
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ISO-8601 date of when Query Lambda was last updated
    * @type {string}
    * @memberof QueryLambda
    */
  var last_updated: js.UndefOr[String] = js.undefined
  
  /**
    * user that created this Query Lambda
    * @type {string}
    * @memberof QueryLambda
    */
  var last_updated_by: js.UndefOr[String] = js.undefined
  
  /**
    * Query Lambda name
    * @type {string}
    * @memberof QueryLambda
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * number of Query Lambda versions
    * @type {number}
    * @memberof QueryLambda
    */
  var version_count: js.UndefOr[Double] = js.undefined
  
  /**
    * workspace of this Query Lambda
    * @type {string}
    * @memberof QueryLambda
    */
  var workspace: js.UndefOr[String] = js.undefined
}
object QueryLambda {
  
  inline def apply(): QueryLambda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLambda]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryLambda] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setLast_updated(value: String): Self = StObject.set(x, "last_updated", value.asInstanceOf[js.Any])
    
    inline def setLast_updatedUndefined: Self = StObject.set(x, "last_updated", js.undefined)
    
    inline def setLast_updated_by(value: String): Self = StObject.set(x, "last_updated_by", value.asInstanceOf[js.Any])
    
    inline def setLast_updated_byUndefined: Self = StObject.set(x, "last_updated_by", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion_count(value: Double): Self = StObject.set(x, "version_count", value.asInstanceOf[js.Any])
    
    inline def setVersion_countUndefined: Self = StObject.set(x, "version_count", js.undefined)
    
    inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
