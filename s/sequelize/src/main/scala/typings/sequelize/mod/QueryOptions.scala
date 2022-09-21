package typings.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for query options
  *
  * @see Options
  */
trait QueryOptions
  extends StObject
     with SearchPathOptions
     with ReturningOptions {
  
  /**
    * Either an object of named bind parameter in the format `$param` or an array of unnamed
    * bind parameter to replace `$1`, `$2`, ... in your SQL.
    */
  var bind: js.UndefOr[js.Object | js.Array[String]] = js.undefined
  
  // TODO: force, cascade
  var fieldMap: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A sequelize instance used to build the return instance
    */
  var instance: js.UndefOr[Instance[Any]] = js.undefined
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Map returned fields to model's fields if `options.model` or `options.instance` is present.
    * Mapping will occur before building the model instance.
    */
  var mapToModel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A sequelize model used to build the returned model instances (used to be called callee)
    */
  var model: js.UndefOr[Model[Any, Any, Any]] = js.undefined
  
  /**
    * If true, transforms objects with `.` separated property names into nested objects using
    * [dottie.js](https://github.com/mickhansen/dottie.js). For example { 'user.username': 'john' } becomes
    * { user: { username: 'john' }}. When `nest` is true, the query type is assumed to be `'SELECT'`,
    * unless otherwise specified
    *
    * Defaults to false
    */
  var nest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the query type to `SELECT` and return a single row
    */
  var plain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, sequelize will not try to format the results of the query, or build an instance of a model from
    * the result
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either an object of named parameter replacements in the format `:param` or an array of unnamed
    * replacements to replace `?` in your SQL.
    */
  var replacements: js.UndefOr[js.Object | js.Array[String]] = js.undefined
  
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.undefined
  
  /**
    * If false do not prepend the query with the search_path (Postgres only)
    */
  var supportsSearchPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of query you are executing. The query type affects how results are formatted before they are
    * passed back. The type is a string, but `Sequelize.QueryTypes` is provided as convenience shortcuts.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Force the query to use the write pool, regardless of the query type.
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  extension [Self <: QueryOptions](x: Self) {
    
    inline def setBind(value: js.Object | js.Array[String]): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setBindVarargs(value: String*): Self = StObject.set(x, "bind", js.Array(value*))
    
    inline def setFieldMap(value: StringDictionary[String]): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
    
    inline def setFieldMapUndefined: Self = StObject.set(x, "fieldMap", js.undefined)
    
    inline def setInstance(value: Instance[Any]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMapToModel(value: Boolean): Self = StObject.set(x, "mapToModel", value.asInstanceOf[js.Any])
    
    inline def setMapToModelUndefined: Self = StObject.set(x, "mapToModel", js.undefined)
    
    inline def setModel(value: Model[Any, Any, Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNest(value: Boolean): Self = StObject.set(x, "nest", value.asInstanceOf[js.Any])
    
    inline def setNestUndefined: Self = StObject.set(x, "nest", js.undefined)
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReplacements(value: js.Object | js.Array[String]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
    
    inline def setReplacementsUndefined: Self = StObject.set(x, "replacements", js.undefined)
    
    inline def setReplacementsVarargs(value: String*): Self = StObject.set(x, "replacements", js.Array(value*))
    
    inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSupportsSearchPath(value: Boolean): Self = StObject.set(x, "supportsSearchPath", value.asInstanceOf[js.Any])
    
    inline def setSupportsSearchPathUndefined: Self = StObject.set(x, "supportsSearchPath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseMaster(value: Boolean): Self = StObject.set(x, "useMaster", value.asInstanceOf[js.Any])
    
    inline def setUseMasterUndefined: Self = StObject.set(x, "useMaster", js.undefined)
  }
}
