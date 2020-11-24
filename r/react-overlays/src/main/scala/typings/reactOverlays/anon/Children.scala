package typings.reactOverlays.anon

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  /**
    * A render prop that returns a Toggle element. The `props`
    * argument should spread through to **a component that can accept a ref**. Use
    * the `onToggle` argument to toggle the menu open or closed
    *
    * @type {Function ({
    *   show: boolean,
    *   toggle: (show: boolean) => void,
    *   props: {
    *     ref: (?HTMLElement) => void,
    *     aria-haspopup: true
    *     aria-expanded: boolean
    *   },
    * }) => React.Element}
    */
  var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
}
object Children {
  
  @scala.inline
  def apply(children: Validator[js.Function1[/* repeated */ _, _]]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Validator[js.Function1[/* repeated */ _, _]]): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
