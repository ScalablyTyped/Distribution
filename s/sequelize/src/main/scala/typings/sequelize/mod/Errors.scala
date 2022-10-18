package typings.sequelize.mod

import typings.std.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sequelize provides a host of custom error classes, to allow you to do easier debugging. All of these errors
  * are exposed on the sequelize object and the sequelize constructor. All sequelize errors inherit from the
  * base JS error object.
  */
trait Errors extends StObject {
  
  /* standard es5 */
  def AccessDeniedError(): js.Error
  def AccessDeniedError(message: String): js.Error
  def AccessDeniedError(message: String, options: ErrorOptions): js.Error
  def AccessDeniedError(message: Unit, options: ErrorOptions): js.Error
  @JSName("AccessDeniedError")
  var AccessDeniedError_Original: AccessDeniedError
  
  /* standard es5 */
  def ConnectionError(): js.Error
  def ConnectionError(message: String): js.Error
  def ConnectionError(message: String, options: ErrorOptions): js.Error
  def ConnectionError(message: Unit, options: ErrorOptions): js.Error
  @JSName("ConnectionError")
  var ConnectionError_Original: ConnectionError
  
  /* standard es5 */
  def ConnectionRefusedError(): js.Error
  def ConnectionRefusedError(message: String): js.Error
  def ConnectionRefusedError(message: String, options: ErrorOptions): js.Error
  def ConnectionRefusedError(message: Unit, options: ErrorOptions): js.Error
  @JSName("ConnectionRefusedError")
  var ConnectionRefusedError_Original: ConnectionRefusedError
  
  /* standard es5 */
  def ConnectionTimedOutError(): js.Error
  def ConnectionTimedOutError(message: String): js.Error
  def ConnectionTimedOutError(message: String, options: ErrorOptions): js.Error
  def ConnectionTimedOutError(message: Unit, options: ErrorOptions): js.Error
  @JSName("ConnectionTimedOutError")
  var ConnectionTimedOutError_Original: ConnectionTimedOutError
  
  /* standard es5 */
  def DatabaseError(): js.Error
  def DatabaseError(message: String): js.Error
  def DatabaseError(message: String, options: ErrorOptions): js.Error
  def DatabaseError(message: Unit, options: ErrorOptions): js.Error
  @JSName("DatabaseError")
  var DatabaseError_Original: DatabaseError
  
  /* standard es5 */
  def EmptyResultError(): js.Error
  def EmptyResultError(message: String): js.Error
  def EmptyResultError(message: String, options: ErrorOptions): js.Error
  def EmptyResultError(message: Unit, options: ErrorOptions): js.Error
  @JSName("EmptyResultError")
  var EmptyResultError_Original: EmptyResultError
  
  /* standard es5 */
  def Error(): js.Error
  def Error(message: String): js.Error
  def Error(message: String, options: ErrorOptions): js.Error
  def Error(message: Unit, options: ErrorOptions): js.Error
  @JSName("Error")
  var Error_Original: BaseError
  
  /* standard es5 */
  def ExclusionConstraintError(): js.Error
  def ExclusionConstraintError(message: String): js.Error
  def ExclusionConstraintError(message: String, options: ErrorOptions): js.Error
  def ExclusionConstraintError(message: Unit, options: ErrorOptions): js.Error
  @JSName("ExclusionConstraintError")
  var ExclusionConstraintError_Original: ExclusionConstraintError
  
  /* standard es5 */
  def ForeignKeyConstraintError(): js.Error
  def ForeignKeyConstraintError(message: String): js.Error
  def ForeignKeyConstraintError(message: String, options: ErrorOptions): js.Error
  def ForeignKeyConstraintError(message: Unit, options: ErrorOptions): js.Error
  @JSName("ForeignKeyConstraintError")
  var ForeignKeyConstraintError_Original: ForeignKeyConstraintError
  
  /* standard es5 */
  def HostNotFoundError(): js.Error
  def HostNotFoundError(message: String): js.Error
  def HostNotFoundError(message: String, options: ErrorOptions): js.Error
  def HostNotFoundError(message: Unit, options: ErrorOptions): js.Error
  @JSName("HostNotFoundError")
  var HostNotFoundError_Original: HostNotFoundError
  
  /* standard es5 */
  def HostNotReachableError(): js.Error
  def HostNotReachableError(message: String): js.Error
  def HostNotReachableError(message: String, options: ErrorOptions): js.Error
  def HostNotReachableError(message: Unit, options: ErrorOptions): js.Error
  @JSName("HostNotReachableError")
  var HostNotReachableError_Original: HostNotReachableError
  
  /* standard es5 */
  def InvalidConnectionError(): js.Error
  def InvalidConnectionError(message: String): js.Error
  def InvalidConnectionError(message: String, options: ErrorOptions): js.Error
  def InvalidConnectionError(message: Unit, options: ErrorOptions): js.Error
  @JSName("InvalidConnectionError")
  var InvalidConnectionError_Original: InvalidConnectionError
  
  /* standard es5 */
  def TimeoutError(): js.Error
  def TimeoutError(message: String): js.Error
  def TimeoutError(message: String, options: ErrorOptions): js.Error
  def TimeoutError(message: Unit, options: ErrorOptions): js.Error
  @JSName("TimeoutError")
  var TimeoutError_Original: TimeoutError
  
