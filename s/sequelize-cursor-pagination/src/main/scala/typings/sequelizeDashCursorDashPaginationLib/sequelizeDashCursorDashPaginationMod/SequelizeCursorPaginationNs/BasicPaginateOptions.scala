package typings
package sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationMod.SequelizeCursorPaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicPaginateOptions[T] extends js.Object {
   // the before cursor
  var after: js.UndefOr[java.lang.String] = js.undefined
  var attributes: js.UndefOr[
    sequelizeLib.sequelizeMod.sequelizeNs.FindOptionsAttributesArray | sequelizeLib.Anon_Exclude
  ] = js.undefined
   // [default: false]
  var before: js.UndefOr[java.lang.String] = js.undefined
   // limit the number of records returned
  var desc: js.UndefOr[scala.Boolean] = js.undefined
  var include: js.UndefOr[
    js.Array[
      (sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _, _]) | sequelizeLib.sequelizeMod.sequelizeNs.IncludeOptions
    ]
  ] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
   // the after cursor
  var paginationField: js.UndefOr[java.lang.String] = js.undefined
   // [default: primaryKeyField]
  var subQuery: js.UndefOr[scala.Boolean] = js.undefined
  var where: js.UndefOr[
    sequelizeLib.sequelizeMod.sequelizeNs.WhereOptions[T] | sequelizeLib.sequelizeMod.sequelizeNs.where | sequelizeLib.sequelizeMod.sequelizeNs.fn | (js.Array[
      sequelizeLib.sequelizeMod.sequelizeNs.col | sequelizeLib.sequelizeMod.sequelizeNs.and | sequelizeLib.sequelizeMod.sequelizeNs.or | java.lang.String
    ])
  ] = js.undefined
}

object BasicPaginateOptions {
  @scala.inline
  def apply[T](
    after: java.lang.String = null,
    attributes: sequelizeLib.sequelizeMod.sequelizeNs.FindOptionsAttributesArray | sequelizeLib.Anon_Exclude = null,
    before: java.lang.String = null,
    desc: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[
      (sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _, _]) | sequelizeLib.sequelizeMod.sequelizeNs.IncludeOptions
    ] = null,
    limit: scala.Int | scala.Double = null,
    paginationField: java.lang.String = null,
    subQuery: js.UndefOr[scala.Boolean] = js.undefined,
    where: sequelizeLib.sequelizeMod.sequelizeNs.WhereOptions[T] | sequelizeLib.sequelizeMod.sequelizeNs.where | sequelizeLib.sequelizeMod.sequelizeNs.fn | (js.Array[
      sequelizeLib.sequelizeMod.sequelizeNs.col | sequelizeLib.sequelizeMod.sequelizeNs.and | sequelizeLib.sequelizeMod.sequelizeNs.or | java.lang.String
    ]) = null
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

