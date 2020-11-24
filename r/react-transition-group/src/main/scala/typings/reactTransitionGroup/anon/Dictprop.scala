package typings.reactTransitionGroup.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictprop
  extends /* prop */ StringDictionary[js.Any] {
  
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.native
  
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
}
object Dictprop {
  
  @scala.inline
  def apply(): Dictprop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictprop]
  }
  
  @scala.inline
  implicit class DictpropOps[Self <: Dictprop] (val x: Self) extends AnyVal {
    
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
    def setChildFactory(value: /* child */ ReactElement => ReactElement): Self = this.set("childFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildFactory: Self = this.set("childFactory", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
