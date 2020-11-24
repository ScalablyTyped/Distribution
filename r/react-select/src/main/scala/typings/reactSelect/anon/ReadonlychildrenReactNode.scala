package typings.reactSelect.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlychildrenReactNode extends js.Object {
  
  val children: js.UndefOr[ReactNode] = js.native
}
object ReadonlychildrenReactNode {
  
  @scala.inline
  def apply(): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
  
  @scala.inline
  implicit class ReadonlychildrenReactNodeOps[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
