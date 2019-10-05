package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.List.html }
  */
@js.native
trait List[T] extends Collection[T] {
  def pop(): js.UndefOr[T | Null] = js.native
  /**
    * @param  {T} object
    * @returns number
    */
  def push(`object`: T*): Double = js.native
  /**
    * @returns T
    */
  def shift(): js.UndefOr[T | Null] = js.native
  /**
    * @param  {number} index
    * @param  {number} count?
    * @param  {any} object?
    * @returns T
    */
  def splice(index: Double): js.Array[T] = js.native
  def splice(index: Double, count: Double): js.Array[T] = js.native
  def splice(index: Double, count: Double, `object`: js.Any): js.Array[T] = js.native
  def unshift(`object`: T*): Double = js.native
}

