package typings.sparseDashBitfield.sparseDashBitfieldMod

import typings.memoryDashPager.memoryDashPagerMod.PagerInstance
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparse-bitfield", JSImport.Namespace)
@js.native
class Class () extends BitFieldInstance {
  def this(bufferOrOptions: Buffer) = this()
  def this(bufferOrOptions: Options) = this()
  /**
    * A `memory-pager` instance that is managing the underlying memory.
    * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
    * to get the last updated memory page.
    */
  /* CompleteClass */
  override val pages: PagerInstance = js.native
  /**
    * Get the value of a bit.
    */
  /* CompleteClass */
  override def get(index: Double): Boolean = js.native
  /**
    * Get the value of a byte.
    */
  /* CompleteClass */
  override def getByte(index: Double): Double = js.native
  /**
    * Set a bit to true or false.
    */
  /* CompleteClass */
  override def set(index: Double, value: Boolean): Boolean = js.native
  /**
    * Set a byte to a new value.
    */
  /* CompleteClass */
  override def setByte(index: Double, byte: Double): Boolean = js.native
  /**
    * Get a single buffer representing the entire bitfield.
    */
  /* CompleteClass */
  override def toBuffer(): Buffer = js.native
}

