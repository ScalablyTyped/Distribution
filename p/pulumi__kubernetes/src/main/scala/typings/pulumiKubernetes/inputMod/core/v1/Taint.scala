package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The node this Taint is attached to has the "effect" on any pod that does not tolerate the Taint.
  */
@js.native
trait Taint extends js.Object {
  
  /**
    * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: Input[String] = js.native
  
  /**
    * Required. The taint key to be applied to a node.
    */
  var key: Input[String] = js.native
  
  /**
    * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
    */
  var timeAdded: js.UndefOr[Input[String]] = js.native
  
  /**
    * The taint value corresponding to the taint key.
    */
  var value: js.UndefOr[Input[String]] = js.native
}
object Taint {
  
  @scala.inline
  def apply(effect: Input[String], key: Input[String]): Taint = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Taint]
  }
  
  @scala.inline
  implicit class TaintOps[Self <: Taint] (val x: Self) extends AnyVal {
    
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
    def setEffect(value: Input[String]): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAdded(value: Input[String]): Self = this.set("timeAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeAdded: Self = this.set("timeAdded", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
