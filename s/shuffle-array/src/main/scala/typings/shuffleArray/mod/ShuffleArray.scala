package typings.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShuffleArray extends js.Object {
  
  /**
    * Randomizes the order of the elements in a given array.
    *
    * arr - The given array.
    * options - Optional configuration options.
    */
  def apply[T](arr: js.Array[T]): js.Array[T] = js.native
  def apply[T](arr: js.Array[T], options: ShuffleOptions): js.Array[T] = js.native
  
  /**
    * Pick one or more random elements from the given array. If options.picks is
    * omitted or === 1, a single element will be returned; otherwise an array.
    *
    * arr - The given array.
    * options - Optional configuration options.
    */
  def pick[T](arr: js.Array[T]): T | js.Array[T] = js.native
  def pick[T](arr: js.Array[T], options: PickOptions): T | js.Array[T] = js.native
}
