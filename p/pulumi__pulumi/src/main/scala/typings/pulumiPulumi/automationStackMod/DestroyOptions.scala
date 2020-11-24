package typings.pulumiPulumi.automationStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestroyOptions extends js.Object {
  
  var message: js.UndefOr[String] = js.native
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.native
  
  var parallel: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[js.Array[String]] = js.native
  
  var targetDependents: js.UndefOr[Boolean] = js.native
}
object DestroyOptions {
  
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  
  @scala.inline
  implicit class DestroyOptionsOps[Self <: DestroyOptions] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnOutput(value: /* out */ String => Unit): Self = this.set("onOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOutput: Self = this.set("onOutput", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetDependents(value: Boolean): Self = this.set("targetDependents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDependents: Self = this.set("targetDependents", js.undefined)
  }
}
