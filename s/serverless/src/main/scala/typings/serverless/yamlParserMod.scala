package typings.serverless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlParserMod {
  
  @JSImport("serverless/classes/YamlParser", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with YamlParser {
    def this(serverless: typings.serverless.mod.^) = this()
    
    /* CompleteClass */
    override def parse(yamlFilePath: String): js.Promise[Any] = js.native
  }
  
  trait YamlParser extends StObject {
    
    def parse(yamlFilePath: String): js.Promise[Any]
  }
  object YamlParser {
    
    inline def apply(parse: String => js.Promise[Any]): YamlParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[YamlParser]
    }
    
    extension [Self <: YamlParser](x: Self) {
      
      inline def setParse(value: String => js.Promise[Any]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
