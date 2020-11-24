package typings.pulumiAws.inputMod.transfer

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserHomeDirectoryMapping extends js.Object {
  
  /**
    * Represents an entry and a target.
    */
  var entry: Input[String] = js.native
  
  /**
    * Represents the map target.
    */
  var target: Input[String] = js.native
}
object UserHomeDirectoryMapping {
  
  @scala.inline
  def apply(entry: Input[String], target: Input[String]): UserHomeDirectoryMapping = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserHomeDirectoryMapping]
  }
  
  @scala.inline
  implicit class UserHomeDirectoryMappingOps[Self <: UserHomeDirectoryMapping] (val x: Self) extends AnyVal {
    
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
    def setEntry(value: Input[String]): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Input[String]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
