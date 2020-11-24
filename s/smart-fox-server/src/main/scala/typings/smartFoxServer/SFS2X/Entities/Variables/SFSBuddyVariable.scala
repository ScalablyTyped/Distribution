package typings.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFSBuddyVariable extends SFSUserVariable {
  
  /**
    * Indicates whether the Buddy Variable is persistent or not.
    * @return {boolean} Returns: true if the Buddy Variable is persistent.
    */
  def isOffline(): Boolean = js.native
}
object SFSBuddyVariable {
  
  @scala.inline
  def apply(
    getTypeName: Double => String,
    isNull: () => Boolean,
    isOffline: () => Boolean,
    name: String,
    value: Double
  ): SFSBuddyVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), isOffline = js.Any.fromFunction0(isOffline), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSBuddyVariable]
  }
  
  @scala.inline
  implicit class SFSBuddyVariableOps[Self <: SFSBuddyVariable] (val x: Self) extends AnyVal {
    
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
    def setIsOffline(value: () => Boolean): Self = this.set("isOffline", js.Any.fromFunction0(value))
  }
}
