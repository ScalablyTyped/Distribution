package typings.pulumiAws.globalTableMod

import typings.pulumiAws.inputMod.dynamodb.GlobalTableReplica
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTableState extends js.Object {
  
  /**
    * The ARN of the DynamoDB Global Table
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: js.UndefOr[Input[js.Array[Input[GlobalTableReplica]]]] = js.native
}
object GlobalTableState {
  
  @scala.inline
  def apply(): GlobalTableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableState]
  }
  
  @scala.inline
  implicit class GlobalTableStateOps[Self <: GlobalTableState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: Input[GlobalTableReplica]*): Self = this.set("replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: Input[js.Array[Input[GlobalTableReplica]]]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
  }
}
