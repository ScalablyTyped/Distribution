package typings.pulumiAws.ecsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy
import typings.pulumiAws.inputMod.ecs.ClusterSetting
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterArgs extends js.Object {
  
  /**
    * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
    */
  val capacityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
    */
  val defaultCapacityProviderStrategies: js.UndefOr[Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]]] = js.native
  
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
    */
  val settings: js.UndefOr[Input[js.Array[Input[ClusterSetting]]]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ClusterArgs {
  
  @scala.inline
  def apply(): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterArgs]
  }
  
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    
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
    def setCapacityProvidersVarargs(value: Input[String]*): Self = this.set("capacityProviders", js.Array(value :_*))
    
    @scala.inline
    def setCapacityProviders(value: Input[js.Array[Input[String]]]): Self = this.set("capacityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityProviders: Self = this.set("capacityProviders", js.undefined)
    
    @scala.inline
    def setDefaultCapacityProviderStrategiesVarargs(value: Input[ClusterDefaultCapacityProviderStrategy]*): Self = this.set("defaultCapacityProviderStrategies", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCapacityProviderStrategies(value: Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]]): Self = this.set("defaultCapacityProviderStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCapacityProviderStrategies: Self = this.set("defaultCapacityProviderStrategies", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: Input[ClusterSetting]*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: Input[js.Array[Input[ClusterSetting]]]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
