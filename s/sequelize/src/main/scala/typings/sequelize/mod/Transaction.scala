package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Transaction
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/transaction.js
//
/**
  * The transaction object is used to identify a running transaction. It is created by calling
  * `Sequelize.transaction()`.
  *
  * To run a query under a transaction, you should pass the transaction in the options object.
  */
trait Transaction extends StObject {
  
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * @see TransactionStatic
    */
  var LOCK: TransactionLock
  
  /**
    * Commit the transaction
    */
  def commit(): typings.bluebird.mod.^[Unit]
  
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): typings.bluebird.mod.^[Unit]
}
object Transaction {
  
  inline def apply(
    LOCK: TransactionLock,
    commit: () => typings.bluebird.mod.^[Unit],
    rollback: () => typings.bluebird.mod.^[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setCommit(value: () => typings.bluebird.mod.^[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setLOCK(value: TransactionLock): Self = StObject.set(x, "LOCK", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: () => typings.bluebird.mod.^[Unit]): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
  }
}
