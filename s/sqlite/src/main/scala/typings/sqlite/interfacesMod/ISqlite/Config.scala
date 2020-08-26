package typings.sqlite.interfacesMod.ISqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var driver: js.Any = js.native
  /**
    * Valid values are filenames, ":memory:" for an anonymous in-memory
    * database and an empty string for an anonymous disk-based database.
    * Anonymous databases are not persisted and when closing the database
    * handle, their contents are lost.
    */
  var filename: String = js.native
  /**
    * One or more of sqlite3.OPEN_READONLY, sqlite3.OPEN_READWRITE and
    * sqlite3.OPEN_CREATE. The default value is OPEN_READWRITE | OPEN_CREATE.
    */
  var mode: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(driver: js.Any, filename: String): Config = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDriver(value: js.Any): Self = this.set("driver", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

