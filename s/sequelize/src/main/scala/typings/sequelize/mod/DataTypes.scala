package typings.sequelize.mod

import typings.sequelize.anon.Decimals
import typings.sequelize.anon.Length
import typings.sequelize.anon.LengthString
import typings.sequelize.anon.Precision
import typings.sequelize.anon.Subtype
import typings.sequelize.anon.Type
import typings.sequelize.anon.Values
import typings.sequelize.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait DataTypes extends StObject {
  
  var ABSTRACT: DataTypeAbstract
  
  /**
    * Array field for Postgre
    *
    * Accepts type any of the DataTypes
    */
  def ARRAY(options: Type): DataTypeArray
  def ARRAY(`type`: DataTypeAbstract): DataTypeArray
  @JSName("ARRAY")
  var ARRAY_Original: DataTypeArray
  
  /**
    * Length of the number field.
    */
  def BIGINT(): DataTypeBigInt
  def BIGINT(length: Double): DataTypeBigInt
  def BIGINT(options: Length): DataTypeBigInt
  @JSName("BIGINT")
  var BIGINT_Original: DataTypeBigInt
  
  /**
    * Length of the blob field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def BLOB(): DataTypeBlob
  def BLOB(length: String): DataTypeBlob
  def BLOB(options: LengthString): DataTypeBlob
  @JSName("BLOB")
  var BLOB_Original: DataTypeBlob
  
  var BOOLEAN: DataTypeBoolean
  
  /**
    * A variable length string. Default length 255
    */
  def CHAR(): DataTypeChar
  def CHAR(length: Double): DataTypeChar
  def CHAR(options: Length): DataTypeChar
  @JSName("CHAR")
  var CHAR_Original: DataTypeChar
  
  /**
    * Length of decimal places of time
    */
  def DATE(): DataTypeDate
  def DATE(length: Double): DataTypeDate
  def DATE(options: `0`): DataTypeDate
  
  var DATEONLY: DataTypeDateOnly
  
  @JSName("DATE")
  var DATE_Original: DataTypeDate
  
  /**
    * Precision and scale for the decimal number
    */
  def DECIMAL(): DataTypeDecimal
  def DECIMAL(options: Precision): DataTypeDecimal
  def DECIMAL(precision: Double): DataTypeDecimal
  def DECIMAL(precision: Double, scale: Double): DataTypeDecimal
  @JSName("DECIMAL")
  var DECIMAL_Original: DataTypeDecimal
  
  /**
    * Length of the number field and decimals of the real
    */
  def DOUBLE(): DataTypeDouble
  def DOUBLE(length: Double): DataTypeDouble
  def DOUBLE(length: Double, decimals: Double): DataTypeDouble
  def DOUBLE(options: Decimals): DataTypeDouble
  
  /**
    * Length of the number field and decimals of the real
    */
  def `DOUBLE PRECISION`(): DataTypeDouble
  def `DOUBLE PRECISION`(length: Double): DataTypeDouble
  def `DOUBLE PRECISION`(length: Double, decimals: Double): DataTypeDouble
  def `DOUBLE PRECISION`(options: Decimals): DataTypeDouble
  @JSName("DOUBLE PRECISION")
  var `DOUBLE PRECISION_Original`: DataTypeDouble
  
  @JSName("DOUBLE")
  var DOUBLE_Original: DataTypeDouble
  
  /**
    * Enum field
    *
    * Accepts values
    */
  def ENUM(): DataTypeEnum
  def ENUM(args: String*): DataTypeEnum
  def ENUM(options: Values): DataTypeEnum
  def ENUM(values: String): DataTypeEnum
  def ENUM(values: js.Array[String]): DataTypeEnum
  @JSName("ENUM")
  var ENUM_Original: DataTypeEnum
  
  /**
    * Length of the number field and decimals of the float
    */
  def FLOAT(): DataTypeFloat
  def FLOAT(length: Double): DataTypeFloat
  def FLOAT(length: Double, decimals: Double): DataTypeFloat
  def FLOAT(options: Decimals): DataTypeFloat
  @JSName("FLOAT")
  var FLOAT_Original: DataTypeFloat
  
  /**
    * Geometry field for Postgres
    */
  def GEOMETRY(`type`: String): DataTypeGeometry
  def GEOMETRY(`type`: String, srid: Double): DataTypeGeometry
  @JSName("GEOMETRY")
  var GEOMETRY_Original: DataTypeGeometry
  
  var HSTORE: DataTypeHStore
  
  /**
    * Length of the number field.
    */
  def INTEGER(): DataTypeInteger
  def INTEGER(length: Double): DataTypeInteger
  def INTEGER(options: Length): DataTypeInteger
  @JSName("INTEGER")
  var INTEGER_Original: DataTypeInteger
  
  var JSON: DataTypeJSONType
  
  var JSONB: DataTypeJSONB
  
  /**
    * Length of the number field.
    */
  def MEDIUMINT(): DataTypeMediumInt
  def MEDIUMINT(length: Double): DataTypeMediumInt
  def MEDIUMINT(options: Length): DataTypeMediumInt
  @JSName("MEDIUMINT")
  var MEDIUMINT_Original: DataTypeMediumInt
  
  var NONE: DataTypeVirtual
  
  var NOW: DataTypeNow
  
  var NUMBER: DataTypeNumber
  
  /**
    * Precision and scale for the decimal number
    */
  def NUMERIC(): DataTypeDecimal
  def NUMERIC(options: Precision): DataTypeDecimal
  def NUMERIC(precision: Double): DataTypeDecimal
  def NUMERIC(precision: Double, scale: Double): DataTypeDecimal
  @JSName("NUMERIC")
  var NUMERIC_Original: DataTypeDecimal
  
  /**
    * Range field for Postgre
    *
    * Accepts subtype any of the ranges
    */
  def RANGE(): DataTypeRange
  def RANGE(options: Subtype): DataTypeRange
  def RANGE(subtype: DataTypeAbstract): DataTypeRange
  @JSName("RANGE")
  var RANGE_Original: DataTypeRange
  
  /**
    * Length of the number field and decimals of the real
    */
  def REAL(): DataTypeReal
  def REAL(length: Double): DataTypeReal
  def REAL(length: Double, decimals: Double): DataTypeReal
  def REAL(options: Decimals): DataTypeReal
  @JSName("REAL")
  var REAL_Original: DataTypeReal
  
  /**
    * Length of the number field.
    */
  def SMALLINT(): DataTypeSmallInt
  def SMALLINT(length: Double): DataTypeSmallInt
  def SMALLINT(options: Length): DataTypeSmallInt
  @JSName("SMALLINT")
  var SMALLINT_Original: DataTypeSmallInt
  
  /**
    * A variable length string. Default length 255
    */
  def STRING(): DataTypeString
  def STRING(length: Double): DataTypeString
  def STRING(options: Length): DataTypeString
  @JSName("STRING")
  var STRING_Original: DataTypeString
  
  /**
    * Length of the text field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def TEXT(): DataTypeText
  def TEXT(length: String): DataTypeText
  def TEXT(options: LengthString): DataTypeText
  @JSName("TEXT")
  var TEXT_Original: DataTypeText
  
  var TIME: DataTypeTime
  
  /**
    * Length of the number field.
    */
  def TINYINT(): DataTypeTinyInt
  def TINYINT(length: Double): DataTypeTinyInt
  def TINYINT(options: Length): DataTypeTinyInt
  @JSName("TINYINT")
  var TINYINT_Original: DataTypeTinyInt
  
  def UUID(): DataTypeUUID
  
  def UUIDV1(): DataTypeUUIDv1
  @JSName("UUIDV1")
  var UUIDV1_Original: DataTypeUUIDv1
  
  def UUIDV4(): DataTypeUUIDv4
  @JSName("UUIDV4")
  var UUIDV4_Original: DataTypeUUIDv4
  
  @JSName("UUID")
  var UUID_Original: DataTypeUUID
  
  var VIRTUAL: DataTypeVirtual
}
object DataTypes {
  
