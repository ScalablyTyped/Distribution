package typings.reactVerticalTimelineComponent.mod

import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typings.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalTimelineProps extends js.Object {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[`1-column` | `2-columns`] = js.native
}
object VerticalTimelineProps {
  
  @scala.inline
  def apply(): VerticalTimelineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalTimelineProps]
  }
  
  @scala.inline
  implicit class VerticalTimelinePropsOps[Self <: VerticalTimelineProps] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setLayout(value: `1-column` | `2-columns`): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
  }
}
