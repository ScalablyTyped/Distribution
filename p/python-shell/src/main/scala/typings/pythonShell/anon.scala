package typings.pythonShell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Json extends StObject {
    
    def json(data: Any): String
    
    def text(data: Any): String
  }
  object Json {
    
    inline def apply(json: Any => String, text: Any => String): Json = {
      val __obj = js.Dynamic.literal(json = js.Any.fromFunction1(json), text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[Json]
    }
    
    extension [Self <: Json](x: Self) {
      
      inline def setJson(value: Any => String): Self = StObject.set(x, "json", js.Any.fromFunction1(value))
      
      inline def setText(value: Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    }
  }
  
  trait Stderr extends StObject {
    
    var stderr: String
    
    var stdout: String
  }
  object Stderr {
    
    inline def apply(stderr: String, stdout: String): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    extension [Self <: Stderr](x: Self) {
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    def json(data: String): Any
    
    def text(data: Any): String
  }
  object Text {
    
    inline def apply(json: String => Any, text: Any => String): Text = {
      val __obj = js.Dynamic.literal(json = js.Any.fromFunction1(json), text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setJson(value: String => Any): Self = StObject.set(x, "json", js.Any.fromFunction1(value))
      
      inline def setText(value: Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    }
  }
}
