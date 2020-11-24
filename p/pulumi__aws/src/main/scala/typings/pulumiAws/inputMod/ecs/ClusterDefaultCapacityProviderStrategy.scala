package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterDefaultCapacityProviderStrategy extends js.Object {
  
  /**
    * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
    */
  var base: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: Input[String] = js.native
  
  /**
    * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
    */
  var weight: js.UndefOr[Input[Double]] = js.native
}
object ClusterDefaultCapacityProviderStrategy {
  
  @scala.inline
  def apply(capacityProvider: Input[String]): ClusterDefaultCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterDefaultCapacityProviderStrategy]
  }
  
  @scala.inline
  implicit class ClusterDefaultCapacityProviderStrategyOps[Self <: ClusterDefaultCapacityProviderStrategy] (val x: Self) extends AnyVal {
    
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
    def setCapacityProvider(value: Input[String]): Self = this.set("capacityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Input[Double]): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setWeight(value: Input[Double]): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
