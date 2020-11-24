package typings.sequelize.mod

import typings.sequelize.anon.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Complex include options
  */
@js.native
trait IncludeOptions extends js.Object {
  
  var all: js.UndefOr[Boolean | String] = js.native
  
  /**
    * The alias of the relation, in case the model you want to eagerly load is aliassed. For `hasOne` /
    * `belongsTo`, this should be the singular name, and for `hasMany`, it should be the plural
    */
  var as: js.UndefOr[String] = js.native
  
  /**
    * The association you want to eagerly load. (This can be used instead of providing a model/as pair).
    * You can also use the association alias.
    */
  var association: js.UndefOr[IncludeAssociation | String] = js.native
  
  /**
    * A list of attributes to select from the child model
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.native
  
  /**
    * Load further nested related models
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  
  /**
    * The model you want to eagerly load
    */
  var model: js.UndefOr[Model[_, _, _]] = js.native
  
  /**
    * if true, it will also eager load the relations of the child models, recursively.
    */
  var nested: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, converts to an inner join, which means that the parent model will only be loaded if it has any
    * matching children. True if `include.where` is set, false otherwise.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, runs a separate query to fetch the associated instances, only supported for hasMany associations
    */
  var separate: js.UndefOr[Boolean] = js.native
  
  /**
    * Through Options
    */
  var through: js.UndefOr[IncludeThroughOptions] = js.native
  
  /**
    * Where clauses to apply to the child models. Note that this converts the eager load to an inner join,
    * unless you explicitly set `required: false`
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object IncludeOptions {
  
  @scala.inline
  def apply(): IncludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeOptions]
  }
  
  @scala.inline
  implicit class IncludeOptionsOps[Self <: IncludeOptions] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Boolean | String): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAssociation(value: IncludeAssociation | String): Self = this.set("association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("association", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setModel(value: Model[_, _, _]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNested(value: Boolean): Self = this.set("nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNested: Self = this.set("nested", js.undefined)
    
    @scala.inline
    def setParanoid(value: Boolean): Self = this.set("paranoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParanoid: Self = this.set("paranoid", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSeparate(value: Boolean): Self = this.set("separate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparate: Self = this.set("separate", js.undefined)
    
    @scala.inline
    def setThrough(value: IncludeThroughOptions): Self = this.set("through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrough: Self = this.set("through", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
