package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeGpus extends js.Object {
  
  var count: js.UndefOr[Double] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  /**
    * Size of the instance memory, in MiB.
    */
  var memorySize: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object GetInstanceTypeGpus {
  
  @scala.inline
  def apply(): GetInstanceTypeGpus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceTypeGpus]
  }
  
  @scala.inline
  implicit class GetInstanceTypeGpusOps[Self <: GetInstanceTypeGpus] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setMemorySize(value: Double): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySize: Self = this.set("memorySize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
