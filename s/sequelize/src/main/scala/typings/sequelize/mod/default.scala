package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default export for `import Sequelize from 'sequelize';` kind of imports
  */
/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sequelize", "default")
@js.native
class default protected ()
  extends StObject
     with Sequelize {
  /**
    * Instantiate sequelize with an options object which containing username, password, database
    * @name Sequelize
    * @constructor
    *
    * @param options An object with options. See above for possible options
    */
  def this(options: Options) = this()
  /**
    * Instantiate sequelize with an URI
    * @name Sequelize
    * @constructor
    *
    * @param uri A full database URI
    * @param options See above for possible options
    */
  def this(uri: String) = this()
  def this(database: String, username: String) = this()
  def this(uri: String, options: Options) = this()
  def this(database: String, username: String, options: Options) = this()
  /**
    * Instantiate sequelize with name of database, username and password
    *
    * #### Example usage
    *
    * ```javascript
    * // without password and options
    * var sequelize = new Sequelize('database', 'username')
    *
    * // without options
    * var sequelize = new Sequelize('database', 'username', 'password')
    *
    * // without password / with blank password
    * var sequelize = new Sequelize('database', 'username', null, {})
    *
    * // with password and options
    * var sequelize = new Sequelize('my_database', 'john', 'doe', {})
    *
    * // with uri (see below)
    * var sequelize = new Sequelize('mysql://localhost:3306/database', {})
    * ```
    *
    * @param database The name of the database
    * @param username The username which is used to authenticate against the
    *     database.
    * @param password The password which is used to authenticate against the
    *     database.
    * @param options An object with options.
    */
  def this(database: String, username: String, password: String) = this()
  def this(database: String, username: String, password: String, options: Options) = this()
  
  /* CompleteClass */
  override def AccessDeniedError(): typings.std.Error = js.native
  /* CompleteClass */
  override def AccessDeniedError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("AccessDeniedError")
  var AccessDeniedError_Original: AccessDeniedError = js.native
  
  /* CompleteClass */
  override def ConnectionError(): typings.std.Error = js.native
  /* CompleteClass */
  override def ConnectionError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("ConnectionError")
  var ConnectionError_Original: ConnectionError = js.native
  
  /* CompleteClass */
  override def ConnectionRefusedError(): typings.std.Error = js.native
  /* CompleteClass */
  override def ConnectionRefusedError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("ConnectionRefusedError")
  var ConnectionRefusedError_Original: ConnectionRefusedError = js.native
  
  /* CompleteClass */
  override def ConnectionTimedOutError(): typings.std.Error = js.native
  /* CompleteClass */
  override def ConnectionTimedOutError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("ConnectionTimedOutError")
  var ConnectionTimedOutError_Original: ConnectionTimedOutError = js.native
  
  /* CompleteClass */
  override def DatabaseError(): typings.std.Error = js.native
  /* CompleteClass */
  override def DatabaseError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("DatabaseError")
  var DatabaseError_Original: DatabaseError = js.native
  
  /* CompleteClass */
  override def EmptyResultError(): typings.std.Error = js.native
  /* CompleteClass */
  override def EmptyResultError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("EmptyResultError")
  var EmptyResultError_Original: EmptyResultError = js.native
  
  /* CompleteClass */
  override def Error(): typings.std.Error = js.native
  /* CompleteClass */
  override def Error(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("Error")
  var Error_Original: BaseError = js.native
  
  /* CompleteClass */
  override def ExclusionConstraintError(): typings.std.Error = js.native
  /* CompleteClass */
  override def ExclusionConstraintError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("ExclusionConstraintError")
  var ExclusionConstraintError_Original: ExclusionConstraintError = js.native
  
  /* CompleteClass */
  override def ForeignKeyConstraintError(): typings.std.Error = js.native
  /* CompleteClass */
  override def ForeignKeyConstraintError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("ForeignKeyConstraintError")
  var ForeignKeyConstraintError_Original: ForeignKeyConstraintError = js.native
  
  /* CompleteClass */
  override def HostNotFoundError(): typings.std.Error = js.native
  /* CompleteClass */
  override def HostNotFoundError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("HostNotFoundError")
  var HostNotFoundError_Original: HostNotFoundError = js.native
  
  /* CompleteClass */
  override def HostNotReachableError(): typings.std.Error = js.native
  /* CompleteClass */
  override def HostNotReachableError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("HostNotReachableError")
  var HostNotReachableError_Original: HostNotReachableError = js.native
  
  /* CompleteClass */
  override def InvalidConnectionError(): typings.std.Error = js.native
  /* CompleteClass */
  override def InvalidConnectionError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("InvalidConnectionError")
  var InvalidConnectionError_Original: InvalidConnectionError = js.native
  
  /* CompleteClass */
  override def TimeoutError(): typings.std.Error = js.native
  /* CompleteClass */
  override def TimeoutError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("TimeoutError")
  var TimeoutError_Original: TimeoutError = js.native
  
  /* CompleteClass */
  override def UniqueConstraintError(): typings.std.Error = js.native
  /* CompleteClass */
  override def UniqueConstraintError(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("UniqueConstraintError")
  var UniqueConstraintError_Original: UniqueConstraintError = js.native
  
  /* CompleteClass */
  override def ValidationError(): typings.std.Error = js.native
  /* CompleteClass */
  override def ValidationError(message: String): typings.std.Error = js.native
  
  /* CompleteClass */
  override def ValidationErrorItem(): typings.std.Error = js.native
  /* CompleteClass */
  override def ValidationErrorItem(message: String): typings.std.Error = js.native
  /* CompleteClass */
  @JSName("ValidationErrorItem")
  var ValidationErrorItem_Original: ValidationErrorItem = js.native
  
  /* CompleteClass */
  @JSName("ValidationError")
  var ValidationError_Original: ValidationError = js.native
}
