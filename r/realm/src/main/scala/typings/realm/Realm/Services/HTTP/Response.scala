package typings.realm.Realm.Services.HTTP

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  */
@js.native
trait Response extends js.Object {
  
  /**
    * A BSON binary representation of the body.
    */
  var body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ js.Any = js.native
  
  /**
    * The length of the content.
    */
  var contentLength: Double = js.native
  
  /**
    * The headers of the response.
    */
  var headers: StringDictionary[js.Array[String]] = js.native
  
  /**
    * A text representation of the status.
    */
  var status: String = js.native
  
  /**
    * The nummeric status code.
    */
  var statusCode: Double = js.native
}
object Response {
  
  @scala.inline
  def apply(
    body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ js.Any,
    contentLength: Double,
    headers: StringDictionary[js.Array[String]],
    status: String,
    statusCode: Double
  ): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ js.Any
    ): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
