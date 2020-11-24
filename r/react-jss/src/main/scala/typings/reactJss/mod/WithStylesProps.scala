package typings.reactJss.mod

import typings.jss.mod.Classes
import typings.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends js.Object {
  
  var classes: Classes[/* keyof S */ String] = js.native
}
object WithStylesProps {
  
  @scala.inline
  def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[/* keyof S */ String]): WithStylesProps[S] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesProps[S]]
  }
  
  @scala.inline
  implicit class WithStylesPropsOps[Self <: WithStylesProps[_], S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] (val x: Self with WithStylesProps[S]) extends AnyVal {
    
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
    def setClasses(value: Classes[/* keyof S */ String]): Self = this.set("classes", value.asInstanceOf[js.Any])
  }
}
