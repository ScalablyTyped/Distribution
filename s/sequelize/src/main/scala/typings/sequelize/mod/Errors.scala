package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sequelize provides a host of custom error classes, to allow you to do easier debugging. All of these errors
  * are exposed on the sequelize object and the sequelize constructor. All sequelize errors inherit from the
  * base JS error object.
  */
trait Errors extends StObject {
  
  def AccessDeniedError(): typings.std.Error
  def AccessDeniedError(message: String): typings.std.Error
  @JSName("AccessDeniedError")
  var AccessDeniedError_Original: AccessDeniedError
  
  def ConnectionError(): typings.std.Error
  def ConnectionError(message: String): typings.std.Error
  @JSName("ConnectionError")
  var ConnectionError_Original: ConnectionError
  
  def ConnectionRefusedError(): typings.std.Error
  def ConnectionRefusedError(message: String): typings.std.Error
  @JSName("ConnectionRefusedError")
  var ConnectionRefusedError_Original: ConnectionRefusedError
  
  def ConnectionTimedOutError(): typings.std.Error
  def ConnectionTimedOutError(message: String): typings.std.Error
  @JSName("ConnectionTimedOutError")
  var ConnectionTimedOutError_Original: ConnectionTimedOutError
  
  def DatabaseError(): typings.std.Error
  def DatabaseError(message: String): typings.std.Error
  @JSName("DatabaseError")
  var DatabaseError_Original: DatabaseError
  
  def EmptyResultError(): typings.std.Error
  def EmptyResultError(message: String): typings.std.Error
  @JSName("EmptyResultError")
  var EmptyResultError_Original: EmptyResultError
  
  def Error(): typings.std.Error
  def Error(message: String): typings.std.Error
  @JSName("Error")
  var Error_Original: BaseError
  
  def ExclusionConstraintError(): typings.std.Error
  def ExclusionConstraintError(message: String): typings.std.Error
  @JSName("ExclusionConstraintError")
  var ExclusionConstraintError_Original: ExclusionConstraintError
  
  def ForeignKeyConstraintError(): typings.std.Error
  def ForeignKeyConstraintError(message: String): typings.std.Error
  @JSName("ForeignKeyConstraintError")
  var ForeignKeyConstraintError_Original: ForeignKeyConstraintError
  
  def HostNotFoundError(): typings.std.Error
  def HostNotFoundError(message: String): typings.std.Error
  @JSName("HostNotFoundError")
  var HostNotFoundError_Original: HostNotFoundError
  
  def HostNotReachableError(): typings.std.Error
  def HostNotReachableError(message: String): typings.std.Error
  @JSName("HostNotReachableError")
  var HostNotReachableError_Original: HostNotReachableError
  
  def InvalidConnectionError(): typings.std.Error
  def InvalidConnectionError(message: String): typings.std.Error
  @JSName("InvalidConnectionError")
  var InvalidConnectionError_Original: InvalidConnectionError
  
  def TimeoutError(): typings.std.Error
  def TimeoutError(message: String): typings.std.Error
  @JSName("TimeoutError")
  var TimeoutError_Original: TimeoutError
  
  def UniqueConstraintError(): typings.std.Error
  def UniqueConstraintError(message: String): typings.std.Error
  @JSName("UniqueConstraintError")
  var UniqueConstraintError_Original: UniqueConstraintError
  
  def ValidationError(): typings.std.Error
  def ValidationError(message: String): typings.std.Error
  
  def ValidationErrorItem(): typings.std.Error
  def ValidationErrorItem(message: String): typings.std.Error
  @JSName("ValidationErrorItem")
  var ValidationErrorItem_Original: ValidationErrorItem
  
  @JSName("ValidationError")
  var ValidationError_Original: ValidationError
}
object Errors {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDeniedError(value: AccessDeniedError): Self = StObject.set(x, "AccessDeniedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionError(value: ConnectionError): Self = StObject.set(x, "ConnectionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRefusedError(value: ConnectionRefusedError): Self = StObject.set(x, "ConnectionRefusedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimedOutError(value: ConnectionTimedOutError): Self = StObject.set(x, "ConnectionTimedOutError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseError(value: DatabaseError): Self = StObject.set(x, "DatabaseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyResultError(value: EmptyResultError): Self = StObject.set(x, "EmptyResultError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: BaseError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionConstraintError(value: ExclusionConstraintError): Self = StObject.set(x, "ExclusionConstraintError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyConstraintError(value: ForeignKeyConstraintError): Self = StObject.set(x, "ForeignKeyConstraintError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNotFoundError(value: HostNotFoundError): Self = StObject.set(x, "HostNotFoundError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNotReachableError(value: HostNotReachableError): Self = StObject.set(x, "HostNotReachableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidConnectionError(value: InvalidConnectionError): Self = StObject.set(x, "InvalidConnectionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutError(value: TimeoutError): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueConstraintError(value: UniqueConstraintError): Self = StObject.set(x, "UniqueConstraintError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationError(value: ValidationError): Self = StObject.set(x, "ValidationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorItem(value: ValidationErrorItem): Self = StObject.set(x, "ValidationErrorItem", value.asInstanceOf[js.Any])
  }
}
