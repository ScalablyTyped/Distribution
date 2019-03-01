package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for replication Options in the sequelize constructor
  *
  * @see Options
  */
trait ReplicationOptions extends js.Object {
  var read: js.UndefOr[js.Array[sequelizeLib.Anon_Database]] = js.undefined
  var write: js.UndefOr[sequelizeLib.Anon_Database] = js.undefined
}

object ReplicationOptions {
  @scala.inline
  def apply(read: js.Array[sequelizeLib.Anon_Database] = null, write: sequelizeLib.Anon_Database = null): ReplicationOptions = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[ReplicationOptions]
  }
}

