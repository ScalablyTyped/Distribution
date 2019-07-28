package typings.sequelize.sequelizeMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.continuationDashLocalDashStorage.continuationDashLocalDashStorageMod.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sequelize methods available only for the static class ( basically this is the constructor and some extends )
  */
@js.native
trait SequelizeStatic
  extends SequelizeStaticAndInstance
     with DataTypes
     with Instantiable4[
      /* database */ String, 
      /* username */ String, 
      /* password */ String, 
      /* options */ Options, 
      Sequelize
    ]
     with /**
  * Instantiate sequelize with an URI
  * @name Sequelize
  * @constructor
  *
  * @param uri A full database URI
  * @param options See above for possible options
  */
/**
  * Instantiate sequelize with an options object which containing username, password, database
  * @name Sequelize
  * @constructor
  *
  * @param options An object with options. See above for possible options
  */
Instantiable1[(/* options */ Options) | (/* uri */ String), Sequelize]
     with /**
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
Instantiable3[
      /* database */ String, 
      /* username */ String, 
      (/* options */ Options) | (/* password */ String), 
      Sequelize
    ]
     with Instantiable2[/* database */ String, (/* options */ Options) | (/* username */ String), Sequelize] {
  /**
    * Export sequelize static on the instance for `import Sequelize from 'sequelize';` kind of imports
    */
  var Sequelize: SequelizeStatic = js.native
  /**
    * Provide access to continuation-local-storage (http://docs.sequelizejs.com/en/latest/api/sequelize/#transactionoptions-promise)
    */
  var cls: js.Any = js.native
  /**
    * Default export for `import Sequelize from 'sequelize';` kind of imports
    */
  var default: SequelizeStatic = js.native
  def useCLS(namespace: Namespace): Sequelize = js.native
}

