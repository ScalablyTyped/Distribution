package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when the transaction is created
  *
  * @see sequelize.transaction()
  */
trait TransactionOptions extends js.Object {
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
  @scala.inline
  def apply(
    autocommit: js.UndefOr[Boolean] = js.undefined,
    deferrable: DeferrableSetImmediate | DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred = null,
    isolationLevel: TransactionIsolationLevel = null,
    logging: js.Function = null,
    transaction: Transaction = null,
    `type`: TransactionType = null
  ): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autocommit)) __obj.updateDynamic("autocommit")(autocommit.asInstanceOf[js.Any])
    if (deferrable != null) __obj.updateDynamic("deferrable")(deferrable.asInstanceOf[js.Any])
    if (isolationLevel != null) __obj.updateDynamic("isolationLevel")(isolationLevel.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOptions]
  }
}

