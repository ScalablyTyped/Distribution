package typings.reduxOrm.modelMod

import org.scalablytyped.runtime.Instantiable0
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model[MClass /* <: Instantiable0[AnyModel] */, Fields /* <: ModelFieldMap */] extends js.Object {
  
  /**
    * Deletes the record for this {@link Model} instance.
    * Fields and values on the instance are still accessible after the call.
    */
  def delete(): Unit = js.native
  
  /**
    * Returns a boolean indicating if `otherModel` equals this {@link Model} instance.
    * Equality is determined by shallow comparing their attributes.
    *
    * This equality is used when you call {@link Model#update}.
    * You can prevent model updates by returning `true` here.
    * However, a model will always be updated if its relationships are changed.
    *
    * @param  otherModel - a {@link Model} instance to compare
    * @return a boolean indicating if the {@link Model} instance's are equal.
    */
  def equals(otherModel: Model[Instantiable0[AnyModel], _]): Boolean = js.native
  
  /**
    * Gets the id value of the current instance by looking up the id attribute.
    * @return The id value of the current instance.
    */
  def getId[Id /* <: /* import warning: importer.ImportType#apply Failed type conversion: Fields[redux-orm.redux-orm/db/Table.IdAttribute<MClass>] */ js.Any */](): Id | Double = js.native
  
  /**
    * Returns a reference to the plain JS object in the store.
    * Make sure to not mutate this.
    *
    * @return a reference to the plain JS object in the store
    */
  val ref: Ref[this.type] = js.native
  
  /**
    * Updates {@link Model} instance attributes to reflect the
    * database state in the current session.
    */
  def refreshFromState(): Unit = js.native
  
  /**
    * Updates a property name to given value for this {@link Model} instance.
    * The values are immediately committed to the database.
    *
    * @param  propertyName - name of the property to set
    * @param value - value assigned to the property
    */
  def set[K /* <: String */](propertyName: K, value: RefPropOrSimple[this.type, K]): Unit = js.native
  
  /**
    * Assigns multiple fields and corresponding values to this {@link Model} instance.
    * The updates are immediately committed to the database.
    *
    * @param userMergeObj - an object that will be merged with this instance.
    */
  def update(userMergeObj: UpdateProps[InstanceType[MClass]]): Unit = js.native
}
