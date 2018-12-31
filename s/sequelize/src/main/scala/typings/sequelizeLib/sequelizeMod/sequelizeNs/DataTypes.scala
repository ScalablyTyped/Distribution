package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A convenience class holding commonly used data types. The datatypes are used when definining a new model
  * using
  * `Sequelize.define`, like this:
  *
  * ```js
  * sequelize.define('model', {
  *   column: DataTypes.INTEGER
  * })
  * ```
  * When defining a model you can just as easily pass a string as type, but often using the types defined here
  * is
  * beneficial. For example, using `DataTypes.BLOB`, mean that that column will be returned as an instance of
  * `Buffer` when being fetched by sequelize.
  *
  * Some data types have special properties that can be accessed in order to change the data type.
  * For example, to get an unsigned integer with zerofill you can do `DataTypes.INTEGER.UNSIGNED.ZEROFILL`.
  * The order you access the properties in do not matter, so `DataTypes.INTEGER.ZEROFILL.UNSIGNED` is fine as
  * well. The available properties are listed under each data type.
  *
  * To provide a length for the data type, you can invoke it like a function: `INTEGER(2)`
  *
  * Three of the values provided here (`NOW`, `UUIDV1` and `UUIDV4`) are special default values, that should not
  * be used to define types. Instead they are used as shorthands for defining default values. For example, to
  * get a uuid field with a default value generated following v1 of the UUID standard:
  *
  * ```js
  * sequelize.define('model', {
  *   uuid: {
  *     type: DataTypes.UUID,
  *     defaultValue: DataTypes.UUIDV1,
  *     primaryKey: true
  *   }
  * })
  * ```
  */
