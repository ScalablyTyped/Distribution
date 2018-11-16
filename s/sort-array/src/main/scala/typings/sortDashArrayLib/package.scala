package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sortDashArrayLib {
  type ColumnNames[T] = java.lang.String
  type CustomOrder[T] = stdLib.Record[java.lang.String, CustomOrderTypes[T]]
  type CustomOrderTypes[T] = js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) */js.Any
  ]
}
