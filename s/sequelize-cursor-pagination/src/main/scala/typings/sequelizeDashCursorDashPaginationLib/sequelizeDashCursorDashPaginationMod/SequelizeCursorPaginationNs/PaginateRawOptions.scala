package typings
package sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationMod.SequelizeCursorPaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
  var raw: sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationLibNumbers.`true`
}

object PaginateRawOptions {
  @scala.inline
  def apply[T](
    raw: sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationLibNumbers.`true`,
    after: java.lang.String = null,
    attributes: sequelizeLib.sequelizeMod.sequelizeNs.FindOptionsAttributesArray | sequelizeLib.Anon_Exclude = null,
    before: java.lang.String = null,
    desc: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[
      (sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _]) | sequelizeLib.sequelizeMod.sequelizeNs.IncludeOptions
    ] = null,
    limit: scala.Int | scala.Double = null,
    paginationField: java.lang.String = null,
    subQuery: js.UndefOr[scala.Boolean] = js.undefined,
    where: sequelizeLib.sequelizeMod.sequelizeNs.WhereOptions[T] | sequelizeLib.sequelizeMod.sequelizeNs.where | sequelizeLib.sequelizeMod.sequelizeNs.fn | (js.Array[
      sequelizeLib.sequelizeMod.sequelizeNs.col | sequelizeLib.sequelizeMod.sequelizeNs.and | sequelizeLib.sequelizeMod.sequelizeNs.or | java.lang.String
    ]) = null
  ): PaginateRawOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("raw")(raw)
    if (after != null) __obj.updateDynamic("after")(after)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before)
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField)
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateRawOptions[T]]
  }
}