  /* standard es5 */
  def UniqueConstraintError(): js.Error
  def UniqueConstraintError(message: String): js.Error
  def UniqueConstraintError(message: String, options: ErrorOptions): js.Error
  def UniqueConstraintError(message: Unit, options: ErrorOptions): js.Error
  @JSName("UniqueConstraintError")
  var UniqueConstraintError_Original: UniqueConstraintError
  
  /* standard es5 */
  def ValidationError(): js.Error
  def ValidationError(message: String): js.Error
  def ValidationError(message: String, options: ErrorOptions): js.Error
  def ValidationError(message: Unit, options: ErrorOptions): js.Error
  
  /* standard es5 */
  def ValidationErrorItem(): js.Error
  def ValidationErrorItem(message: String): js.Error
  def ValidationErrorItem(message: String, options: ErrorOptions): js.Error
  def ValidationErrorItem(message: Unit, options: ErrorOptions): js.Error
  @JSName("ValidationErrorItem")
  var ValidationErrorItem_Original: ValidationErrorItem
  
  @JSName("ValidationError")
  var ValidationError_Original: ValidationError
}
object Errors {
  
  inline def apply(
    AccessDeniedError: AccessDeniedError,
    ConnectionError: ConnectionError,
    ConnectionRefusedError: ConnectionRefusedError,
    ConnectionTimedOutError: ConnectionTimedOutError,
    DatabaseError: DatabaseError,
    EmptyResultError: EmptyResultError,
    Error: BaseError,
    ExclusionConstraintError: ExclusionConstraintError,
    ForeignKeyConstraintError: ForeignKeyConstraintError,
    HostNotFoundError: HostNotFoundError,
    HostNotReachableError: HostNotReachableError,
    InvalidConnectionError: InvalidConnectionError,
    TimeoutError: TimeoutError,
    UniqueConstraintError: UniqueConstraintError,
    ValidationError: ValidationError,
    ValidationErrorItem: ValidationErrorItem
  ): Errors = {
    val __obj = js.Dynamic.literal(AccessDeniedError = AccessDeniedError.asInstanceOf[js.Any], ConnectionError = ConnectionError.asInstanceOf[js.Any], ConnectionRefusedError = ConnectionRefusedError.asInstanceOf[js.Any], ConnectionTimedOutError = ConnectionTimedOutError.asInstanceOf[js.Any], DatabaseError = DatabaseError.asInstanceOf[js.Any], EmptyResultError = EmptyResultError.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], ExclusionConstraintError = ExclusionConstraintError.asInstanceOf[js.Any], ForeignKeyConstraintError = ForeignKeyConstraintError.asInstanceOf[js.Any], HostNotFoundError = HostNotFoundError.asInstanceOf[js.Any], HostNotReachableError = HostNotReachableError.asInstanceOf[js.Any], InvalidConnectionError = InvalidConnectionError.asInstanceOf[js.Any], TimeoutError = TimeoutError.asInstanceOf[js.Any], UniqueConstraintError = UniqueConstraintError.asInstanceOf[js.Any], ValidationError = ValidationError.asInstanceOf[js.Any], ValidationErrorItem = ValidationErrorItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setAccessDeniedError(value: AccessDeniedError): Self = StObject.set(x, "AccessDeniedError", value.asInstanceOf[js.Any])
    
    inline def setConnectionError(value: ConnectionError): Self = StObject.set(x, "ConnectionError", value.asInstanceOf[js.Any])
    
    inline def setConnectionRefusedError(value: ConnectionRefusedError): Self = StObject.set(x, "ConnectionRefusedError", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimedOutError(value: ConnectionTimedOutError): Self = StObject.set(x, "ConnectionTimedOutError", value.asInstanceOf[js.Any])
    
    inline def setDatabaseError(value: DatabaseError): Self = StObject.set(x, "DatabaseError", value.asInstanceOf[js.Any])
    
    inline def setEmptyResultError(value: EmptyResultError): Self = StObject.set(x, "EmptyResultError", value.asInstanceOf[js.Any])
    
    inline def setError(value: BaseError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setExclusionConstraintError(value: ExclusionConstraintError): Self = StObject.set(x, "ExclusionConstraintError", value.asInstanceOf[js.Any])
    
    inline def setForeignKeyConstraintError(value: ForeignKeyConstraintError): Self = StObject.set(x, "ForeignKeyConstraintError", value.asInstanceOf[js.Any])
    
    inline def setHostNotFoundError(value: HostNotFoundError): Self = StObject.set(x, "HostNotFoundError", value.asInstanceOf[js.Any])
    
    inline def setHostNotReachableError(value: HostNotReachableError): Self = StObject.set(x, "HostNotReachableError", value.asInstanceOf[js.Any])
    
    inline def setInvalidConnectionError(value: InvalidConnectionError): Self = StObject.set(x, "InvalidConnectionError", value.asInstanceOf[js.Any])
    
    inline def setTimeoutError(value: TimeoutError): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
    
    inline def setUniqueConstraintError(value: UniqueConstraintError): Self = StObject.set(x, "UniqueConstraintError", value.asInstanceOf[js.Any])
    
    inline def setValidationError(value: ValidationError): Self = StObject.set(x, "ValidationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorItem(value: ValidationErrorItem): Self = StObject.set(x, "ValidationErrorItem", value.asInstanceOf[js.Any])
  }
}
