package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html }
  */
@js.native
trait Collection[T]
  extends stdLib.ReadonlyArray[T] {
  val optional: scala.Boolean = js.native
  val `type`: PropertyType = js.native
  /**
    * @param  {(collection:any,changes:any)=>void} callback
    * @returns void
    */
  def addListener(callback: CollectionChangeCallback[T]): scala.Unit = js.native
  def avg(): scala.Double = js.native
  def avg(property: java.lang.String): scala.Double = js.native
  def description(): java.lang.String = js.native
  /**
    * @param  {string} query
    * @param  {any[]} ...arg
    * @returns Results
    */
  def filtered(query: java.lang.String, arg: js.Any*): Results[T] = js.native
  /**
    * @returns boolean
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * @returns boolean
    */
  def isValid(): scala.Boolean = js.native
  def max(): scala.Double | stdLib.Date | scala.Null = js.native
  def max(property: java.lang.String): scala.Double | stdLib.Date | scala.Null = js.native
  def min(): scala.Double | stdLib.Date | scala.Null = js.native
  def min(property: java.lang.String): scala.Double | stdLib.Date | scala.Null = js.native
  /**
    * @returns void
    */
  def removeAllListeners(): scala.Unit = js.native
  /**
    * @param  {()=>void} callback this is the callback to remove
    * @returns void
    */
  def removeListener(callback: CollectionChangeCallback[T]): scala.Unit = js.native
  /**
    * @returns Results
    */
  def snapshot(): Results[T] = js.native
  def sorted(): Results[T] = js.native
  def sorted(descriptor: java.lang.String): Results[T] = js.native
  def sorted(descriptor: java.lang.String, reverse: scala.Boolean): Results[T] = js.native
  def sorted(descriptor: js.Array[SortDescriptor]): Results[T] = js.native
  def sorted(reverse: scala.Boolean): Results[T] = js.native
  /**
    * @returns Results<T>
    */
  def subscribe(): realmLib.RealmNs.SyncNs.Subscription = js.native
  def subscribe(options: realmLib.RealmNs.SyncNs.SubscriptionOptions): realmLib.RealmNs.SyncNs.Subscription = js.native
  def subscribe(subscriptionName: java.lang.String): realmLib.RealmNs.SyncNs.Subscription = js.native
  def sum(): scala.Double | scala.Null = js.native
  def sum(property: java.lang.String): scala.Double | scala.Null = js.native
}

