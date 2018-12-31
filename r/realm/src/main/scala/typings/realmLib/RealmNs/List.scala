package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.List.html }
  */
@js.native
trait List[T] extends Collection[T] {
  def pop(): js.UndefOr[T | scala.Null] = js.native
  /**
    * @param  {T} object
    * @returns number
    */
  def push(`object`: T*): scala.Double = js.native
  /**
    * @returns T
    */
  def shift(): js.UndefOr[T | scala.Null] = js.native
  /**
    * @param  {number} index
    * @param  {number} count?
    * @param  {any} object?
    * @returns T
    */
  def splice(index: scala.Double): js.Array[T] = js.native
  def splice(index: scala.Double, count: scala.Double): js.Array[T] = js.native
  def splice(index: scala.Double, count: scala.Double, `object`: js.Any): js.Array[T] = js.native
  def unshift(`object`: T*): scala.Double = js.native
}

