package typings.reactMdUtils.dirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritingDirectionContext extends js.Object {
  
  /**
    * The current writing direction that is being inherited.
    */
  var dir: WritingDirection = js.native
  
  /**
    * Toggles the current writing direction for the first parent `Dir` component.
    */
  def toggleDir(): Unit = js.native
}
object WritingDirectionContext {
  
  @scala.inline
  def apply(dir: WritingDirection, toggleDir: () => Unit): WritingDirectionContext = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], toggleDir = js.Any.fromFunction0(toggleDir))
    __obj.asInstanceOf[WritingDirectionContext]
  }
  
  @scala.inline
  implicit class WritingDirectionContextOps[Self <: WritingDirectionContext] (val x: Self) extends AnyVal {
    
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
    def setDir(value: WritingDirection): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleDir(value: () => Unit): Self = this.set("toggleDir", js.Any.fromFunction0(value))
  }
}
