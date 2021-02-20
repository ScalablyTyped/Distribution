package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var config: String = js.native
  
  var id: Double = js.native
  
  var sessionConfig: js.UndefOr[String] = js.native
  
  var suite: String = js.native
}
object Id {
  
  @scala.inline
  def apply(config: String, id: Double, suite: String): Id = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionConfig(value: String): Self = StObject.set(x, "sessionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionConfigUndefined: Self = StObject.set(x, "sessionConfig", js.undefined)
    
    @scala.inline
    def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
  }
}
