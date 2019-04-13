package typings
package sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationMod.SequelizeCursorPaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateInstOptions[T] extends BasicPaginateOptions[T] {
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object PaginateInstOptions {
  @scala.inline
  def apply[T](
    after: java.lang.String = null,
    attributes: sequelizeLib.sequelizeMod.FindOptionsAttributesArray | sequelizeLib.Anon_Exclude = null,
    before: java.lang.String = null,
    desc: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[
      (sequelizeLib.sequelizeMod.Model[_, _, _]) | sequelizeLib.sequelizeMod.IncludeOptions
    ] = null,
    limit: scala.Int | scala.Double = null,
    paginationField: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    subQuery: js.UndefOr[scala.Boolean] = js.undefined,
    where: sequelizeLib.sequelizeMod.WhereOptions[T] | sequelizeLib.sequelizeMod.where | sequelizeLib.sequelizeMod.fn | (js.Array[
      sequelizeLib.sequelizeMod.col | sequelizeLib.sequelizeMod.and | sequelizeLib.sequelizeMod.or | java.lang.String
    ]) = null
  ): PaginateInstOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before)
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateInstOptions[T]]
  }
}

