package typings.serverless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlParserMod {
  
  @JSImport("serverless/classes/YamlParser", JSImport.Namespace)
  @js.native
  class ^ protected () extends YamlParser {
    def this(serverless: typings.serverless.mod.^) = this()
  }
  
  @js.native
  trait YamlParser extends StObject {
    
    def parse(yamlFilePath: String): js.Promise[_] = js.native
  }
  object YamlParser {
    
    @scala.inline
    def apply(parse: String => js.Promise[_]): YamlParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[YamlParser]
    }
    
    @scala.inline
    implicit class YamlParserMutableBuilder[Self <: YamlParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: String => js.Promise[_]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
