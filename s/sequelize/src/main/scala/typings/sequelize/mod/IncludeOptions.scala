package typings.sequelize.mod

import typings.sequelize.anon.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Complex include options
  */
trait IncludeOptions extends StObject {
  
  var all: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * The alias of the relation, in case the model you want to eagerly load is aliassed. For `hasOne` /
    * `belongsTo`, this should be the singular name, and for `hasMany`, it should be the plural
    */
  var as: js.UndefOr[String] = js.undefined
  
  /**
    * The association you want to eagerly load. (This can be used instead of providing a model/as pair).
    * You can also use the association alias.
    */
  var association: js.UndefOr[IncludeAssociation | String] = js.undefined
  
  /**
    * A list of attributes to select from the child model
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.undefined
  
  /**
    * Load further nested related models
    */
  var include: js.UndefOr[js.Array[(Model[js.Any, js.Any, js.Any]) | IncludeOptions]] = js.undefined
  
  /**
    * The model you want to eagerly load
    */
  var model: js.UndefOr[Model[js.Any, js.Any, js.Any]] = js.undefined
  
  /**
    * if true, it will also eager load the relations of the child models, recursively.
    */
  var nested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, converts to an inner join, which means that the parent model will only be loaded if it has any
    * matching children. True if `include.where` is set, false otherwise.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, runs a separate query to fetch the associated instances, only supported for hasMany associations
    */
  var separate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Through Options
    */
  var through: js.UndefOr[IncludeThroughOptions] = js.undefined
  
  /**
    * Where clauses to apply to the child models. Note that this converts the eager load to an inner join,
    * unless you explicitly set `required: false`
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object IncludeOptions {
  
  @scala.inline
  def apply(): IncludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeOptions]
  }
  
  @scala.inline
  implicit class IncludeOptionsMutableBuilder[Self <: IncludeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean | String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAssociation(value: IncludeAssociation | String): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
    
    @scala.inline
    def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[(Model[js.Any, js.Any, js.Any]) | IncludeOptions]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: Model[js.Any, js.Any, js.Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    @scala.inline
    def setParanoid(value: Boolean): Self = StObject.set(x, "paranoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParanoidUndefined: Self = StObject.set(x, "paranoid", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSeparate(value: Boolean): Self = StObject.set(x, "separate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparateUndefined: Self = StObject.set(x, "separate", js.undefined)
    
    @scala.inline
    def setThrough(value: IncludeThroughOptions): Self = StObject.set(x, "through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughUndefined: Self = StObject.set(x, "through", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
