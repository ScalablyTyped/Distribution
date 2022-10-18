package typings.shellQuote

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shell-quote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(cmd: String): js.Array[ParseEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParseEntry]]
  inline def parse(cmd: String, env: StringDictionary[js.UndefOr[String]]): js.Array[ParseEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry]]
  inline def parse(cmd: String, env: StringDictionary[js.UndefOr[String]], opts: ParseOptions): js.Array[ParseEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry]]
  inline def parse(cmd: String, env: Unit, opts: ParseOptions): js.Array[ParseEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry]]
  inline def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]]): js.Array[ParseEntry | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry | T]]
  inline def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]], opts: ParseOptions): js.Array[ParseEntry | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cmd.asInstanceOf[js.Any], env.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseEntry | T]]
  
  inline def quote(args: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object ControlOperator {
    
    inline def Ampersand: typings.shellQuote.shellQuoteStrings.Ampersand = "&".asInstanceOf[typings.shellQuote.shellQuoteStrings.Ampersand]
    
    inline def AmpersandAmpersand: typings.shellQuote.shellQuoteStrings.AmpersandAmpersand = "&&".asInstanceOf[typings.shellQuote.shellQuoteStrings.AmpersandAmpersand]
    
    inline def Greaterthansign: typings.shellQuote.shellQuoteStrings.Greaterthansign = ">".asInstanceOf[typings.shellQuote.shellQuoteStrings.Greaterthansign]
    
    inline def GreaterthansignAmpersand: typings.shellQuote.shellQuoteStrings.GreaterthansignAmpersand = ">&".asInstanceOf[typings.shellQuote.shellQuoteStrings.GreaterthansignAmpersand]
    
    inline def GreaterthansignGreaterthansign: typings.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign = ">>".asInstanceOf[typings.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign]
    
    inline def Leftparenthesis: /* ( */ String = "(".asInstanceOf[/* ( */ String]
    
    inline def Lessthansign: typings.shellQuote.shellQuoteStrings.Lessthansign = "<".asInstanceOf[typings.shellQuote.shellQuoteStrings.Lessthansign]
    
    inline def LessthansignLeftparenthesis: /* <( */ String = "<(".asInstanceOf[/* <( */ String]
    
    inline def Rightparenthesis: /* ) */ String = ")".asInstanceOf[/* ) */ String]
    
    inline def Semicolon: typings.shellQuote.shellQuoteStrings.Semicolon = ";".asInstanceOf[typings.shellQuote.shellQuoteStrings.Semicolon]
    
    inline def SemicolonSemicolon: typings.shellQuote.shellQuoteStrings.SemicolonSemicolon = ";;".asInstanceOf[typings.shellQuote.shellQuoteStrings.SemicolonSemicolon]
    
    inline def Verticalline: typings.shellQuote.shellQuoteStrings.Verticalline = "|".asInstanceOf[typings.shellQuote.shellQuoteStrings.Verticalline]
    
    inline def VerticallineAmpersand: typings.shellQuote.shellQuoteStrings.VerticallineAmpersand = "|&".asInstanceOf[typings.shellQuote.shellQuoteStrings.VerticallineAmpersand]
    
    inline def VerticallineVerticalline: typings.shellQuote.shellQuoteStrings.VerticallineVerticalline = "||".asInstanceOf[typings.shellQuote.shellQuoteStrings.VerticallineVerticalline]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.shellQuote.shellQuoteStrings.VerticallineVerticalline
    - typings.shellQuote.shellQuoteStrings.AmpersandAmpersand
    - typings.shellQuote.shellQuoteStrings.SemicolonSemicolon
    - typings.shellQuote.shellQuoteStrings.VerticallineAmpersand
    - / * <( * / java.lang.String
    - typings.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign
    - typings.shellQuote.shellQuoteStrings.GreaterthansignAmpersand
    - typings.shellQuote.shellQuoteStrings.Ampersand
    - typings.shellQuote.shellQuoteStrings.Semicolon
    - typings.shellQuote.shellQuoteStrings.Verticalline
    - typings.shellQuote.shellQuoteStrings.Lessthansign
    - typings.shellQuote.shellQuoteStrings.Greaterthansign
  */
  type ControlOperator = _ControlOperator | (/* <( */ String)
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.shellQuote.anon.Op
    - typings.shellQuote.anon.Pattern
    - typings.shellQuote.anon.Comment
  */
  type ParseEntry = _ParseEntry | String
  
  trait ParseOptions extends StObject {
    
    /**
      * Custom escape character, default value is `\`
      */
    var escape: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    }
  }
  
  trait _ControlOperator extends StObject
  
  trait _ParseEntry extends StObject
  object _ParseEntry {
    
    inline def Comment(comment: String): typings.shellQuote.anon.Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shellQuote.anon.Comment]
    }
    
    inline def Op(op: ControlOperator): typings.shellQuote.anon.Op = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shellQuote.anon.Op]
    }
    
    inline def Pattern(pattern: String): typings.shellQuote.anon.Pattern = {
      val __obj = js.Dynamic.literal(op = "glob", pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shellQuote.anon.Pattern]
    }
  }
}
