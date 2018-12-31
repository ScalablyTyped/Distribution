package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Results.html }
  */
@js.native
trait Results[T] extends Collection[T] {
  /**
    * Bulk update objects in the collection.
    * @param  {string} property
    * @param  {any} value
    * @returns void
    */
  def update(property: java.lang.String, value: js.Any): scala.Unit = js.native
}

