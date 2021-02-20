package typings.regexpp

import typings.regexpp.astMod.Flags
import typings.regexpp.astMod.Pattern
import typings.regexpp.astMod.RegExpLiteral
import typings.regexpp.ecmaVersionsMod.EcmaVersion
import typings.regexpp.parserMod.RegExpParser.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("regexpp/parser", "RegExpParser")
  @js.native
  class RegExpParser () extends StObject {
    def this(options: Options) = this()
    
    def parseFlags(source: String): Flags = js.native
    def parseFlags(source: String, start: js.UndefOr[scala.Nothing], end: Double): Flags = js.native
    def parseFlags(source: String, start: Double): Flags = js.native
    def parseFlags(source: String, start: Double, end: Double): Flags = js.native
    
    def parseLiteral(source: String): RegExpLiteral = js.native
    def parseLiteral(source: String, start: js.UndefOr[scala.Nothing], end: Double): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Double): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Double, end: Double): RegExpLiteral = js.native
    
    def parsePattern(source: String): Pattern = js.native
    def parsePattern(source: String, start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double): Pattern = js.native
    def parsePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Double): Pattern = js.native
    def parsePattern(source: String, start: Double, end: js.UndefOr[scala.Nothing], uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Double): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Double, uFlag: Boolean): Pattern = js.native
  }
  object RegExpParser {
    
    @js.native
    trait Options extends StObject {
      
      var ecmaVersion: js.UndefOr[EcmaVersion] = js.native
      
      var strict: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEcmaVersion(value: EcmaVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
        
        @scala.inline
        def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