  @scala.inline
  def apply(
    ABSTRACT: DataTypeAbstract,
    ARRAY: DataTypeArray,
    BIGINT: DataTypeBigInt,
    BLOB: DataTypeBlob,
    BOOLEAN: DataTypeBoolean,
    CHAR: DataTypeChar,
    DATE: DataTypeDate,
    DATEONLY: DataTypeDateOnly,
    DECIMAL: DataTypeDecimal,
    DOUBLE: DataTypeDouble,
    `DOUBLE PRECISION`: DataTypeDouble,
    ENUM: DataTypeEnum,
    FLOAT: DataTypeFloat,
    GEOMETRY: DataTypeGeometry,
    HSTORE: DataTypeHStore,
    INTEGER: DataTypeInteger,
    JSON: DataTypeJSONType,
    JSONB: DataTypeJSONB,
    MEDIUMINT: DataTypeMediumInt,
    NONE: DataTypeVirtual,
    NOW: DataTypeNow,
    NUMBER: DataTypeNumber,
    NUMERIC: DataTypeDecimal,
    RANGE: DataTypeRange,
    REAL: DataTypeReal,
    SMALLINT: DataTypeSmallInt,
    STRING: DataTypeString,
    TEXT: DataTypeText,
    TIME: DataTypeTime,
    TINYINT: DataTypeTinyInt,
    UUID: DataTypeUUID,
    UUIDV1: DataTypeUUIDv1,
    UUIDV4: DataTypeUUIDv4,
    VIRTUAL: DataTypeVirtual
  ): DataTypes = {
    val __obj = js.Dynamic.literal(ABSTRACT = ABSTRACT.asInstanceOf[js.Any], ARRAY = ARRAY.asInstanceOf[js.Any], BIGINT = BIGINT.asInstanceOf[js.Any], BLOB = BLOB.asInstanceOf[js.Any], BOOLEAN = BOOLEAN.asInstanceOf[js.Any], CHAR = CHAR.asInstanceOf[js.Any], DATE = DATE.asInstanceOf[js.Any], DATEONLY = DATEONLY.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], DOUBLE = DOUBLE.asInstanceOf[js.Any], ENUM = ENUM.asInstanceOf[js.Any], FLOAT = FLOAT.asInstanceOf[js.Any], GEOMETRY = GEOMETRY.asInstanceOf[js.Any], HSTORE = HSTORE.asInstanceOf[js.Any], INTEGER = INTEGER.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], JSONB = JSONB.asInstanceOf[js.Any], MEDIUMINT = MEDIUMINT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], NOW = NOW.asInstanceOf[js.Any], NUMBER = NUMBER.asInstanceOf[js.Any], NUMERIC = NUMERIC.asInstanceOf[js.Any], RANGE = RANGE.asInstanceOf[js.Any], REAL = REAL.asInstanceOf[js.Any], SMALLINT = SMALLINT.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any], TIME = TIME.asInstanceOf[js.Any], TINYINT = TINYINT.asInstanceOf[js.Any], UUID = UUID.asInstanceOf[js.Any], UUIDV1 = UUIDV1.asInstanceOf[js.Any], UUIDV4 = UUIDV4.asInstanceOf[js.Any], VIRTUAL = VIRTUAL.asInstanceOf[js.Any])
    __obj.updateDynamic("DOUBLE PRECISION")((`DOUBLE PRECISION`).asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypes]
  }
  
  @scala.inline
  implicit class DataTypesMutableBuilder[Self <: DataTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setABSTRACT(value: DataTypeAbstract): Self = StObject.set(x, "ABSTRACT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY(value: DataTypeArray): Self = StObject.set(x, "ARRAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIGINT(value: DataTypeBigInt): Self = StObject.set(x, "BIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLOB(value: DataTypeBlob): Self = StObject.set(x, "BLOB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOOLEAN(value: DataTypeBoolean): Self = StObject.set(x, "BOOLEAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHAR(value: DataTypeChar): Self = StObject.set(x, "CHAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDATE(value: DataTypeDate): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDATEONLY(value: DataTypeDateOnly): Self = StObject.set(x, "DATEONLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDECIMAL(value: DataTypeDecimal): Self = StObject.set(x, "DECIMAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOUBLE(value: DataTypeDouble): Self = StObject.set(x, "DOUBLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDOUBLE PRECISION`(value: DataTypeDouble): Self = StObject.set(x, "DOUBLE PRECISION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENUM(value: DataTypeEnum): Self = StObject.set(x, "ENUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFLOAT(value: DataTypeFloat): Self = StObject.set(x, "FLOAT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGEOMETRY(value: DataTypeGeometry): Self = StObject.set(x, "GEOMETRY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHSTORE(value: DataTypeHStore): Self = StObject.set(x, "HSTORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTEGER(value: DataTypeInteger): Self = StObject.set(x, "INTEGER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSON(value: DataTypeJSONType): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSONB(value: DataTypeJSONB): Self = StObject.set(x, "JSONB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIUMINT(value: DataTypeMediumInt): Self = StObject.set(x, "MEDIUMINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: DataTypeVirtual): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOW(value: DataTypeNow): Self = StObject.set(x, "NOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUMBER(value: DataTypeNumber): Self = StObject.set(x, "NUMBER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUMERIC(value: DataTypeDecimal): Self = StObject.set(x, "NUMERIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRANGE(value: DataTypeRange): Self = StObject.set(x, "RANGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREAL(value: DataTypeReal): Self = StObject.set(x, "REAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMALLINT(value: DataTypeSmallInt): Self = StObject.set(x, "SMALLINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTRING(value: DataTypeString): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT(value: DataTypeText): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIME(value: DataTypeTime): Self = StObject.set(x, "TIME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTINYINT(value: DataTypeTinyInt): Self = StObject.set(x, "TINYINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUUID(value: DataTypeUUID): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUUIDV1(value: DataTypeUUIDv1): Self = StObject.set(x, "UUIDV1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUUIDV4(value: DataTypeUUIDv4): Self = StObject.set(x, "UUIDV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIRTUAL(value: DataTypeVirtual): Self = StObject.set(x, "VIRTUAL", value.asInstanceOf[js.Any])
  }
}
