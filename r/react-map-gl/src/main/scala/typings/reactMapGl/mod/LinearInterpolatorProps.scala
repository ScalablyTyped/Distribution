package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearInterpolatorProps extends js.Object {
  
  var around: js.UndefOr[js.Array[Double]] = js.native
  
  var transitionProps: js.UndefOr[js.Array[String]] = js.native
}
object LinearInterpolatorProps {
  
  @scala.inline
  def apply(): LinearInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearInterpolatorProps]
  }
  
  @scala.inline
  implicit class LinearInterpolatorPropsOps[Self <: LinearInterpolatorProps] (val x: Self) extends AnyVal {
    
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
    def setAroundVarargs(value: Double*): Self = this.set("around", js.Array(value :_*))
    
    @scala.inline
    def setAround(value: js.Array[Double]): Self = this.set("around", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAround: Self = this.set("around", js.undefined)
    
    @scala.inline
    def setTransitionPropsVarargs(value: String*): Self = this.set("transitionProps", js.Array(value :_*))
    
    @scala.inline
    def setTransitionProps(value: js.Array[String]): Self = this.set("transitionProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionProps: Self = this.set("transitionProps", js.undefined)
  }
}
