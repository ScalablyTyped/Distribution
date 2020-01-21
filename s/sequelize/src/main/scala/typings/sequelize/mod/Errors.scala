package typings.sequelize.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sequelize provides a host of custom error classes, to allow you to do easier debugging. All of these errors
  * are exposed on the sequelize object and the sequelize constructor. All sequelize errors inherit from the
  * base JS error object.
  */
@js.native
trait Errors extends js.Object {
  @JSName("AccessDeniedError")
  var AccessDeniedError_Original: AccessDeniedError = js.native
  @JSName("ConnectionError")
  var ConnectionError_Original: ConnectionError = js.native
  @JSName("ConnectionRefusedError")
  var ConnectionRefusedError_Original: ConnectionRefusedError = js.native
  @JSName("ConnectionTimedOutError")
  var ConnectionTimedOutError_Original: ConnectionTimedOutError = js.native
  @JSName("DatabaseError")
  var DatabaseError_Original: DatabaseError = js.native
  @JSName("EmptyResultError")
  var EmptyResultError_Original: EmptyResultError = js.native
  @JSName("Error")
  var Error_Original: BaseError = js.native
  @JSName("ExclusionConstraintError")
  var ExclusionConstraintError_Original: ExclusionConstraintError = js.native
  @JSName("ForeignKeyConstraintError")
  var ForeignKeyConstraintError_Original: ForeignKeyConstraintError = js.native
  @JSName("HostNotFoundError")
  var HostNotFoundError_Original: HostNotFoundError = js.native
  @JSName("HostNotReachableError")
  var HostNotReachableError_Original: HostNotReachableError = js.native
  @JSName("InvalidConnectionError")
  var InvalidConnectionError_Original: InvalidConnectionError = js.native
  @JSName("TimeoutError")
  var TimeoutError_Original: TimeoutError = js.native
  @JSName("UniqueConstraintError")
  var UniqueConstraintError_Original: UniqueConstraintError = js.native
  @JSName("ValidationErrorItem")
  var ValidationErrorItem_Original: ValidationErrorItem = js.native
  @JSName("ValidationError")
  var ValidationError_Original: ValidationError = js.native
  def AccessDeniedError(): Error = js.native
  def AccessDeniedError(message: String): Error = js.native
  def ConnectionError(): Error = js.native
  def ConnectionError(message: String): Error = js.native
  def ConnectionRefusedError(): Error = js.native
  def ConnectionRefusedError(message: String): Error = js.native
  def ConnectionTimedOutError(): Error = js.native
  def ConnectionTimedOutError(message: String): Error = js.native
  def DatabaseError(): Error = js.native
  def DatabaseError(message: String): Error = js.native
  def EmptyResultError(): Error = js.native
  def EmptyResultError(message: String): Error = js.native
  def Error(): typings.std.Error = js.native
  def Error(message: String): typings.std.Error = js.native
  def ExclusionConstraintError(): Error = js.native
  def ExclusionConstraintError(message: String): Error = js.native
  def ForeignKeyConstraintError(): Error = js.native
  def ForeignKeyConstraintError(message: String): Error = js.native
  def HostNotFoundError(): Error = js.native
  def HostNotFoundError(message: String): Error = js.native
  def HostNotReachableError(): Error = js.native
  def HostNotReachableError(message: String): Error = js.native
  def InvalidConnectionError(): Error = js.native
  def InvalidConnectionError(message: String): Error = js.native
  def TimeoutError(): Error = js.native
  def TimeoutError(message: String): Error = js.native
  def UniqueConstraintError(): Error = js.native
  def UniqueConstraintError(message: String): Error = js.native
  def ValidationError(): Error = js.native
  def ValidationError(message: String): Error = js.native
  def ValidationErrorItem(): Error = js.native
  def ValidationErrorItem(message: String): Error = js.native
}

