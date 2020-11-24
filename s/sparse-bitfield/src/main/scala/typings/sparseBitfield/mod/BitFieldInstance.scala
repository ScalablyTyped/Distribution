package typings.sparseBitfield.mod

import typings.memoryPager.mod.PagerInstance
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitFieldInstance extends js.Object {
  
  /**
    * Get the value of a bit.
    */
  def get(index: Double): Boolean = js.native
  
  /**
    * Get the value of a byte.
    */
  def getByte(index: Double): Double = js.native
  
  /**
    * A `memory-pager` instance that is managing the underlying memory.
    * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
    * to get the last updated memory page.
    */
  val pages: PagerInstance = js.native
  
  /**
    * Set a bit to true or false.
    */
  def set(index: Double, value: Boolean): Boolean = js.native
  
  /**
    * Set a byte to a new value.
    */
  def setByte(index: Double, byte: Double): Boolean = js.native
  
  /**
    * Get a single buffer representing the entire bitfield.
    */
  def toBuffer(): Buffer = js.native
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
  
  @scala.inline
  implicit class BitFieldInstanceOps[Self <: BitFieldInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: Double => Boolean): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByte(value: Double => Double): Self = this.set("getByte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPages(value: PagerInstance): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (Double, Boolean) => Boolean): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetByte(value: (Double, Double) => Boolean): Self = this.set("setByte", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
  }
}