@js.native
trait DataTypes extends js.Object {
  var ABSTRACT: DataTypeAbstract = js.native
  @JSName("ARRAY")
  var ARRAY_Original: DataTypeArray = js.native
  @JSName("BIGINT")
  var BIGINT_Original: DataTypeBigInt = js.native
  @JSName("BLOB")
  var BLOB_Original: DataTypeBlob = js.native
  var BOOLEAN: DataTypeBoolean = js.native
  var CHAR: DataTypeChar = js.native
  var DATEONLY: DataTypeDateOnly = js.native
  @JSName("DATE")
  var DATE_Original: DataTypeDate = js.native
  @JSName("DECIMAL")
  var DECIMAL_Original: DataTypeDecimal = js.native
  @JSName("DOUBLE PRECISION")
  var `DOUBLE PRECISION_Original`: DataTypeDouble = js.native
  @JSName("DOUBLE")
  var DOUBLE_Original: DataTypeDouble = js.native
  @JSName("ENUM")
  var ENUM_Original: DataTypeEnum = js.native
  @JSName("FLOAT")
  var FLOAT_Original: DataTypeFloat = js.native
  @JSName("GEOMETRY")
  var GEOMETRY_Original: DataTypeGeometry = js.native
  var HSTORE: DataTypeHStore = js.native
  @JSName("INTEGER")
  var INTEGER_Original: DataTypeInteger = js.native
  var JSON: DataTypeJSONType = js.native
  var JSONB: DataTypeJSONB = js.native
  @JSName("MEDIUMINT")
  var MEDIUMINT_Original: DataTypeMediumInt = js.native
  var NONE: DataTypeVirtual = js.native
  var NOW: DataTypeNow = js.native
  var NUMBER: DataTypeNumber = js.native
  @JSName("NUMERIC")
  var NUMERIC_Original: DataTypeDecimal = js.native
  @JSName("RANGE")
  var RANGE_Original: DataTypeRange = js.native
  @JSName("REAL")
  var REAL_Original: DataTypeReal = js.native
  @JSName("SMALLINT")
  var SMALLINT_Original: DataTypeSmallInt = js.native
  var STRING: DataTypeString = js.native
  @JSName("TEXT")
  var TEXT_Original: DataTypeText = js.native
  var TIME: DataTypeTime = js.native
  @JSName("TINYINT")
  var TINYINT_Original: DataTypeTinyInt = js.native
  var UUID: DataTypeUUID = js.native
  var UUIDV1: DataTypeUUIDv1 = js.native
  var UUIDV4: DataTypeUUIDv4 = js.native
  var VIRTUAL: DataTypeVirtual = js.native
  /**
    * Array field for Postgre
    *
    * Accepts type any of the DataTypes
    */
  def ARRAY(options: sequelizeLib.Anon_Type): DataTypeArray = js.native
  def ARRAY(`type`: DataTypeAbstract): DataTypeArray = js.native
  /**
    * Length of the number field.
    */
  def BIGINT(): DataTypeBigInt = js.native
  def BIGINT(length: scala.Double): DataTypeBigInt = js.native
  def BIGINT(options: sequelizeLib.Anon_Length): DataTypeBigInt = js.native
  /**
    * Length of the blob field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def BLOB(): DataTypeBlob = js.native
  def BLOB(length: java.lang.String): DataTypeBlob = js.native
  def BLOB(options: sequelizeLib.Anon_LengthString): DataTypeBlob = js.native
  /**
    * Length of decimal places of time
    */
  def DATE(): DataTypeDate = js.native
  def DATE(length: scala.Double): DataTypeDate = js.native
  def DATE(options: sequelizeLib.Anon_LengthNumber): DataTypeDate = js.native
  /**
    * Precision and scale for the decimal number
    */
  def DECIMAL(): DataTypeDecimal = js.native
  def DECIMAL(options: sequelizeLib.Anon_Scale): DataTypeDecimal = js.native
  def DECIMAL(precision: scala.Double): DataTypeDecimal = js.native
  def DECIMAL(precision: scala.Double, scale: scala.Double): DataTypeDecimal = js.native
  /**
    * Length of the number field and decimals of the real
    */
  def DOUBLE(): DataTypeDouble = js.native
  def DOUBLE(length: scala.Double): DataTypeDouble = js.native
  def DOUBLE(length: scala.Double, decimals: scala.Double): DataTypeDouble = js.native
  def DOUBLE(options: sequelizeLib.Anon_LengthDecimals): DataTypeDouble = js.native
  /**
    * Length of the number field and decimals of the real
    */
  def `DOUBLE PRECISION`(): DataTypeDouble = js.native
  def `DOUBLE PRECISION`(length: scala.Double): DataTypeDouble = js.native
  def `DOUBLE PRECISION`(length: scala.Double, decimals: scala.Double): DataTypeDouble = js.native
  def `DOUBLE PRECISION`(options: sequelizeLib.Anon_LengthDecimals): DataTypeDouble = js.native
  /**
    * Enum field
    *
    * Accepts values
    */
  def ENUM(): DataTypeEnum = js.native
  def ENUM(args: java.lang.String*): DataTypeEnum = js.native
  def ENUM(options: sequelizeLib.Anon_Values): DataTypeEnum = js.native
  def ENUM(values: java.lang.String): DataTypeEnum = js.native
  def ENUM(values: js.Array[java.lang.String]): DataTypeEnum = js.native
  /**
    * Length of the number field and decimals of the float
    */
  def FLOAT(): DataTypeFloat = js.native
  def FLOAT(length: scala.Double): DataTypeFloat = js.native
  def FLOAT(length: scala.Double, decimals: scala.Double): DataTypeFloat = js.native
  def FLOAT(options: sequelizeLib.Anon_LengthDecimals): DataTypeFloat = js.native
  /**
    * Geometry field for Postgres
    */
  def GEOMETRY(`type`: java.lang.String): DataTypeGeometry = js.native
  def GEOMETRY(`type`: java.lang.String, srid: scala.Double): DataTypeGeometry = js.native
  /**
    * Length of the number field.
    */
  def INTEGER(): DataTypeInteger = js.native
  def INTEGER(length: scala.Double): DataTypeInteger = js.native
  def INTEGER(options: sequelizeLib.Anon_Length): DataTypeInteger = js.native
  /**
    * Length of the number field.
    */
  def MEDIUMINT(): DataTypeMediumInt = js.native
  def MEDIUMINT(length: scala.Double): DataTypeMediumInt = js.native
  def MEDIUMINT(options: sequelizeLib.Anon_Length): DataTypeMediumInt = js.native
  /**
    * Precision and scale for the decimal number
    */
  def NUMERIC(): DataTypeDecimal = js.native
  def NUMERIC(options: sequelizeLib.Anon_Scale): DataTypeDecimal = js.native
  def NUMERIC(precision: scala.Double): DataTypeDecimal = js.native
  def NUMERIC(precision: scala.Double, scale: scala.Double): DataTypeDecimal = js.native
  /**
    * Range field for Postgre
    *
    * Accepts subtype any of the ranges
    */
  def RANGE(): DataTypeRange = js.native
  def RANGE(options: sequelizeLib.Anon_Subtype): DataTypeRange = js.native
  def RANGE(subtype: DataTypeAbstract): DataTypeRange = js.native
  /**
    * Length of the number field and decimals of the real
    */
  def REAL(): DataTypeReal = js.native
  def REAL(length: scala.Double): DataTypeReal = js.native
  def REAL(length: scala.Double, decimals: scala.Double): DataTypeReal = js.native
  def REAL(options: sequelizeLib.Anon_LengthDecimals): DataTypeReal = js.native
  /**
    * Length of the number field.
    */
  def SMALLINT(): DataTypeSmallInt = js.native
  def SMALLINT(length: scala.Double): DataTypeSmallInt = js.native
  def SMALLINT(options: sequelizeLib.Anon_Length): DataTypeSmallInt = js.native
  /**
    * Length of the text field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def TEXT(): DataTypeText = js.native
  def TEXT(length: java.lang.String): DataTypeText = js.native
  def TEXT(options: sequelizeLib.Anon_LengthString): DataTypeText = js.native
  /**
    * Length of the number field.
    */
  def TINYINT(): DataTypeTinyInt = js.native
  def TINYINT(length: scala.Double): DataTypeTinyInt = js.native
  def TINYINT(options: sequelizeLib.Anon_Length): DataTypeTinyInt = js.native
}

