package typings.reactVirtualized.esInfiniteLoaderMod

import typings.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteLoaderChildProps extends js.Object {
  
  def onRowsRendered(params: IndexRange): Unit = js.native
  
  def registerChild(registeredChild: js.Any): Unit = js.native
}
object InfiniteLoaderChildProps {
  
  @scala.inline
  def apply(onRowsRendered: IndexRange => Unit, registerChild: js.Any => Unit): InfiniteLoaderChildProps = {
    val __obj = js.Dynamic.literal(onRowsRendered = js.Any.fromFunction1(onRowsRendered), registerChild = js.Any.fromFunction1(registerChild))
    __obj.asInstanceOf[InfiniteLoaderChildProps]
  }
  
  @scala.inline
  implicit class InfiniteLoaderChildPropsOps[Self <: InfiniteLoaderChildProps] (val x: Self) extends AnyVal {
    
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
    def setOnRowsRendered(value: IndexRange => Unit): Self = this.set("onRowsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterChild(value: js.Any => Unit): Self = this.set("registerChild", js.Any.fromFunction1(value))
  }
}
