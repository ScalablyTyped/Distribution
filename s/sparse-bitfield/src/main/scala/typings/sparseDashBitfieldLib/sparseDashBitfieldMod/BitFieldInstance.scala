package typings
package sparseDashBitfieldLib.sparseDashBitfieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitFieldInstance extends js.Object {
  /**
    * A `memory-pager` instance that is managing the underlying memory.
    * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
    * to get the last updated memory page.
    */
  val pages: memoryDashPagerLib.memoryDashPagerMod.PagerInstance
  /**
    * Get the value of a bit.
    */
  def get(index: scala.Double): scala.Boolean
  /**
    * Get the value of a byte.
    */
  def getByte(index: scala.Double): scala.Double
  /**
    * Set a bit to true or false.
    */
  def set(index: scala.Double, value: scala.Boolean): scala.Boolean
  /**
    * Set a byte to a new value.
    */
  def setByte(index: scala.Double, byte: scala.Double): scala.Boolean
  /**
    * Get a single buffer representing the entire bitfield.
    */
  def toBuffer(): nodeLib.Buffer
}

object BitFieldInstance {
  @scala.inline
  def apply(
    get: scala.Double => scala.Boolean,
    getByte: scala.Double => scala.Double,
    pages: memoryDashPagerLib.memoryDashPagerMod.PagerInstance,
    set: (scala.Double, scala.Boolean) => scala.Boolean,
    setByte: (scala.Double, scala.Double) => scala.Boolean,
    toBuffer: () => nodeLib.Buffer
  ): BitFieldInstance = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByte = js.Any.fromFunction1(getByte), pages = pages, set = js.Any.fromFunction2(set), setByte = js.Any.fromFunction2(setByte), toBuffer = js.Any.fromFunction0(toBuffer))
  
    __obj.asInstanceOf[BitFieldInstance]
  }
}

