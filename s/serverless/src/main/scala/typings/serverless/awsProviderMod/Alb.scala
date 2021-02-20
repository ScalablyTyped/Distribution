package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alb extends StObject {
  
  var authorizers: js.UndefOr[Authorizers] = js.native
  
  var targetGroupPrefix: js.UndefOr[String] = js.native
}
object Alb {
  
  @scala.inline
  def apply(): Alb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alb]
  }
  
  @scala.inline
  implicit class AlbMutableBuilder[Self <: Alb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizers(value: Authorizers): Self = StObject.set(x, "authorizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizersUndefined: Self = StObject.set(x, "authorizers", js.undefined)
    
    @scala.inline
    def setTargetGroupPrefix(value: String): Self = StObject.set(x, "targetGroupPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupPrefixUndefined: Self = StObject.set(x, "targetGroupPrefix", js.undefined)
  }
}
