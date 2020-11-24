package typings.reactNativeFirebase.mod.RNFirebase.database

import typings.reactNativeFirebase.anon.TIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseStatics extends js.Object {
  
  /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
  var ServerValue: TIMESTAMP = js.native
}
object DatabaseStatics {
  
  @scala.inline
  def apply(ServerValue: TIMESTAMP): DatabaseStatics = {
    val __obj = js.Dynamic.literal(ServerValue = ServerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseStatics]
  }
  
  @scala.inline
  implicit class DatabaseStaticsOps[Self <: DatabaseStatics] (val x: Self) extends AnyVal {
    
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
    def setServerValue(value: TIMESTAMP): Self = this.set("ServerValue", value.asInstanceOf[js.Any])
  }
}
