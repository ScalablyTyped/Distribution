package typings.sqlite.interfacesMod.ISqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The database driver. Most will install `sqlite3` and use the `Database` class from it.
    * As long as the library you are using conforms to the `sqlite3` API, you can use it as
    * the driver.
    *
    * @example
    *
    * ```
    * import sqlite from 'sqlite3'
    *
    * const driver = sqlite.Database
    * ```
    */
  var driver: js.Any
  /**
    * Valid values are filenames, ":memory:" for an anonymous in-memory
    * database and an empty string for an anonymous disk-based database.
    * Anonymous databases are not persisted and when closing the database
    * handle, their contents are lost.
    */
  var filename: String
  /**
    * One or more of sqlite3.OPEN_READONLY, sqlite3.OPEN_READWRITE and
    * sqlite3.OPEN_CREATE. The default value is OPEN_READWRITE | OPEN_CREATE.
    */
  var mode: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(driver: js.Any, filename: String, mode: js.UndefOr[Double] = js.undefined): Config = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

