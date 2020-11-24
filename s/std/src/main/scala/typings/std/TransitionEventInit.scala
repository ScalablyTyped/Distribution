package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionEventInit extends EventInit {
  
  var elapsedTime: js.UndefOr[Double] = js.native
  
  var propertyName: js.UndefOr[java.lang.String] = js.native
  
  var pseudoElement: js.UndefOr[java.lang.String] = js.native
}
object TransitionEventInit {
  
  @scala.inline
  def apply(): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionEventInit]
  }
  
  @scala.inline
  implicit class TransitionEventInitOps[Self <: TransitionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    
    @scala.inline
    def setPropertyName(value: java.lang.String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyName: Self = this.set("propertyName", js.undefined)
    
    @scala.inline
    def setPseudoElement(value: java.lang.String): Self = this.set("pseudoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePseudoElement: Self = this.set("pseudoElement", js.undefined)
  }
}
