package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
  */
@js.native
trait Toleration extends js.Object {
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: js.UndefOr[Input[String]] = js.native
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
    */
  var key: js.UndefOr[Input[String]] = js.native
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
    */
  var operator: js.UndefOr[Input[String]] = js.native
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
    */
  var tolerationSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object Toleration {
  @scala.inline
  def apply(): Toleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toleration]
  }
  @scala.inline
  implicit class TolerationOps[Self <: Toleration] (val x: Self) extends AnyVal {
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
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOperator(value: Input[String]): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setTolerationSeconds(value: Input[Double]): Self = this.set("tolerationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerationSeconds: Self = this.set("tolerationSeconds", js.undefined)
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

