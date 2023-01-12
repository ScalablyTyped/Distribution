package typings.snyk.anon

import typings.needle.mod.NeedleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: Any
  
  var res: NeedleResponse
}
object Body {
  
  inline def apply(body: Any, res: NeedleResponse): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NeedleResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
