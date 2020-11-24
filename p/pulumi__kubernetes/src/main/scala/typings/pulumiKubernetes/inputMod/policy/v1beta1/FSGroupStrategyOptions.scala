package typings.pulumiKubernetes.inputMod.policy.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
  */
@js.native
trait FSGroupStrategyOptions extends js.Object {
  
  /**
    * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.native
  
  /**
    * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.native
}
object FSGroupStrategyOptions {
  
  @scala.inline
  def apply(): FSGroupStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSGroupStrategyOptions]
  }
  
  @scala.inline
  implicit class FSGroupStrategyOptionsOps[Self <: FSGroupStrategyOptions] (val x: Self) extends AnyVal {
    
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
    def setRangesVarargs(value: Input[IDRange]*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: Input[js.Array[Input[IDRange]]]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setRule(value: Input[String]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
