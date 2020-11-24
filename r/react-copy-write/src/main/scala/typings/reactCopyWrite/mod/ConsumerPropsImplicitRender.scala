package typings.reactCopyWrite.mod

import typings.react.mod.global.JSX.Element
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerPropsImplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  
  var children: js.UndefOr[RenderFn[T]] = js.native
}
object ConsumerPropsImplicitRender {
  
  @scala.inline
  def apply[T](): ConsumerPropsImplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsImplicitRenderOps[Self <: ConsumerPropsImplicitRender[_], T] (val x: Self with ConsumerPropsImplicitRender[T]) extends AnyVal {
    
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
    def setChildren(value: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
