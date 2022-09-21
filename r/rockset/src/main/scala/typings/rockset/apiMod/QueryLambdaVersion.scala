package typings.rockset.apiMod

import typings.rockset.apiMod.QueryLambdaVersion.StateEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambdaVersion extends StObject {
  
  /**
    * collections queried by underlying SQL query
    * @type {Array<string>}
    * @memberof QueryLambdaVersion
    */
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ISO-8601 date of when Query Lambda was created
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /**
    * user that created this Query Lambda
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var created_by: js.UndefOr[String] = js.undefined
  
  /**
    * optional description
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Query Lambda name
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Query Lambda SQL query
    * @type {QueryLambdaSql}
    * @memberof QueryLambdaVersion
    */
  var sql: js.UndefOr[QueryLambdaSql] = js.undefined
  
  /**
    * status of this Query Lambda
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var state: js.UndefOr[StateEnum] = js.undefined
  
  /**
    * stats related to this Query Lambda
    * @type {QueryLambdaStats}
    * @memberof QueryLambdaVersion
    */
  var stats: js.UndefOr[QueryLambdaStats] = js.undefined
  
  /**
    * Query Lambda version
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * workspace of this Query Lambda
    * @type {string}
    * @memberof QueryLambdaVersion
    */
  var workspace: js.UndefOr[String] = js.undefined
}
object QueryLambdaVersion {
  
  inline def apply(): QueryLambdaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLambdaVersion]
  }
  
  @js.native
  sealed trait StateEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "QueryLambdaVersion.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateEnum & Double] = js.native
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with StateEnum
    /* 0 */ val ACTIVE: typings.rockset.apiMod.QueryLambdaVersion.StateEnum.ACTIVE & Double = js.native
    
    @js.native
    sealed trait INVALIDSQL
      extends StObject
         with StateEnum
    /* 1 */ val INVALIDSQL: typings.rockset.apiMod.QueryLambdaVersion.StateEnum.INVALIDSQL & Double = js.native
  }
  
  extension [Self <: QueryLambdaVersion](x: Self) {
    
    inline def setCollections(value: js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSql(value: QueryLambdaSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStats(value: QueryLambdaStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
