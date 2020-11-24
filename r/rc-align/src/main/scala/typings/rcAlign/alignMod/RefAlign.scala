package typings.rcAlign.alignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefAlign extends js.Object {
  
  def forceAlign(): Unit = js.native
}
object RefAlign {
  
  @scala.inline
  def apply(forceAlign: () => Unit): RefAlign = {
    val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign))
    __obj.asInstanceOf[RefAlign]
  }
  
  @scala.inline
  implicit class RefAlignOps[Self <: RefAlign] (val x: Self) extends AnyVal {
    
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
    def setForceAlign(value: () => Unit): Self = this.set("forceAlign", js.Any.fromFunction0(value))
  }
}
