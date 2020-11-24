package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Spacer element shown in widget._
  * @see https://docs.scriptable.app/widgetspacer
  */
@js.native
trait WidgetSpacer extends js.Object {
  
  /**
    * _Amount of space this spacer consumes._
    * @see https://docs.scriptable.app/widgetspacer/#length
    */
  var length: Double = js.native
}
object WidgetSpacer {
  
  @scala.inline
  def apply(length: Double): WidgetSpacer = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSpacer]
  }
  
  @scala.inline
  implicit class WidgetSpacerOps[Self <: WidgetSpacer] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
