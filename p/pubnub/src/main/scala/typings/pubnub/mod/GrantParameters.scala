package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// grant
trait GrantParameters extends StObject {
  
  var authKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  var delete: js.UndefOr[Boolean] = js.undefined
  
  var get: js.UndefOr[Boolean] = js.undefined
  
  var join: js.UndefOr[Boolean] = js.undefined
  
  var manage: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[Boolean] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
  
  var update: js.UndefOr[Boolean] = js.undefined
  
  var uuids: js.UndefOr[js.Array[String]] = js.undefined
  
  var write: js.UndefOr[Boolean] = js.undefined
}
object GrantParameters {
  
  @scala.inline
  def apply(): GrantParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantParameters]
  }
  
  @scala.inline
  implicit class GrantParametersMutableBuilder[Self <: GrantParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthKeys(value: js.Array[String]): Self = StObject.set(x, "authKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKeysUndefined: Self = StObject.set(x, "authKeys", js.undefined)
    
    @scala.inline
    def setAuthKeysVarargs(value: String*): Self = StObject.set(x, "authKeys", js.Array(value :_*))
    
    @scala.inline
    def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    @scala.inline
    def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setJoin(value: Boolean): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    @scala.inline
    def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageUndefined: Self = StObject.set(x, "manage", js.undefined)
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
    
    @scala.inline
    def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
