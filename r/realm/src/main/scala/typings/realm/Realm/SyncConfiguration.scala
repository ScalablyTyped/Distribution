package typings.realm.Realm

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Realm.App.Sync.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncConfiguration extends js.Object {
  
  var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.native
  
  var customHttpHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  var error: js.UndefOr[ErrorCallback] = js.native
  
  var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  
  var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.native
  
  var partitionValue: String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any) | Null = js.native
  
  var user: User[DefaultFunctionsFactory, _] = js.native
}
object SyncConfiguration {
  
  @scala.inline
  def apply(user: User[DefaultFunctionsFactory, _]): SyncConfiguration = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncConfiguration]
  }
  
  @scala.inline
  implicit class SyncConfigurationOps[Self <: SyncConfiguration] (val x: Self) extends AnyVal {
    
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
    def setUser(value: User[DefaultFunctionsFactory, _]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sessionStopPolicy(value: SessionStopPolicy): Self = this.set("_sessionStopPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sessionStopPolicy: Self = this.set("_sessionStopPolicy", js.undefined)
    
    @scala.inline
    def setCustomHttpHeaders(value: StringDictionary[String]): Self = this.set("customHttpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHttpHeaders: Self = this.set("customHttpHeaders", js.undefined)
    
    @scala.inline
    def setError(value: (/* session */ Session, /* error */ SyncError) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExistingRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = this.set("existingRealmFileBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingRealmFileBehavior: Self = this.set("existingRealmFileBehavior", js.undefined)
    
    @scala.inline
    def setNewRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = this.set("newRealmFileBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewRealmFileBehavior: Self = this.set("newRealmFileBehavior", js.undefined)
    
    @scala.inline
    def setPartitionValue(
      value: String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any)
    ): Self = this.set("partitionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueNull: Self = this.set("partitionValue", null)
  }
}
