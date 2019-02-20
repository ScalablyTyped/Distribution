package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
  var include: js.UndefOr[js.Array[(Model[_, _]) | IncludeOptions]] = js.undefined
  /**
    * The model you want to eagerly load
    */
  var model: js.UndefOr[Model[_, _]] = js.undefined
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

