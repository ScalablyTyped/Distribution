package typings.reactVirtualizedSelect.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.react.mod.global.JSX.Element
import typings.reactVirtualizedSelect.anon.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ Option[TValue], Double])] = js.native
  
  var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], Element]] = js.native
  
  var selectComponent: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.native
}
object AdditionalVirtualizedSelectProps {
  
  @scala.inline
  def apply[TValue](): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
  
  @scala.inline
  implicit class AdditionalVirtualizedSelectPropsOps[Self <: AdditionalVirtualizedSelectProps[_], TValue] (val x: Self with AdditionalVirtualizedSelectProps[TValue]) extends AnyVal {
    
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setOptionHeightFunction1(value: /* options */ Option[TValue] => Double): Self = this.set("optionHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionHeight(value: Double | (js.Function1[/* options */ Option[TValue], Double])): Self = this.set("optionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionHeight: Self = this.set("optionHeight", js.undefined)
    
    @scala.inline
    def setOptionRenderer(value: /* options */ VirtualizedOptionRenderOptions[TValue] => Element): Self = this.set("optionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOptionRenderer: Self = this.set("optionRenderer", js.undefined)
    
    @scala.inline
    def setSelectComponent(value: (ComponentClass[_, ComponentState]) | StatelessComponent[_]): Self = this.set("selectComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectComponent: Self = this.set("selectComponent", js.undefined)
  }
}
