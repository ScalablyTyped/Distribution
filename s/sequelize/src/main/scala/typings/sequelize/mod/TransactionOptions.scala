package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when the transaction is created
  *
  * @see sequelize.transaction()
  */
trait TransactionOptions extends StObject {
  
  var autocommit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the constraints to be deferred or immediately checked.
    */
  var deferrable: js.UndefOr[
    DeferrableSetImmediate | DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred
  ] = js.undefined
  
  /**
    *  See `Sequelize.Transaction.ISOLATION_LEVELS` for possible options
    */
  var isolationLevel: js.UndefOr[TransactionIsolationLevel] = js.undefined
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specify the parent transaction so that this transaction is nested or a save point within the parent
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  
  /**
    *  See `Sequelize.Transaction.TYPES` for possible options
    */
  var `type`: js.UndefOr[TransactionType] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setAutocommit(value: Boolean): Self = StObject.set(x, "autocommit", value.asInstanceOf[js.Any])
    
    inline def setAutocommitUndefined: Self = StObject.set(x, "autocommit", js.undefined)
    
    inline def setDeferrable(
      value: DeferrableSetImmediate | DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred
    ): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    inline def setIsolationLevel(value: TransactionIsolationLevel): Self = StObject.set(x, "isolationLevel", value.asInstanceOf[js.Any])
    
    inline def setIsolationLevelUndefined: Self = StObject.set(x, "isolationLevel", js.undefined)
    
    inline def setLogging(value: js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setType(value: TransactionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
