package typings.shellQuote

import org.scalablytyped.runtime.StringDictionary
import typings.shellQuote.shellQuoteStrings.glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String, env: js.UndefOr[scala.Nothing], opts: ParseOptions): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String, env: StringDictionary[js.UndefOr[String]]): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse(cmd: String, env: StringDictionary[js.UndefOr[String]], opts: ParseOptions): js.Array[ParseEntry] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]]): js.Array[ParseEntry | T] = js.native
  @JSImport("shell-quote", "parse")
  @js.native
  def parse[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]], opts: ParseOptions): js.Array[ParseEntry | T] = js.native
  
  @JSImport("shell-quote", "quote")
  @js.native
  def quote(args: js.Array[String]): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.shellQuote.shellQuoteStrings.VerticallineVerticalline
    - typings.shellQuote.shellQuoteStrings.AmpersandAmpersand
    - typings.shellQuote.shellQuoteStrings.SemicolonSemicolon
    - typings.shellQuote.shellQuoteStrings.VerticallineAmpersand
    - typings.shellQuote.shellQuoteStrings.LessthansignLeftparenthesis
    - typings.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign
    - typings.shellQuote.shellQuoteStrings.GreaterthansignAmpersand
    - typings.shellQuote.shellQuoteStrings.Ampersand
    - typings.shellQuote.shellQuoteStrings.Semicolon
    - typings.shellQuote.shellQuoteStrings.Leftparenthesis
    - typings.shellQuote.shellQuoteStrings.Rightparenthesis
    - typings.shellQuote.shellQuoteStrings.Verticalline
    - typings.shellQuote.shellQuoteStrings.Lessthansign
    - typings.shellQuote.shellQuoteStrings.Greaterthansign
  */
  trait ControlOperator extends StObject
  object ControlOperator {
    
    @scala.inline
    def Ampersand: typings.shellQuote.shellQuoteStrings.Ampersand = "&".asInstanceOf[typings.shellQuote.shellQuoteStrings.Ampersand]
    
    @scala.inline
    def AmpersandAmpersand: typings.shellQuote.shellQuoteStrings.AmpersandAmpersand = "&&".asInstanceOf[typings.shellQuote.shellQuoteStrings.AmpersandAmpersand]
    
    @scala.inline
    def Greaterthansign: typings.shellQuote.shellQuoteStrings.Greaterthansign = ">".asInstanceOf[typings.shellQuote.shellQuoteStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignAmpersand: typings.shellQuote.shellQuoteStrings.GreaterthansignAmpersand = ">&".asInstanceOf[typings.shellQuote.shellQuoteStrings.GreaterthansignAmpersand]
    
    @scala.inline
    def GreaterthansignGreaterthansign: typings.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign = ">>".asInstanceOf[typings.shellQuote.shellQuoteStrings.GreaterthansignGreaterthansign]
    
    @scala.inline
    def Leftparenthesis: typings.shellQuote.shellQuoteStrings.Leftparenthesis = "(".asInstanceOf[typings.shellQuote.shellQuoteStrings.Leftparenthesis]
    
    @scala.inline
    def Lessthansign: typings.shellQuote.shellQuoteStrings.Lessthansign = "<".asInstanceOf[typings.shellQuote.shellQuoteStrings.Lessthansign]
    
    @scala.inline
    def LessthansignLeftparenthesis: typings.shellQuote.shellQuoteStrings.LessthansignLeftparenthesis = "<(".asInstanceOf[typings.shellQuote.shellQuoteStrings.LessthansignLeftparenthesis]
    
    @scala.inline
    def Rightparenthesis: typings.shellQuote.shellQuoteStrings.Rightparenthesis = ")".asInstanceOf[typings.shellQuote.shellQuoteStrings.Rightparenthesis]
    
    @scala.inline
    def Semicolon: typings.shellQuote.shellQuoteStrings.Semicolon = ";".asInstanceOf[typings.shellQuote.shellQuoteStrings.Semicolon]
    
    @scala.inline
    def SemicolonSemicolon: typings.shellQuote.shellQuoteStrings.SemicolonSemicolon = ";;".asInstanceOf[typings.shellQuote.shellQuoteStrings.SemicolonSemicolon]
    
    @scala.inline
    def Verticalline: typings.shellQuote.shellQuoteStrings.Verticalline = "|".asInstanceOf[typings.shellQuote.shellQuoteStrings.Verticalline]
    
    @scala.inline
    def VerticallineAmpersand: typings.shellQuote.shellQuoteStrings.VerticallineAmpersand = "|&".asInstanceOf[typings.shellQuote.shellQuoteStrings.VerticallineAmpersand]
    
    @scala.inline
    def VerticallineVerticalline: typings.shellQuote.shellQuoteStrings.VerticallineVerticalline = "||".asInstanceOf[typings.shellQuote.shellQuoteStrings.VerticallineVerticalline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.shellQuote.anon.Op
    - typings.shellQuote.anon.Pattern
    - typings.shellQuote.anon.Comment
  */
  type ParseEntry = _ParseEntry | String
  
  @js.native
  trait ParseOptions extends StObject {
    
    /**
      * Custom escape character, default value is `\`
      */
    var escape: js.UndefOr[String] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    }
  }
  
  trait _ParseEntry extends StObject
  object _ParseEntry {
    
    @scala.inline
    def Comment(comment: String): typings.shellQuote.anon.Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shellQuote.anon.Comment]
    }
    
    @scala.inline
    def Op(op: ControlOperator): typings.shellQuote.anon.Op = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shellQuote.anon.Op]
    }
    
    @scala.inline
    def Pattern(op: glob, pattern: String): typings.shellQuote.anon.Pattern = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shellQuote.anon.Pattern]
    }
  }
}
