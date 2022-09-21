package typings.snowflakeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * Returns the id of this column.
    */
  def getId(): Double
  
  /**
    * Returns the index of this column.
    */
  def getIndex(): Double
  
  /**
    * Returns the name of this column.
    */
  def getName(): String
  
  /**
    * Returns the scale associated with this column.
    */
  def getScale(): Double
  
  /**
    * Returns the type associated with this column.
    */
  def getType(): String
  
  /**
    * Returns true if this column is type ARRAY.
    */
  def isArray(): Boolean
  
  /**
    * Returns true if this column is type BINARY.
    */
  def isBinary(): Boolean
  
  /**
    * Returns true if this column is type BOOLEAN.
    */
  def isBoolean(): Boolean
  
  /**
    * Returns true if this column is type DATE.
    */
  def isDate(): Boolean
  
  /**
    * Determines if this column is nullable.
    */
  def isNullable(): Boolean
  
  /**
    * Returns true if this column is type NUMBER.
    */
  def isNumber(): Boolean
  
  /**
    * Returns true if this column is type OBJECT.
    */
  def isObject(): Boolean
  
  /**
    * Returns true if this column is type STRING.
    */
  def isString(): Boolean
  
  /**
    * Returns true if this column is type TIME.
    */
  def isTime(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP.
    */
  def isTimestamp(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP_LTZ.
    */
  def isTimestampLtz(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP_NTZ.
    */
  def isTimestampNtz(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP_TZ.
    */
  def isTimestampTz(): Boolean
  
  /**
    * Returns true if this column is type VARIANT.
    */
  def isVariant(): Boolean
}
object Column {
  
  inline def apply(
    getId: () => Double,
    getIndex: () => Double,
    getName: () => String,
    getScale: () => Double,
    getType: () => String,
    isArray: () => Boolean,
    isBinary: () => Boolean,
    isBoolean: () => Boolean,
    isDate: () => Boolean,
    isNullable: () => Boolean,
    isNumber: () => Boolean,
    isObject: () => Boolean,
    isString: () => Boolean,
    isTime: () => Boolean,
    isTimestamp: () => Boolean,
    isTimestampLtz: () => Boolean,
    isTimestampNtz: () => Boolean,
    isTimestampTz: () => Boolean,
    isVariant: () => Boolean
  ): Column = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getName = js.Any.fromFunction0(getName), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), isArray = js.Any.fromFunction0(isArray), isBinary = js.Any.fromFunction0(isBinary), isBoolean = js.Any.fromFunction0(isBoolean), isDate = js.Any.fromFunction0(isDate), isNullable = js.Any.fromFunction0(isNullable), isNumber = js.Any.fromFunction0(isNumber), isObject = js.Any.fromFunction0(isObject), isString = js.Any.fromFunction0(isString), isTime = js.Any.fromFunction0(isTime), isTimestamp = js.Any.fromFunction0(isTimestamp), isTimestampLtz = js.Any.fromFunction0(isTimestampLtz), isTimestampNtz = js.Any.fromFunction0(isTimestampNtz), isTimestampTz = js.Any.fromFunction0(isTimestampTz), isVariant = js.Any.fromFunction0(isVariant))
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetScale(value: () => Double): Self = StObject.set(x, "getScale", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIsArray(value: () => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction0(value))
    
    inline def setIsBinary(value: () => Boolean): Self = StObject.set(x, "isBinary", js.Any.fromFunction0(value))
    
    inline def setIsBoolean(value: () => Boolean): Self = StObject.set(x, "isBoolean", js.Any.fromFunction0(value))
    
    inline def setIsDate(value: () => Boolean): Self = StObject.set(x, "isDate", js.Any.fromFunction0(value))
    
    inline def setIsNullable(value: () => Boolean): Self = StObject.set(x, "isNullable", js.Any.fromFunction0(value))
    
    inline def setIsNumber(value: () => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction0(value))
    
    inline def setIsObject(value: () => Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction0(value))
    
    inline def setIsString(value: () => Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction0(value))
    
    inline def setIsTime(value: () => Boolean): Self = StObject.set(x, "isTime", js.Any.fromFunction0(value))
    
    inline def setIsTimestamp(value: () => Boolean): Self = StObject.set(x, "isTimestamp", js.Any.fromFunction0(value))
    
    inline def setIsTimestampLtz(value: () => Boolean): Self = StObject.set(x, "isTimestampLtz", js.Any.fromFunction0(value))
    
    inline def setIsTimestampNtz(value: () => Boolean): Self = StObject.set(x, "isTimestampNtz", js.Any.fromFunction0(value))
    
    inline def setIsTimestampTz(value: () => Boolean): Self = StObject.set(x, "isTimestampTz", js.Any.fromFunction0(value))
    
    inline def setIsVariant(value: () => Boolean): Self = StObject.set(x, "isVariant", js.Any.fromFunction0(value))
  }
}
