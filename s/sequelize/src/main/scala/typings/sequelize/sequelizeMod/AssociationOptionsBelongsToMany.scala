package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with belongsToMany relationship
  *
  * @see Association class belongsToMany method
  */
trait AssociationOptionsBelongsToMany extends AssociationOptionsManyToMany {
  /**
    * The name of the foreign key in the join table (representing the target model) or an object representing
    * the type definition for the other column (see `Sequelize.define` for syntax). When using an object, you
    * can add a `name` property to set the name of the colum. Defaults to the name of target + primary key of
    * target
    */
  var otherKey: js.UndefOr[String | AssociationForeignKeyOptions] = js.undefined
  /**
    * The name of the table that is used to join source and target in n:m associations. Can also be a
    * sequelize
    * model if you want to define the junction table yourself and add extra attributes to it.
    *
    * In 3.4.1 version of Sequelize, hasMany's use of through gives an error, and on the other hand through
    * option for belongsToMany has been made required.
    *
    * @see https://github.com/sequelize/sequelize/blob/v3.4.1/lib/associations/has-many.js
    * @see https://github.com/sequelize/sequelize/blob/v3.4.1/lib/associations/belongs-to-many.js
    */
  var through: (Model[_, _, _]) | String | ThroughOptions
  /**
    * Should the join model have timestamps
    */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  /**
    * Belongs-To-Many creates a unique key when primary key is not present on through model. This unique key name can be overridden using uniqueKey option.
    */
  var uniqueKey: js.UndefOr[String] = js.undefined
}

object AssociationOptionsBelongsToMany {
  @scala.inline
  def apply(
    through: (Model[_, _, _]) | String | ThroughOptions,
    as: String | Anon_Plural = null,
    constraints: js.UndefOr[Boolean] = js.undefined,
    foreignKey: String | AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[Boolean] = js.undefined,
    hooks: js.UndefOr[Boolean] = js.undefined,
    onDelete: String = null,
    onUpdate: String = null,
    otherKey: String | AssociationForeignKeyOptions = null,
    scope: AssociationScope = null,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    uniqueKey: String = null
  ): AssociationOptionsBelongsToMany = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (otherKey != null) __obj.updateDynamic("otherKey")(otherKey.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps)
    if (uniqueKey != null) __obj.updateDynamic("uniqueKey")(uniqueKey)
    __obj.asInstanceOf[AssociationOptionsBelongsToMany]
  }
}

