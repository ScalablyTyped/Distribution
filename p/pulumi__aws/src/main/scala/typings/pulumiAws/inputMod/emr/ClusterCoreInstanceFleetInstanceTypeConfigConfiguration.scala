package typings.pulumiAws.inputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleetInstanceTypeConfigConfiguration extends js.Object {
  
  /**
    * The classification within a configuration.
    */
  var classification: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[Input[StringDictionary[_]]] = js.native
}
object ClusterCoreInstanceFleetInstanceTypeConfigConfiguration {
  
  @scala.inline
  def apply(): ClusterCoreInstanceFleetInstanceTypeConfigConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetInstanceTypeConfigConfigurationOps[Self <: ClusterCoreInstanceFleetInstanceTypeConfigConfiguration] (val x: Self) extends AnyVal {
    
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
    def setClassification(value: Input[String]): Self = this.set("classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("classification", js.undefined)
    
    @scala.inline
    def setProperties(value: Input[StringDictionary[_]]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
