package typings.sqltoolsFormatter.abstractMod

import typings.sqltoolsFormatter.typesMod.Config
import typings.sqltoolsFormatter.typesMod.Token
import typings.sqltoolsFormatter.typesMod.TokenizerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractFormatter extends js.Object {
  
  var cfg: Config = js.native
  
  def format(query: String): String = js.native
  
  def getTokenizerConfig(): TokenizerConfig = js.native
  
  var tokenOverride: js.UndefOr[js.Function2[/* token */ Token, /* previousToken */ js.UndefOr[Token], Token]] = js.native
  
  def tokenize(query: String): js.Array[Token] = js.native
  
  def tokenizer(): typings.sqltoolsFormatter.tokenizerMod.default = js.native
}
object AbstractFormatter {
  
  @scala.inline
  def apply(
    cfg: Config,
    format: String => String,
    getTokenizerConfig: () => TokenizerConfig,
    tokenize: String => js.Array[Token],
    tokenizer: () => typings.sqltoolsFormatter.tokenizerMod.default
  ): AbstractFormatter = {
    val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), getTokenizerConfig = js.Any.fromFunction0(getTokenizerConfig), tokenize = js.Any.fromFunction1(tokenize), tokenizer = js.Any.fromFunction0(tokenizer))
    __obj.asInstanceOf[AbstractFormatter]
  }
  
  @scala.inline
  implicit class AbstractFormatterOps[Self <: AbstractFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCfg(value: Config): Self = this.set("cfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTokenizerConfig(value: () => TokenizerConfig): Self = this.set("getTokenizerConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokenize(value: String => js.Array[Token]): Self = this.set("tokenize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenizer(value: () => typings.sqltoolsFormatter.tokenizerMod.default): Self = this.set("tokenizer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokenOverride(value: (/* token */ Token, /* previousToken */ js.UndefOr[Token]) => Token): Self = this.set("tokenOverride", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTokenOverride: Self = this.set("tokenOverride", js.undefined)
  }
}
