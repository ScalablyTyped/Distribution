package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessProps extends js.Object {
  
  def processProps(prop: DataNode): js.Any = js.native
}
object ProcessProps {
  
  @scala.inline
  def apply(processProps: DataNode => js.Any): ProcessProps = {
    val __obj = js.Dynamic.literal(processProps = js.Any.fromFunction1(processProps))
    __obj.asInstanceOf[ProcessProps]
  }
  
  @scala.inline
  implicit class ProcessPropsOps[Self <: ProcessProps] (val x: Self) extends AnyVal {
    
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
    def setProcessProps(value: DataNode => js.Any): Self = this.set("processProps", js.Any.fromFunction1(value))
  }
}
