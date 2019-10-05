package typings.sequelizeDashCursorDashPagination.sequelizeDashCursorDashPaginationMod.SequelizeCursorPagination

import typings.sequelize.Anon_Exclude
import typings.sequelize.sequelizeMod.FindOptionsAttributesArray
import typings.sequelize.sequelizeMod.IncludeOptions
import typings.sequelize.sequelizeMod.Model
import typings.sequelize.sequelizeMod.WhereOptions
import typings.sequelize.sequelizeMod.and
import typings.sequelize.sequelizeMod.col
import typings.sequelize.sequelizeMod.fn
import typings.sequelize.sequelizeMod.or
import typings.sequelize.sequelizeMod.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicPaginateOptions[T] extends js.Object {
   // the before cursor
  var after: js.UndefOr[String] = js.undefined
  var attributes: js.UndefOr[FindOptionsAttributesArray | Anon_Exclude] = js.undefined
   // [default: false]
  var before: js.UndefOr[String] = js.undefined
   // limit the number of records returned
  var desc: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
   // the after cursor
  var paginationField: js.UndefOr[String] = js.undefined
   // [default: primaryKeyField]
  var subQuery: js.UndefOr[Boolean] = js.undefined
  var where: js.UndefOr[
    WhereOptions[T] | typings.sequelize.sequelizeMod.where | fn | (js.Array[col | and | or | String])
  ] = js.undefined
}

object BasicPaginateOptions {
  @scala.inline
  def apply[T](
    after: String = null,
    attributes: FindOptionsAttributesArray | Anon_Exclude = null,
    before: String = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: Int | Double = null,
    paginationField: String = null,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): BasicPaginateOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before)
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField)
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicPaginateOptions[T]]
  }
}

