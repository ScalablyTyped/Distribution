package typings.serverless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlParserMod {
  
  @JSImport("serverless/classes/YamlParser", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with YamlParser {
    def this(serverless: typings.serverless.mod.^) = this()
    
    /* CompleteClass */
    override def parse(yamlFilePath: String): js.Promise[js.Any] = js.native
  }
  
  trait YamlParser extends StObject {
    
    def parse(yamlFilePath: String): js.Promise[js.Any]
  }
  object YamlParser {
    
    @scala.inline
    def apply(parse: String => js.Promise[js.Any]): YamlParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[YamlParser]
    }
    
    @scala.inline
    implicit class YamlParserMutableBuilder[Self <: YamlParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: String => js.Promise[js.Any]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
