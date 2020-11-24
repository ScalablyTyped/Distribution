package typings.rcSlider.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<rc-slider.rc-slider/lib/createSliderWithTooltip.ComponentWrapperState> */
@js.native
trait ReadonlyComponentWrapperS extends js.Object {
  
  val visibles: Record[Double, Boolean] = js.native
}
object ReadonlyComponentWrapperS {
  
  @scala.inline
  def apply(visibles: Record[Double, Boolean]): ReadonlyComponentWrapperS = {
    val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentWrapperS]
  }
  
  @scala.inline
  implicit class ReadonlyComponentWrapperSOps[Self <: ReadonlyComponentWrapperS] (val x: Self) extends AnyVal {
    
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
    def setVisibles(value: Record[Double, Boolean]): Self = this.set("visibles", value.asInstanceOf[js.Any])
  }
}
