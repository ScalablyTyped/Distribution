package typings
package sequelizeDashCursorDashPaginationLib.sequelizeDashCursorDashPaginationMod.SequelizeCursorPaginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BasicPaginateOptions[T] extends js.Object {
   // the before cursor
  var after: js.UndefOr[java.lang.String] = js.undefined
  var attributes: js.UndefOr[
    sequelizeLib.sequelizeMod.sequelizeNs.FindOptionsAttributesArray | sequelizeLib.Anon_Include
  ] = js.undefined
   // [default: false]
  var before: js.UndefOr[java.lang.String] = js.undefined
   // limit the number of records returned
  var desc: js.UndefOr[scala.Boolean] = js.undefined
  var include: js.UndefOr[
    js.Array[
      (sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _]) | sequelizeLib.sequelizeMod.sequelizeNs.IncludeOptions
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

