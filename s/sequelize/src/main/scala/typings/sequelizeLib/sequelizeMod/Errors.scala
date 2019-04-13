package typings
package sequelizeLib.sequelizeMod

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
  def AccessDeniedError(): stdLib.Error = js.native
  def AccessDeniedError(message: java.lang.String): stdLib.Error = js.native
  def ConnectionError(): stdLib.Error = js.native
  def ConnectionError(message: java.lang.String): stdLib.Error = js.native
  def ConnectionRefusedError(): stdLib.Error = js.native
  def ConnectionRefusedError(message: java.lang.String): stdLib.Error = js.native
  def ConnectionTimedOutError(): stdLib.Error = js.native
  def ConnectionTimedOutError(message: java.lang.String): stdLib.Error = js.native
  def DatabaseError(): stdLib.Error = js.native
  def DatabaseError(message: java.lang.String): stdLib.Error = js.native
  def EmptyResultError(): stdLib.Error = js.native
  def EmptyResultError(message: java.lang.String): stdLib.Error = js.native
  def Error(): stdLib.Error = js.native
  def Error(message: java.lang.String): stdLib.Error = js.native
  def ExclusionConstraintError(): stdLib.Error = js.native
  def ExclusionConstraintError(message: java.lang.String): stdLib.Error = js.native
  def ForeignKeyConstraintError(): stdLib.Error = js.native
  def ForeignKeyConstraintError(message: java.lang.String): stdLib.Error = js.native
  def HostNotFoundError(): stdLib.Error = js.native
  def HostNotFoundError(message: java.lang.String): stdLib.Error = js.native
  def HostNotReachableError(): stdLib.Error = js.native
  def HostNotReachableError(message: java.lang.String): stdLib.Error = js.native
  def InvalidConnectionError(): stdLib.Error = js.native
  def InvalidConnectionError(message: java.lang.String): stdLib.Error = js.native
  def TimeoutError(): stdLib.Error = js.native
  def TimeoutError(message: java.lang.String): stdLib.Error = js.native
  def UniqueConstraintError(): stdLib.Error = js.native
  def UniqueConstraintError(message: java.lang.String): stdLib.Error = js.native
  def ValidationError(): stdLib.Error = js.native
  def ValidationError(message: java.lang.String): stdLib.Error = js.native
  def ValidationErrorItem(): stdLib.Error = js.native
  def ValidationErrorItem(message: java.lang.String): stdLib.Error = js.native
}

