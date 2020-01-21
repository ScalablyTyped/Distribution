package typings.sequelize.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sequelize", JSImport.Namespace)
@js.native
class ^ protected () extends Sequelize {
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
}

@JSImport("sequelize", JSImport.Namespace)
@js.native
object ^ extends TopLevel[SequelizeStatic]

