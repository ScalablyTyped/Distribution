package typings.sequelize.mod

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
    val __obj = js.Dynamic.literal(KEY_SHARE = KEY_SHARE.asInstanceOf[js.Any], NO_KEY_UPDATE = NO_KEY_UPDATE.asInstanceOf[js.Any], SHARE = SHARE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionLock]
  }
}

