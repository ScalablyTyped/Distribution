package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildListTagProps extends js.Object {
  
  var parent: js.UndefOr[Obj] = js.native
  
  // TODO: hard to type
  var renderChild: js.UndefOr[js.Function1[/* child */ js.Any, _]] = js.native
  
  var tag: js.UndefOr[String] = js.native
}
object ChildListTagProps {
  
  @scala.inline
  def apply(): ChildListTagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildListTagProps]
  }
  
  @scala.inline
  implicit class ChildListTagPropsOps[Self <: ChildListTagProps] (val x: Self) extends AnyVal {
    
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
    def setParent(value: Obj): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRenderChild(value: /* child */ js.Any => _): Self = this.set("renderChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderChild: Self = this.set("renderChild", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
