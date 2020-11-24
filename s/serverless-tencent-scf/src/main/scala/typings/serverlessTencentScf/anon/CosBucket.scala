package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CosBucket extends js.Object {
  
  var cosBucket: Appid = js.native
  
  var cosNotificationId: String = js.native
  
  var cosObject: Key = js.native
  
  var cosSchemaVersion: String = js.native
}
object CosBucket {
  
  @scala.inline
  def apply(cosBucket: Appid, cosNotificationId: String, cosObject: Key, cosSchemaVersion: String): CosBucket = {
    val __obj = js.Dynamic.literal(cosBucket = cosBucket.asInstanceOf[js.Any], cosNotificationId = cosNotificationId.asInstanceOf[js.Any], cosObject = cosObject.asInstanceOf[js.Any], cosSchemaVersion = cosSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CosBucket]
  }
  
  @scala.inline
  implicit class CosBucketOps[Self <: CosBucket] (val x: Self) extends AnyVal {
    
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
    def setCosBucket(value: Appid): Self = this.set("cosBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosNotificationId(value: String): Self = this.set("cosNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosObject(value: Key): Self = this.set("cosObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosSchemaVersion(value: String): Self = this.set("cosSchemaVersion", value.asInstanceOf[js.Any])
  }
}
