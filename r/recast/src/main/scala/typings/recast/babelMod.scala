package typings.recast

import typings.babelParser.mod.ParserOptions
import typings.babelTypes.mod.File_
import typings.recast.anon.FnCall
import typings.recast.babelOptionsMod.Overrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelMod {
  
  @JSImport("recast/parsers/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(source: String): File_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[File_]
  inline def parse(source: String, options: Overrides): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File_]
  
  @JSImport("recast/parsers/babel", "parser")
  @js.native
  val parser: BabelParser = js.native
  
  trait BabelParser extends StObject {
    
    def parse(input: String): File_
    def parse(input: String, options: ParserOptions): File_
    @JSName("parse")
    var parse_Original: FnCall
  }
  object BabelParser {
    
    inline def apply(parse: FnCall): BabelParser = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
      __obj.asInstanceOf[BabelParser]
    }
    
    extension [Self <: BabelParser](x: Self) {
      
      inline def setParse(value: FnCall): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    }
  }
}
