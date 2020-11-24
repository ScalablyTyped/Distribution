package typings.realm.Realm.Auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authentication provider where users identify using an API-key.
  */
@js.native
trait ApiKeyAuth extends js.Object {
  
  /**
    * Creates an API key that can be used to authenticate as the current user.
    *
    * @param name the name of the API key to be created.
    */
  def create(name: String): js.Promise[ApiKey] = js.native
  
  /**
    * Deletes an API key associated with the current user.
    *
    * @param keyId the id of the API key to delete
    */
  def delete(keyId: String): js.Promise[Unit] = js.native
  
  /**
    * Disable an API key associated with the current user.
    *
    * @param keyId the id of the API key to disable
    */
  def disable(keyId: String): js.Promise[Unit] = js.native
  
  /**
    * Enables an API key associated with the current user.
    *
    * @param keyId the id of the API key to enable
    */
  def enable(keyId: String): js.Promise[Unit] = js.native
  
  /**
    * Fetches an API key associated with the current user.
    *
    * @param keyId the id of the API key to fetch.
    */
  def fetch(keyId: String): js.Promise[ApiKey] = js.native
  
  /**
    * Fetches the API keys associated with the current user.
    */
  def fetchAll(): js.Promise[js.Array[ApiKey]] = js.native
}
object ApiKeyAuth {
  
  @scala.inline
  def apply(
    create: String => js.Promise[ApiKey],
    delete: String => js.Promise[Unit],
    disable: String => js.Promise[Unit],
    enable: String => js.Promise[Unit],
    fetch: String => js.Promise[ApiKey],
    fetchAll: () => js.Promise[js.Array[ApiKey]]
  ): ApiKeyAuth = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), fetch = js.Any.fromFunction1(fetch), fetchAll = js.Any.fromFunction0(fetchAll))
    __obj.asInstanceOf[ApiKeyAuth]
  }
  
  @scala.inline
  implicit class ApiKeyAuthOps[Self <: ApiKeyAuth] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: String => js.Promise[ApiKey]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: String => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnable(value: String => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFetch(value: String => js.Promise[ApiKey]): Self = this.set("fetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFetchAll(value: () => js.Promise[js.Array[ApiKey]]): Self = this.set("fetchAll", js.Any.fromFunction0(value))
  }
}
