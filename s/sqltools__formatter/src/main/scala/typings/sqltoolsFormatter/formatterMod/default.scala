package typings.sqltoolsFormatter.formatterMod

import typings.sqltoolsFormatter.typesMod.Config
import typings.sqltoolsFormatter.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sqltools/formatter/lib/core/Formatter", JSImport.Default)
@js.native
class default protected () extends Formatter {
  def this(cfg: Config, tokenizer: typings.sqltoolsFormatter.tokenizerMod.default) = this()
  def this(
    cfg: Config,
    tokenizer: typings.sqltoolsFormatter.tokenizerMod.default,
    tokenOverride: js.Function2[/* token */ Token, /* previousToken */ js.UndefOr[Token], Token]
  ) = this()
}
