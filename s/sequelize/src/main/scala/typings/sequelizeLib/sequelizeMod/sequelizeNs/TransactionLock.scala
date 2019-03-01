package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible options for row locking. Used in conjuction with `find` calls:
  */
trait TransactionLock extends js.Object {
   // 'SHARE'
  var KEY_SHARE: TransactionLockLevelKeyShare
   // 'KEY SHARE'
  var NO_KEY_UPDATE: TransactionLockLevelNoKeyUpdate
   // 'UPDATE'
  var SHARE: TransactionLockLevelShare
  var UPDATE: TransactionLockLevelUpdate
}

object TransactionLock {
  @scala.inline
  def apply(
    KEY_SHARE: TransactionLockLevelKeyShare,
    NO_KEY_UPDATE: TransactionLockLevelNoKeyUpdate,
    SHARE: TransactionLockLevelShare,
    UPDATE: TransactionLockLevelUpdate
  ): TransactionLock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("KEY_SHARE")(KEY_SHARE)
    __obj.updateDynamic("NO_KEY_UPDATE")(NO_KEY_UPDATE)
    __obj.updateDynamic("SHARE")(SHARE)
    __obj.updateDynamic("UPDATE")(UPDATE)
    __obj.asInstanceOf[TransactionLock]
  }
}

