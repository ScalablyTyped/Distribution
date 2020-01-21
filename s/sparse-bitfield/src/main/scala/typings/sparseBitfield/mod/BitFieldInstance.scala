package typings.sparseBitfield.mod

import typings.memoryPager.mod.PagerInstance
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitFieldInstance extends js.Object {
  /**
    * A `memory-pager` instance that is managing the underlying memory.
    * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
    * to get the last updated memory page.
    */
  val pages: PagerInstance
  /**
    * Get the value of a bit.
    */
  def get(index: Double): Boolean
  /**
    * Get the value of a byte.
    */
  def getByte(index: Double): Double
  /**
    * Set a bit to true or false.
    */
  def set(index: Double, value: Boolean): Boolean
  /**
    * Set a byte to a new value.
    */
  def setByte(index: Double, byte: Double): Boolean
  /**
    * Get a single buffer representing the entire bitfield.
    */
  def toBuffer(): Buffer
}

object BitFieldInstance {
  @scala.inline
  def apply(
    get: Double => Boolean,
    getByte: Double => Double,
    pages: PagerInstance,
    set: (Double, Boolean) => Boolean,
    setByte: (Double, Double) => Boolean,
    toBuffer: () => Buffer
  ): BitFieldInstance = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByte = js.Any.fromFunction1(getByte), pages = pages.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setByte = js.Any.fromFunction2(setByte), toBuffer = js.Any.fromFunction0(toBuffer))
  
    __obj.asInstanceOf[BitFieldInstance]
  }
}

