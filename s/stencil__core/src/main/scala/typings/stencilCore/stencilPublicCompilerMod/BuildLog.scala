package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildLog extends StObject {
  
  var buildId: Double
  
  var messages: js.Array[String]
  
  var progress: Double
}
object BuildLog {
  
  inline def apply(buildId: Double, messages: js.Array[String], progress: Double): BuildLog = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLog]
  }
  
  extension [Self <: BuildLog](x: Self) {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
