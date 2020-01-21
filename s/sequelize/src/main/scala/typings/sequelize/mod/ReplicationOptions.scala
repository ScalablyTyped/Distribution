package typings.sequelize.mod

import typings.sequelize.AnonDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for replication Options in the sequelize constructor
  *
  * @see Options
  */
trait ReplicationOptions extends js.Object {
  var read: js.UndefOr[js.Array[AnonDatabase]] = js.undefined
  var write: js.UndefOr[AnonDatabase] = js.undefined
}

object ReplicationOptions {
  @scala.inline
  def apply(read: js.Array[AnonDatabase] = null, write: AnonDatabase = null): ReplicationOptions = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationOptions]
  }
}

