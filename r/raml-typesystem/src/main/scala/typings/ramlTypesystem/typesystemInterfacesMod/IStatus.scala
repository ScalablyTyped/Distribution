package typings.ramlTypesystem.typesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatus
  extends StObject
     with IHasExtra {
  
  /**
    * Unique identifier
    */
  def getCode(): String
  
  /**
    * returns primitive error statuses gathered recurrently, returns warnings to.
    */
  def getErrors(): js.Array[IStatus]
  
  def getFilePath(): String
  
  def getInternalPath(): IValidationPath
  
  def getInternalRange(): RangeObject
  
  /**
    * returns human readable message associated with this status
    */
  def getMessage(): String
  
  def getSeverity(): Double
  
  /**
    * return an object which raised this status
    */
  def getSource(): Any
  
  /**
    * returns an array of nested statuses
    */
  def getSubStatuses(): js.Array[IStatus]
  
  def getValidationPath(): IValidationPath
  
  /**
    * returns path to this status
    */
  def getValidationPathAsString(): String
  
  /**
    * return true if this status contains a error
    */
  def isError(): Boolean
  
  /**
    * return true if this status is just information
    */
  def isInfo(): Boolean
  
  /**
    * returns true if status does not have errors
    */
  def isOk(): Boolean
  
  /**
    * return true if this status contains a warning
    */
  def isWarning(): Boolean
  
  def setCode(c: String): Unit
  
  def setMessage(m: String): Unit
  
  def setValidationPath(p: IValidationPath): Unit
}
object IStatus {
  
  inline def apply(
    getCode: () => String,
    getErrors: () => js.Array[IStatus],
    getExtra: String => Any,
    getFilePath: () => String,
    getInternalPath: () => IValidationPath,
    getInternalRange: () => RangeObject,
    getMessage: () => String,
    getSeverity: () => Double,
    getSource: () => Any,
    getSubStatuses: () => js.Array[IStatus],
    getValidationPath: () => IValidationPath,
    getValidationPathAsString: () => String,
    isError: () => Boolean,
    isInfo: () => Boolean,
    isOk: () => Boolean,
    isWarning: () => Boolean,
    putExtra: (String, Any) => Unit,
    setCode: String => Unit,
    setMessage: String => Unit,
    setValidationPath: IValidationPath => Unit
  ): IStatus = {
    val __obj = js.Dynamic.literal(getCode = js.Any.fromFunction0(getCode), getErrors = js.Any.fromFunction0(getErrors), getExtra = js.Any.fromFunction1(getExtra), getFilePath = js.Any.fromFunction0(getFilePath), getInternalPath = js.Any.fromFunction0(getInternalPath), getInternalRange = js.Any.fromFunction0(getInternalRange), getMessage = js.Any.fromFunction0(getMessage), getSeverity = js.Any.fromFunction0(getSeverity), getSource = js.Any.fromFunction0(getSource), getSubStatuses = js.Any.fromFunction0(getSubStatuses), getValidationPath = js.Any.fromFunction0(getValidationPath), getValidationPathAsString = js.Any.fromFunction0(getValidationPathAsString), isError = js.Any.fromFunction0(isError), isInfo = js.Any.fromFunction0(isInfo), isOk = js.Any.fromFunction0(isOk), isWarning = js.Any.fromFunction0(isWarning), putExtra = js.Any.fromFunction2(putExtra), setCode = js.Any.fromFunction1(setCode), setMessage = js.Any.fromFunction1(setMessage), setValidationPath = js.Any.fromFunction1(setValidationPath))
    __obj.asInstanceOf[IStatus]
  }
  
  extension [Self <: IStatus](x: Self) {
    
    inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
    
    inline def setGetErrors(value: () => js.Array[IStatus]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    inline def setGetFilePath(value: () => String): Self = StObject.set(x, "getFilePath", js.Any.fromFunction0(value))
    
    inline def setGetInternalPath(value: () => IValidationPath): Self = StObject.set(x, "getInternalPath", js.Any.fromFunction0(value))
    
    inline def setGetInternalRange(value: () => RangeObject): Self = StObject.set(x, "getInternalRange", js.Any.fromFunction0(value))
    
    inline def setGetMessage(value: () => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    inline def setGetSeverity(value: () => Double): Self = StObject.set(x, "getSeverity", js.Any.fromFunction0(value))
    
    inline def setGetSource(value: () => Any): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    
    inline def setGetSubStatuses(value: () => js.Array[IStatus]): Self = StObject.set(x, "getSubStatuses", js.Any.fromFunction0(value))
    
    inline def setGetValidationPath(value: () => IValidationPath): Self = StObject.set(x, "getValidationPath", js.Any.fromFunction0(value))
    
    inline def setGetValidationPathAsString(value: () => String): Self = StObject.set(x, "getValidationPathAsString", js.Any.fromFunction0(value))
    
    inline def setIsError(value: () => Boolean): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
    
    inline def setIsInfo(value: () => Boolean): Self = StObject.set(x, "isInfo", js.Any.fromFunction0(value))
    
    inline def setIsOk(value: () => Boolean): Self = StObject.set(x, "isOk", js.Any.fromFunction0(value))
    
    inline def setIsWarning(value: () => Boolean): Self = StObject.set(x, "isWarning", js.Any.fromFunction0(value))
    
    inline def setSetCode(value: String => Unit): Self = StObject.set(x, "setCode", js.Any.fromFunction1(value))
    
    inline def setSetMessage(value: String => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
    
    inline def setSetValidationPath(value: IValidationPath => Unit): Self = StObject.set(x, "setValidationPath", js.Any.fromFunction1(value))
  }
}
