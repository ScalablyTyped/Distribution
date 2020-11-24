package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalClusterGlobalClusterMember extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of member DB Cluster
    */
  var dbClusterArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the member is the primary DB Cluster
    */
  var isWriter: js.UndefOr[Input[Boolean]] = js.native
}
object GlobalClusterGlobalClusterMember {
  
  @scala.inline
  def apply(): GlobalClusterGlobalClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClusterGlobalClusterMember]
  }
  
  @scala.inline
  implicit class GlobalClusterGlobalClusterMemberOps[Self <: GlobalClusterGlobalClusterMember] (val x: Self) extends AnyVal {
    
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
    def setDbClusterArn(value: Input[String]): Self = this.set("dbClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterArn: Self = this.set("dbClusterArn", js.undefined)
    
    @scala.inline
    def setIsWriter(value: Input[Boolean]): Self = this.set("isWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWriter: Self = this.set("isWriter", js.undefined)
  }
}
