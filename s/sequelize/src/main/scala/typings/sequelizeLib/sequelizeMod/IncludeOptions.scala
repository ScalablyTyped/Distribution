package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Complex include options
  */
trait IncludeOptions extends js.Object {
  var all: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * The alias of the relation, in case the model you want to eagerly load is aliassed. For `hasOne` /
    * `belongsTo`, this should be the singular name, and for `hasMany`, it should be the plural
    */
  var as: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The association you want to eagerly load. (This can be used instead of providing a model/as pair).
    * You can also use the association alias.
    */
  var association: js.UndefOr[IncludeAssociation | java.lang.String] = js.undefined
  /**
    * A list of attributes to select from the child model
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | sequelizeLib.Anon_Exclude] = js.undefined
  /**
    * Load further nested related models
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  /**
    * The model you want to eagerly load
    */
  var model: js.UndefOr[Model[_, _, _]] = js.undefined
  /**
    * if true, it will also eager load the relations of the child models, recursively.
    */
  var nested: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, converts to an inner join, which means that the parent model will only be loaded if it has any
    * matching children. True if `include.where` is set, false otherwise.
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, runs a separate query to fetch the associated instances, only supported for hasMany associations
    */
  var separate: js.UndefOr[scala.Boolean] = js.undefined
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
  def apply(
    all: scala.Boolean | java.lang.String = null,
    as: java.lang.String = null,
    association: IncludeAssociation | java.lang.String = null,
    attributes: FindOptionsAttributesArray | sequelizeLib.Anon_Exclude = null,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    model: Model[_, _, _] = null,
    nested: js.UndefOr[scala.Boolean] = js.undefined,
    paranoid: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    separate: js.UndefOr[scala.Boolean] = js.undefined,
    through: IncludeThroughOptions = null,
    where: AnyWhereOptions = null
  ): IncludeOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested)
    if (!js.isUndefined(paranoid)) __obj.updateDynamic("paranoid")(paranoid)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(separate)) __obj.updateDynamic("separate")(separate)
    if (through != null) __obj.updateDynamic("through")(through)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[IncludeOptions]
  }
}

