package typings.pulumiKubernetes.inputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
  */
@js.native
trait LabelSelector extends js.Object {
  
  /**
    * matchExpressions is a list of label selector requirements. The requirements are ANDed.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[LabelSelectorRequirement]]]] = js.native
  
  /**
    * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
    */
  var matchLabels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object LabelSelector {
  
  @scala.inline
  def apply(): LabelSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSelector]
  }
  
  @scala.inline
  implicit class LabelSelectorOps[Self <: LabelSelector] (val x: Self) extends AnyVal {
    
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
    def setMatchExpressionsVarargs(value: Input[LabelSelectorRequirement]*): Self = this.set("matchExpressions", js.Array(value :_*))
    
    @scala.inline
    def setMatchExpressions(value: Input[js.Array[Input[LabelSelectorRequirement]]]): Self = this.set("matchExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchExpressions: Self = this.set("matchExpressions", js.undefined)
    
    @scala.inline
    def setMatchLabels(value: Input[StringDictionary[Input[String]]]): Self = this.set("matchLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchLabels: Self = this.set("matchLabels", js.undefined)
  }
}
