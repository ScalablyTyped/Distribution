package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the getAssociations mixin of the belongsToMany association.
  * @see BelongsToManyGetAssociationsMixin
  */
trait BelongsToManyGetAssociationsMixinOptions extends js.Object {
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.undefined
  /**
    * An optional where clause to limit the associated models.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object BelongsToManyGetAssociationsMixinOptions {
  @scala.inline
  def apply(scope: String | Boolean = null, where: AnyWhereOptions = null): BelongsToManyGetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[BelongsToManyGetAssociationsMixinOptions]
  }
}

