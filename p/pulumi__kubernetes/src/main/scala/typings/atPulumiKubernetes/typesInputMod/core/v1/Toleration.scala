package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple
  * <key,value,effect> using the matching operator <operator>.
  */
trait Toleration extends js.Object {
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When
    * specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If
    * the key is empty, operator must be Exists; this combination means to match all values and
    * all keys.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and
    * Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can
    * tolerate all taints of a particular category.
    */
  var operator: js.UndefOr[Input[String]] = js.undefined
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect
    * NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set,
    * which means tolerate the taint forever (do not evict). Zero and negative values will be
    * treated as 0 (evict immediately) by the system.
    */
  var tolerationSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value
    * should be empty, otherwise just a regular string.
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}

object Toleration {
  @scala.inline
  def apply(
    effect: Input[String] = null,
    key: Input[String] = null,
    operator: Input[String] = null,
    tolerationSeconds: Input[Double] = null,
    value: Input[String] = null
  ): Toleration = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (tolerationSeconds != null) __obj.updateDynamic("tolerationSeconds")(tolerationSeconds.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toleration]
  }
}

