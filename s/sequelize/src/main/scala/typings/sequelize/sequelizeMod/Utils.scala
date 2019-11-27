package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_A1
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var Promise: Anon_A1 = js.native
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
  var mergeDefaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _.merge */ js.Any = js.native
  var or: orStatic = js.native
  var where: whereStatic = js.native
  def addTicks(s: String): String = js.native
  def addTicks(s: String, tickChar: String): String = js.native
  def argsArePrimaryKeys(args: js.Array[_], primaryKeys: js.Object): Boolean = js.native
  def camelize(str: String): String = js.native
  def canTreatArrayAsAnd(arr: js.Array[_]): Boolean = js.native
  def cloneDeep[T /* <: js.Object */](obj: T): T = js.native
  def cloneDeep[T /* <: js.Object */](obj: T, fn: js.Function1[/* value */ T, _]): T = js.native
  def combineTableNames(tableName1: String, tableName2: String): String = js.native
  /**
    * Determine if the default value provided exists and can be described
    * in a db schema using the DEFAULT directive.
    */
  def defaultValueSchemable(value: js.Any): Boolean = js.native
  def format(arr: js.Array[_]): String = js.native
  def format(arr: js.Array[_], dialect: String): String = js.native
  def formatNamedParameters(sql: String, parameters: js.Any): String = js.native
  def formatNamedParameters(sql: String, parameters: js.Any, dialect: String): String = js.native
  def formatReferences(obj: js.Object): js.Object = js.native
  def inherit(subClass: js.Object, superClass: js.Object): js.Object = js.native
  def lowercaseFirst(str: String): String = js.native
  def mapOptionFieldNames[T /* <: js.Object */](options: T, Model: Model[_, _, _]): T = js.native
  def mapValueFieldNames(dataValues: js.Object, fields: js.Array[String], Model: Model[_, _, _]): js.Object = js.native
  def now(dialect: String): Date = js.native
  def pluralize(s: String): String = js.native
  def removeCommentsFromFunctionString(s: String): String = js.native
  def removeNullValuesFromHash(hash: js.Object): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: Boolean): js.Any = js.native
  def removeNullValuesFromHash(hash: js.Object, omitNull: Boolean, options: js.Object): js.Any = js.native
  def removeTicks(s: String): String = js.native
  def removeTicks(s: String, tickChar: String): String = js.native
  def singularize(s: String): String = js.native
  def sliceArgs(args: js.Array[_]): js.Array[_] = js.native
  def sliceArgs(args: js.Array[_], begin: Double): js.Array[_] = js.native
  def spliceStr(str: String, index: Double, count: Double, add: String): String = js.native
  def stack(): String = js.native
  def tick(f: js.Function): Unit = js.native
  def toDefaultValue(value: js.Function0[DataTypeAbstract]): js.Any = js.native
  def toDefaultValue(value: DataTypeAbstract): js.Any = js.native
  def uppercaseFirst(str: String): String = js.native
  def validateParameter(value: js.Object, expectation: js.Object): Boolean = js.native
  def validateParameter(value: js.Object, expectation: js.Object, options: js.Object): Boolean = js.native
}

