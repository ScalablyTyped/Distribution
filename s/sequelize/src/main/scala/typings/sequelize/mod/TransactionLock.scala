package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible options for row locking. Used in conjuction with `find` calls:
  */
@js.native
trait TransactionLock extends js.Object {
  
   // 'SHARE'
  var KEY_SHARE: TransactionLockLevelKeyShare = js.native
  
   // 'KEY SHARE'
  var NO_KEY_UPDATE: TransactionLockLevelNoKeyUpdate = js.native
  
   // 'UPDATE'
  var SHARE: TransactionLockLevelShare = js.native
  
  var UPDATE: TransactionLockLevelUpdate = js.native
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
  
  @scala.inline
  implicit class TransactionLockOps[Self <: TransactionLock] (val x: Self) extends AnyVal {
    
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
    def setKEY_SHARE(value: TransactionLockLevelKeyShare): Self = this.set("KEY_SHARE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_KEY_UPDATE(value: TransactionLockLevelNoKeyUpdate): Self = this.set("NO_KEY_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHARE(value: TransactionLockLevelShare): Self = this.set("SHARE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE(value: TransactionLockLevelUpdate): Self = this.set("UPDATE", value.asInstanceOf[js.Any])
  }
}
