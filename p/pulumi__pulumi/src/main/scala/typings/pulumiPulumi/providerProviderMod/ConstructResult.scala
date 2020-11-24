package typings.pulumiPulumi.providerProviderMod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructResult extends js.Object {
  
  /**
    * Any state that was computed during construction.
    */
  val state: Inputs = js.native
  
  /**
    * The URN of the constructed resource.
    */
  val urn: Input[URN] = js.native
}
object ConstructResult {
  
  @scala.inline
  def apply(state: Inputs, urn: Input[URN]): ConstructResult = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructResult]
  }
  
  @scala.inline
  implicit class ConstructResultOps[Self <: ConstructResult] (val x: Self) extends AnyVal {
    
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
    def setState(value: Inputs): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrn(value: Input[URN]): Self = this.set("urn", value.asInstanceOf[js.Any])
  }
}
