package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetInstanceTypeConfigConfiguration extends js.Object {
  
  /**
    * The classification within a configuration.
    */
  var classification: js.UndefOr[String] = js.native
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object InstanceFleetInstanceTypeConfigConfiguration {
  
  @scala.inline
  def apply(): InstanceFleetInstanceTypeConfigConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetInstanceTypeConfigConfiguration]
  }
  
  @scala.inline
  implicit class InstanceFleetInstanceTypeConfigConfigurationOps[Self <: InstanceFleetInstanceTypeConfigConfiguration] (val x: Self) extends AnyVal {
    
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
    def setClassification(value: String): Self = this.set("classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("classification", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
