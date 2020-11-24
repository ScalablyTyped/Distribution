package typings.pulumiAws.trafficMirrorFilterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorFilterState extends js.Object {
  
  /**
    * A description of the filter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
    */
  val networkServices: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object TrafficMirrorFilterState {
  
  @scala.inline
  def apply(): TrafficMirrorFilterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterState]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterStateOps[Self <: TrafficMirrorFilterState] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setNetworkServicesVarargs(value: Input[String]*): Self = this.set("networkServices", js.Array(value :_*))
    
    @scala.inline
    def setNetworkServices(value: Input[js.Array[Input[String]]]): Self = this.set("networkServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkServices: Self = this.set("networkServices", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
