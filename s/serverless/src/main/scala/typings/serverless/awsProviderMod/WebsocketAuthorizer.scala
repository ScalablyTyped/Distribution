package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsocketAuthorizer extends StObject {
  
  var arn: js.UndefOr[String] = js.undefined
  
  var identitySource: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object WebsocketAuthorizer {
  
  @scala.inline
  def apply(): WebsocketAuthorizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketAuthorizer]
  }
  
  @scala.inline
  implicit class WebsocketAuthorizerMutableBuilder[Self <: WebsocketAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setIdentitySource(value: js.Array[String]): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySourceUndefined: Self = StObject.set(x, "identitySource", js.undefined)
    
    @scala.inline
    def setIdentitySourceVarargs(value: String*): Self = StObject.set(x, "identitySource", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
