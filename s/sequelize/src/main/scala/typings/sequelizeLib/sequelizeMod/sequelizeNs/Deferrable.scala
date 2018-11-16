package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A collection of properties related to deferrable constraints. It can be used to
     * make foreign key constraints deferrable and to set the constaints within a
     * transaction. This is only supported in PostgreSQL.
     *
     * The foreign keys can be configured like this. It will create a foreign key
     * that will check the constraints immediately when the data was inserted.
     *
     * ```js
     * sequelize.define('Model', {
     *   foreign_id: {
     *     type: Sequelize.INTEGER,
     *     references: {
     *       model: OtherModel,
     *       key: 'id',
     *       deferrable: Sequelize.Deferrable.INITIALLY_IMMEDIATE
     *     }
     *   }
     * });
     * ```
     *
     * The constraints can be configured in a transaction like this. It will
     * trigger a query once the transaction has been started and set the constraints
     * to be checked at the very end of the transaction.
     *
     * ```js
     * sequelize.transaction({
 *   deferrable: Sequelize.Deferrable.SET_DEFERRED
 * });
     * ```
     */
@js.native
trait Deferrable extends js.Object {
  @JSName("INITIALLY_DEFERRED")
  var INITIALLY_DEFERRED_Original: DeferrableInitiallyDeferred = js.native
  @JSName("INITIALLY_IMMEDIATE")
  var INITIALLY_IMMEDIATE_Original: DeferrableInitiallyImmediate = js.native
  @JSName("NOT")
  var NOT_Original: DeferrableNot = js.native
  @JSName("SET_DEFERRED")
  var SET_DEFERRED_Original: DeferrableSetDeferred = js.native
  @JSName("SET_IMMEDIATE")
  var SET_IMMEDIATE_Original: DeferrableSetImmediate = js.native
  /**
           * A property that will defer constraints checks to the end of transactions.
           */
  def INITIALLY_DEFERRED(): DeferrableInitiallyDeferred = js.native
  /**
           * A property that will trigger the constraint checks immediately
           */
  def INITIALLY_IMMEDIATE(): DeferrableInitiallyImmediate = js.native
  /**
           * A property that will set the constraints to not deferred. This is the default in PostgreSQL and it make
           * it impossible to dynamically defer the constraints within a transaction.
           */
  def NOT(): DeferrableNot = js.native
  /**
           * A property that will trigger an additional query at the beginning of a
           * transaction which sets the constraints to deferred.
           *
           * @param constraints An array of constraint names. Will defer all constraints by default.
           */
  def SET_DEFERRED(constraints: js.Array[java.lang.String]): DeferrableSetDeferred = js.native
  /**
           * A property that will trigger an additional query at the beginning of a
           * transaction which sets the constraints to immediately.
           *
           * @param constraints An array of constraint names. Will defer all constraints by default.
           */
  def SET_IMMEDIATE(constraints: js.Array[java.lang.String]): DeferrableSetImmediate = js.native
}

