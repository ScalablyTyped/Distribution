package typings.pulumiAws.getAccessPointMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessPointArgs extends js.Object {
  
  /**
    * The ID that identifies the file system.
    */
  val accessPointId: String = js.native
  
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetAccessPointArgs {
  
  @scala.inline
  def apply(accessPointId: String): GetAccessPointArgs = {
    val __obj = js.Dynamic.literal(accessPointId = accessPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointArgs]
  }
  
  @scala.inline
  implicit class GetAccessPointArgsOps[Self <: GetAccessPointArgs] (val x: Self) extends AnyVal {
    
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
    def setAccessPointId(value: String): Self = this.set("accessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
