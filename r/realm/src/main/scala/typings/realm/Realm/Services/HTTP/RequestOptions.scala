package typings.realm.Realm.Services.HTTP

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to use when sending a request.
  */
@js.native
trait RequestOptions extends js.Object {
  
  // TODO: Add a link to its documentation.
  /**
    * A url to request from the service to retrieve the authorization header.
    */
  var authUrl: js.UndefOr[String] = js.native
  
  /**
    * String encoded body sent in the request.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * Cookies used when sending the request.
    */
  var cookies: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Is the body a stringified JSON object? (application/json)
    */
  var encodeBodyAsJSON: js.UndefOr[Boolean] = js.native
  
  /**
    * Should redirects be followed?
    */
  var followRedirects: js.UndefOr[Boolean] = js.native
  
  /**
    * Is the body stringified form? (multipart/form-data)
    */
  var form: js.UndefOr[Boolean] = js.native
  
  // TODO: Determine if headers could map to a single string too
  /**
    * Headers used when sending the request.
    */
  var headers: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthUrl(value: String): Self = this.set("authUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthUrl: Self = this.set("authUrl", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCookies(value: StringDictionary[String]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setEncodeBodyAsJSON(value: Boolean): Self = this.set("encodeBodyAsJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeBodyAsJSON: Self = this.set("encodeBodyAsJSON", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setForm(value: Boolean): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
