package typings.reactMedia.mod

import typings.react.mod.ReactNode
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-media.react-media.BaseProps & {  query :react-media.react-media.MediaQueryValue,   defaultMatches :boolean | undefined,   children :(matches : boolean): react.react.ReactNode | react.react.ReactNode | undefined,   onChange :(matches : boolean): void | undefined} */
@js.native
trait SingleQueryProps extends js.Object {
  
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode] = js.native
  
  var defaultMatches: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
  
  var query: MediaQueryValue = js.native
  
  var render: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var targetWindow: js.UndefOr[Window] = js.native
}
object SingleQueryProps {
  
  @scala.inline
  def apply(query: MediaQueryValue): SingleQueryProps = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleQueryProps]
  }
  
  @scala.inline
  implicit class SingleQueryPropsOps[Self <: SingleQueryProps] (val x: Self) extends AnyVal {
    
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
    def setQueryVarargs(value: MediaQueryObject*): Self = this.set("query", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: MediaQueryValue): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* matches */ Boolean => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: (js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultMatches(value: Boolean): Self = this.set("defaultMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMatches: Self = this.set("defaultMatches", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* matches */ Boolean => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setRender(value: () => ReactNode): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setTargetWindow(value: Window): Self = this.set("targetWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWindow: Self = this.set("targetWindow", js.undefined)
  }
}
