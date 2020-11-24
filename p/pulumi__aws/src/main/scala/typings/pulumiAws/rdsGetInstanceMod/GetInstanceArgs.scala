package typings.pulumiAws.rdsGetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceArgs extends js.Object {
  
  /**
    * The name of the RDS instance
    */
  val dbInstanceIdentifier: String = js.native
  
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetInstanceArgs {
  
  @scala.inline
  def apply(dbInstanceIdentifier: String): GetInstanceArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceArgs]
  }
  
  @scala.inline
  implicit class GetInstanceArgsOps[Self <: GetInstanceArgs] (val x: Self) extends AnyVal {
    
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
    def setDbInstanceIdentifier(value: String): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
