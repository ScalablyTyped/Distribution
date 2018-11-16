package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var Promise: ScalablyTyped.runtime.Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[bluebirdLib.Resolvable[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]], 
      scala.Unit
    ], 
    bluebirdLib.bluebirdMod.namespaced[js.Object]
  ] = js.native
  var `_`: SequelizeLoDash = js.native
  var and: andStatic = js.native
  var cast: castStatic = js.native
  var col: colStatic = js.native
  var fn: fnStatic = js.native
  var json: jsonStatic = js.native
  var literal: literalStatic = js.native
  /**
           * Same concept as _.merge, but don't overwrite properties that have already been assigned
           */
  var mergeDefaults: js.Any = js.native
  var or: orStatic = js.native
  var where: whereStatic = js.native
  def addTicks(s: java.lang.String): java.lang.String = js.native
  def addTicks(s: java.lang.String, tickChar: java.lang.String): java.lang.String = js.native
  def argsArePrimaryKeys(args: js.Array[_], primaryKeys: js.Object): scala.Boolean = js.native
  def camelize(str: java.lang.String): java.lang.String = js.native
  def canTreatArrayAsAnd(arr: js.Array[_]): scala.Boolean = js.native
  def cloneDeep[T /* <: js.Object */](obj: T): T = js.native
  def cloneDeep[T /* <: js.Object */](obj: T, fn: js.Function1[/* value */ T, _]): T = js.native
  def combineTableNames(tableName1: java.lang.String, tableName2: java.lang.String): java.lang.String = js.native
  /**
           * Determine if the default value provided exists and can be described
           * in a db schema using the DEFAULT directive.
           */
  def defaultValueSchemable(value: js.Any): scala.Boolean = js.native
  def format(arr: js.Array[_]): java.lang.String = js.native
  def format(arr: js.Array[_], dialect: java.lang.String): java.lang.String = js.native
  def formatNamedParameters(sql: java.lang.String, parameters: js.Any): java.lang.String = js.native
  def formatNamedParameters(sql: java.lang.String, parameters: js.Any, dialect: java.lang.String): java.lang.String = js.native
  def formatReferences(obj: js.Object): js.Object = js.native
  def inherit(subClass: js.Object, superClass: js.Object): js.Object = js.native
  def lowercaseFirst(str: java.lang.String): java.lang.String = js.native
  def mapOptionFieldNames[T /* <: js.Object */](options: T, Model: Model[_, _]): T = js.native
  def mapValueFieldNames(dataValues: js.Object, fields: js.Array[java.lang.String], Model: Model[_, _]): js.Object = js.native
  def now(dialect: java.lang.String): stdLib.Date = js.native
  def pluralize(s: java.lang.String): java.lang.String = js.native
  def removeCommentsFromFunctionString(s: java.lang.String): java.lang.String = js.native
  def removeNullValuesFromHash(hash: js.Object): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: scala.Boolean): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: scala.Boolean, options: js.Object): js.Any = js.native
  def removeTicks(s: java.lang.String): java.lang.String = js.native
  def removeTicks(s: java.lang.String, tickChar: java.lang.String): java.lang.String = js.native
  def singularize(s: java.lang.String): java.lang.String = js.native
  def sliceArgs(args: js.Array[_]): js.Array[_] = js.native
  def sliceArgs(args: js.Array[_], begin: scala.Double): js.Array[_] = js.native
  def spliceStr(str: java.lang.String, index: scala.Double, count: scala.Double, add: java.lang.String): java.lang.String = js.native
  def stack(): java.lang.String = js.native
  def tick(f: js.Function): scala.Unit = js.native
  def toDefaultValue(value: js.Function0[DataTypeAbstract]): js.Any = js.native
  def toDefaultValue(value: DataTypeAbstract): js.Any = js.native
  def uppercaseFirst(str: java.lang.String): java.lang.String = js.native
  def validateParameter(value: js.Object, expectation: js.Object): scala.Boolean = js.native
  def validateParameter(value: js.Object, expectation: js.Object, options: js.Object): scala.Boolean = js.native
}

