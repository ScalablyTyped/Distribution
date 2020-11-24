package typings.reactCircularProgressbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var pathColor: js.UndefOr[String] = js.native
  
  var pathTransition: js.UndefOr[String] = js.native
  
  var pathTransitionDuration: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var strokeLinecap: js.UndefOr[js.Any] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var textSize: js.UndefOr[String | Double] = js.native
  
  var trailColor: js.UndefOr[String] = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setPathColor(value: String): Self = this.set("pathColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathColor: Self = this.set("pathColor", js.undefined)
    
    @scala.inline
    def setPathTransition(value: String): Self = this.set("pathTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathTransition: Self = this.set("pathTransition", js.undefined)
    
    @scala.inline
    def setPathTransitionDuration(value: Double): Self = this.set("pathTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathTransitionDuration: Self = this.set("pathTransitionDuration", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: js.Any): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: String | Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
    
    @scala.inline
    def setTrailColor(value: String): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailColor: Self = this.set("trailColor", js.undefined)
  }
}
