package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sequelize provides a host of custom error classes, to allow you to do easier debugging. All of these errors
  * are exposed on the sequelize object and the sequelize constructor. All sequelize errors inherit from the
  * base JS error object.
  */
@js.native
trait Errors extends StObject {
  
  def AccessDeniedError(): typings.std.Error = js.native
  def AccessDeniedError(message: String): typings.std.Error = js.native
  @JSName("AccessDeniedError")
  var AccessDeniedError_Original: AccessDeniedError = js.native
  
  def ConnectionError(): typings.std.Error = js.native
  def ConnectionError(message: String): typings.std.Error = js.native
  @JSName("ConnectionError")
  var ConnectionError_Original: ConnectionError = js.native
  
  def ConnectionRefusedError(): typings.std.Error = js.native
  def ConnectionRefusedError(message: String): typings.std.Error = js.native
  @JSName("ConnectionRefusedError")
  var ConnectionRefusedError_Original: ConnectionRefusedError = js.native
  
  def ConnectionTimedOutError(): typings.std.Error = js.native
  def ConnectionTimedOutError(message: String): typings.std.Error = js.native
  @JSName("ConnectionTimedOutError")
  var ConnectionTimedOutError_Original: ConnectionTimedOutError = js.native
  
  def DatabaseError(): typings.std.Error = js.native
  def DatabaseError(message: String): typings.std.Error = js.native
  @JSName("DatabaseError")
  var DatabaseError_Original: DatabaseError = js.native
  
  def EmptyResultError(): typings.std.Error = js.native
  def EmptyResultError(message: String): typings.std.Error = js.native
  @JSName("EmptyResultError")
  var EmptyResultError_Original: EmptyResultError = js.native
  
  def Error(): typings.std.Error = js.native
  def Error(message: String): typings.std.Error = js.native
  @JSName("Error")
  var Error_Original: BaseError = js.native
  
  def ExclusionConstraintError(): typings.std.Error = js.native
  def ExclusionConstraintError(message: String): typings.std.Error = js.native
  @JSName("ExclusionConstraintError")
  var ExclusionConstraintError_Original: ExclusionConstraintError = js.native
  
  def ForeignKeyConstraintError(): typings.std.Error = js.native
  def ForeignKeyConstraintError(message: String): typings.std.Error = js.native
  @JSName("ForeignKeyConstraintError")
  var ForeignKeyConstraintError_Original: ForeignKeyConstraintError = js.native
  
  def HostNotFoundError(): typings.std.Error = js.native
  def HostNotFoundError(message: String): typings.std.Error = js.native
  @JSName("HostNotFoundError")
  var HostNotFoundError_Original: HostNotFoundError = js.native
  
  def HostNotReachableError(): typings.std.Error = js.native
  def HostNotReachableError(message: String): typings.std.Error = js.native
  @JSName("HostNotReachableError")
  var HostNotReachableError_Original: HostNotReachableError = js.native
  
  def InvalidConnectionError(): typings.std.Error = js.native
  def InvalidConnectionError(message: String): typings.std.Error = js.native
  @JSName("InvalidConnectionError")
  var InvalidConnectionError_Original: InvalidConnectionError = js.native
  
  def TimeoutError(): typings.std.Error = js.native
  def TimeoutError(message: String): typings.std.Error = js.native
  @JSName("TimeoutError")
  var TimeoutError_Original: TimeoutError = js.native
  
  def UniqueConstraintError(): typings.std.Error = js.native
  def UniqueConstraintError(message: String): typings.std.Error = js.native
  @JSName("UniqueConstraintError")
  var UniqueConstraintError_Original: UniqueConstraintError = js.native
  
  def ValidationError(): typings.std.Error = js.native
  def ValidationError(message: String): typings.std.Error = js.native
  
  def ValidationErrorItem(): typings.std.Error = js.native
  def ValidationErrorItem(message: String): typings.std.Error = js.native
  @JSName("ValidationErrorItem")
  var ValidationErrorItem_Original: ValidationErrorItem = js.native
  
  @JSName("ValidationError")
  var ValidationError_Original: ValidationError = js.native
}
