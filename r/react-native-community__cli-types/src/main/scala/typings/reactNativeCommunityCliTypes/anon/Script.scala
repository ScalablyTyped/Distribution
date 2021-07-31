package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Script extends StObject {
  
  var script: String
}
object Script {
  
  @scala.inline
  def apply(script: String): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  
  @scala.inline
  implicit class ScriptMutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
