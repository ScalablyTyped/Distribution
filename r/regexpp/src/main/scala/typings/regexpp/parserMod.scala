package typings.regexpp

import typings.regexpp.astMod.Flags
import typings.regexpp.astMod.Pattern
import typings.regexpp.astMod.RegExpLiteral
import typings.regexpp.ecmaVersionsMod.EcmaVersion
import typings.regexpp.parserMod.RegExpParser.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("regexpp/parser", "RegExpParser")
  @js.native
  open class RegExpParser () extends StObject {
    def this(options: Options) = this()
    
    def parseFlags(source: String): Flags = js.native
    def parseFlags(source: String, start: Double): Flags = js.native
    def parseFlags(source: String, start: Double, end: Double): Flags = js.native
    def parseFlags(source: String, start: Unit, end: Double): Flags = js.native
    
    def parseLiteral(source: String): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Double): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Double, end: Double): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Unit, end: Double): RegExpLiteral = js.native
    
    def parsePattern(source: String): Pattern = js.native
    def parsePattern(source: String, start: Double): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Double): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Double, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Unit, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Unit, end: Double): Pattern = js.native
    def parsePattern(source: String, start: Unit, end: Double, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Unit, end: Unit, uFlag: Boolean): Pattern = js.native
  }
  object RegExpParser {
    
    trait Options extends StObject {
      
      var ecmaVersion: js.UndefOr[EcmaVersion] = js.undefined
      
      var strict: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setEcmaVersion(value: EcmaVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
        
        inline def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
        
        inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
