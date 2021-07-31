package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Deferrable extends StObject {
  
  /**
    * A property that will defer constraints checks to the end of transactions.
    */
  def INITIALLY_DEFERRED(): DeferrableInitiallyDeferred
  @JSName("INITIALLY_DEFERRED")
  var INITIALLY_DEFERRED_Original: DeferrableInitiallyDeferred
  
  /**
    * A property that will trigger the constraint checks immediately
    */
  def INITIALLY_IMMEDIATE(): DeferrableInitiallyImmediate
  @JSName("INITIALLY_IMMEDIATE")
  var INITIALLY_IMMEDIATE_Original: DeferrableInitiallyImmediate
  
  /**
    * A property that will set the constraints to not deferred. This is the default in PostgreSQL and it make
    * it impossible to dynamically defer the constraints within a transaction.
    */
  def NOT(): DeferrableNot
  @JSName("NOT")
  var NOT_Original: DeferrableNot
  
  /**
    * A property that will trigger an additional query at the beginning of a
    * transaction which sets the constraints to deferred.
    *
    * @param constraints An array of constraint names. Will defer all constraints by default.
    */
  def SET_DEFERRED(constraints: js.Array[String]): DeferrableSetDeferred
  @JSName("SET_DEFERRED")
  var SET_DEFERRED_Original: DeferrableSetDeferred
  
  /**
    * A property that will trigger an additional query at the beginning of a
    * transaction which sets the constraints to immediately.
    *
    * @param constraints An array of constraint names. Will defer all constraints by default.
    */
  def SET_IMMEDIATE(constraints: js.Array[String]): DeferrableSetImmediate
  @JSName("SET_IMMEDIATE")
  var SET_IMMEDIATE_Original: DeferrableSetImmediate
}
object Deferrable {
  
  @scala.inline
  def apply(
    INITIALLY_DEFERRED: DeferrableInitiallyDeferred,
    INITIALLY_IMMEDIATE: DeferrableInitiallyImmediate,
    NOT: DeferrableNot,
    SET_DEFERRED: DeferrableSetDeferred,
    SET_IMMEDIATE: DeferrableSetImmediate
  ): Deferrable = {
    val __obj = js.Dynamic.literal(INITIALLY_DEFERRED = INITIALLY_DEFERRED.asInstanceOf[js.Any], INITIALLY_IMMEDIATE = INITIALLY_IMMEDIATE.asInstanceOf[js.Any], NOT = NOT.asInstanceOf[js.Any], SET_DEFERRED = SET_DEFERRED.asInstanceOf[js.Any], SET_IMMEDIATE = SET_IMMEDIATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferrable]
  }
  
  @scala.inline
  implicit class DeferrableMutableBuilder[Self <: Deferrable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setINITIALLY_DEFERRED(value: DeferrableInitiallyDeferred): Self = StObject.set(x, "INITIALLY_DEFERRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINITIALLY_IMMEDIATE(value: DeferrableInitiallyImmediate): Self = StObject.set(x, "INITIALLY_IMMEDIATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT(value: DeferrableNot): Self = StObject.set(x, "NOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSET_DEFERRED(value: DeferrableSetDeferred): Self = StObject.set(x, "SET_DEFERRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSET_IMMEDIATE(value: DeferrableSetImmediate): Self = StObject.set(x, "SET_IMMEDIATE", value.asInstanceOf[js.Any])
  }
}
