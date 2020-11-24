package typings.reactMdUtils.dirMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirProps extends js.Object {
  
  /**
    * A single ReactElement child. If the `Dir` has a parent `Dir`, the child
    * will have the `dir` prop cloned into this element.
    */
  var children: ReactElement = js.native
  
  /**
    * The default writing direction for your app or a subtree. To change the
    * current writing direction, use the `useDir` hook to get access to the
    * current `dir` and the `toggleDir` function.
    */
  var defaultDir: js.UndefOr[WritingDirection | js.Function0[WritingDirection]] = js.native
}
object DirProps {
  
  @scala.inline
  def apply(children: ReactElement): DirProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirProps]
  }
  
  @scala.inline
  implicit class DirPropsOps[Self <: DirProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDirFunction0(value: () => WritingDirection): Self = this.set("defaultDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultDir(value: WritingDirection | js.Function0[WritingDirection]): Self = this.set("defaultDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDir: Self = this.set("defaultDir", js.undefined)
  }
}
