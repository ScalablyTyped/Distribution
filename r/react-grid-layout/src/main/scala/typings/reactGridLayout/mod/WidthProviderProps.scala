package typings.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidthProviderProps extends js.Object {
  
  /**
    * If true, WidthProvider will measure the container's width before mounting children.
    * Use this if you'd like to completely eliminate any resizing animation on
    * application/component mount.
    */
  var measureBeforeMount: js.UndefOr[Boolean] = js.native
}
object WidthProviderProps {
  
  @scala.inline
  def apply(): WidthProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProviderProps]
  }
  
  @scala.inline
  implicit class WidthProviderPropsOps[Self <: WidthProviderProps] (val x: Self) extends AnyVal {
    
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
    def setMeasureBeforeMount(value: Boolean): Self = this.set("measureBeforeMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureBeforeMount: Self = this.set("measureBeforeMount", js.undefined)
  }
}
