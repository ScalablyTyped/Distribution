package typings.pulumiAws.getAccessPointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessPointsResult extends js.Object {
  
  /**
    * Set of Amazon Resource Names (ARNs).
    */
  val arns: js.Array[String] = js.native
  
  val fileSystemId: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Set of identifiers.
    */
  val ids: js.Array[String] = js.native
}
object GetAccessPointsResult {
  
  @scala.inline
  def apply(arns: js.Array[String], fileSystemId: String, id: String, ids: js.Array[String]): GetAccessPointsResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointsResult]
  }
  
  @scala.inline
  implicit class GetAccessPointsResultOps[Self <: GetAccessPointsResult] (val x: Self) extends AnyVal {
    
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
    def setArnsVarargs(value: String*): Self = this.set("arns", js.Array(value :_*))
    
    @scala.inline
    def setArns(value: js.Array[String]): Self = this.set("arns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
  }
}
