package typings.pulumiKubernetes.inputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A label selector is a label query over a set of resources. The result of matchLabels and
  * matchExpressions are ANDed. An empty label selector matches all objects. A null label
  * selector matches no objects.
  */
trait LabelSelector extends js.Object {
  /**
    * matchExpressions is a list of label selector requirements. The requirements are ANDed.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[LabelSelectorRequirement]]]] = js.undefined
  /**
    * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is
    * equivalent to an element of matchExpressions, whose key field is "key", the operator is
    * "In", and the values array contains only "value". The requirements are ANDed.
    */
  var matchLabels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object LabelSelector {
  @scala.inline
  def apply(
    matchExpressions: Input[js.Array[Input[LabelSelectorRequirement]]] = null,
    matchLabels: Input[StringDictionary[Input[String]]] = null
  ): LabelSelector = {
    val __obj = js.Dynamic.literal()
    if (matchExpressions != null) __obj.updateDynamic("matchExpressions")(matchExpressions.asInstanceOf[js.Any])
    if (matchLabels != null) __obj.updateDynamic("matchLabels")(matchLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSelector]
  }
}

