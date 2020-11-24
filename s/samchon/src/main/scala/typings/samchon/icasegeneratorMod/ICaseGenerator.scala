package typings.samchon.icasegeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICaseGenerator extends js.Object {
  
  /**
    * Get index'th case.
    *
    * @param index Index number
    * @return The row of the index'th in combined permuation case
    */
  def at(index: Double): js.Array[Double] = js.native
  
  /**
    * Get size of all cases.
    *
    * @return Get a number of the all cases.
    */
  def size(): Double = js.native
}
object ICaseGenerator {
  
  @scala.inline
  def apply(at: Double => js.Array[Double], size: () => Double): ICaseGenerator = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ICaseGenerator]
  }
  
  @scala.inline
  implicit class ICaseGeneratorOps[Self <: ICaseGenerator] (val x: Self) extends AnyVal {
    
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
    def setAt(value: Double => js.Array[Double]): Self = this.set("at", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
}
