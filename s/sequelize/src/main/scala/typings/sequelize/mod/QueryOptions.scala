package typings.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for query options
  *
  * @see Options
  */
@js.native
trait QueryOptions
  extends SearchPathOptions
     with ReturningOptions {
  
  /**
    * Either an object of named bind parameter in the format `$param` or an array of unnamed
    * bind parameter to replace `$1`, `$2`, ... in your SQL.
    */
  var bind: js.UndefOr[js.Object | js.Array[String]] = js.native
  
  // TODO: force, cascade
  var fieldMap: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A sequelize instance used to build the return instance
    */
  var instance: js.UndefOr[Instance[_]] = js.native
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Map returned fields to model's fields if `options.model` or `options.instance` is present.
    * Mapping will occur before building the model instance.
    */
  var mapToModel: js.UndefOr[Boolean] = js.native
  
  /**
    * A sequelize model used to build the returned model instances (used to be called callee)
    */
  var model: js.UndefOr[Model[_, _, _]] = js.native
  
  /**
    * If true, transforms objects with `.` separated property names into nested objects using
    * [dottie.js](https://github.com/mickhansen/dottie.js). For example { 'user.username': 'john' } becomes
    * { user: { username: 'john' }}. When `nest` is true, the query type is assumed to be `'SELECT'`,
    * unless otherwise specified
    *
    * Defaults to false
    */
  var nest: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the query type to `SELECT` and return a single row
    */
  var plain: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, sequelize will not try to format the results of the query, or build an instance of a model from
    * the result
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * Either an object of named parameter replacements in the format `:param` or an array of unnamed
    * replacements to replace `?` in your SQL.
    */
  var replacements: js.UndefOr[js.Object | js.Array[String]] = js.native
  
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.native
  
  /**
    * If false do not prepend the query with the search_path (Postgres only)
    */
  var supportsSearchPath: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of query you are executing. The query type affects how results are formatted before they are
    * passed back. The type is a string, but `Sequelize.QueryTypes` is provided as convenience shortcuts.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Force the query to use the write pool, regardless of the query type.
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
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
    def setBindVarargs(value: String*): Self = this.set("bind", js.Array(value :_*))
    
    @scala.inline
    def setBind(value: js.Object | js.Array[String]): Self = this.set("bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    
    @scala.inline
    def setFieldMap(value: StringDictionary[String]): Self = this.set("fieldMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMap: Self = this.set("fieldMap", js.undefined)
    
    @scala.inline
    def setInstance(value: Instance[_]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMapToModel(value: Boolean): Self = this.set("mapToModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapToModel: Self = this.set("mapToModel", js.undefined)
    
    @scala.inline
    def setModel(value: Model[_, _, _]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNest(value: Boolean): Self = this.set("nest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNest: Self = this.set("nest", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReplacementsVarargs(value: String*): Self = this.set("replacements", js.Array(value :_*))
    
    @scala.inline
    def setReplacements(value: js.Object | js.Array[String]): Self = this.set("replacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacements: Self = this.set("replacements", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setSupportsSearchPath(value: Boolean): Self = this.set("supportsSearchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsSearchPath: Self = this.set("supportsSearchPath", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseMaster(value: Boolean): Self = this.set("useMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMaster: Self = this.set("useMaster", js.undefined)
  }
}
