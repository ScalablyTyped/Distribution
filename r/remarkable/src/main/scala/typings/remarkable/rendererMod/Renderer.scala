package typings.remarkable.rendererMod

import typings.remarkable.libMod.ContentToken
import typings.remarkable.libMod.Env
import typings.remarkable.libMod.GetBreak
import typings.remarkable.libMod.Options
import typings.remarkable.libMod.Remarkable
import typings.remarkable.libMod.Rules
import typings.remarkable.libMod.Token
import typings.remarkable.remarkableStrings.Linefeed
import typings.remarkable.remarkableStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer class. Renders HTML and exposes `rules` to allow
  * local modifications.
  */
@js.native
trait Renderer extends js.Object {
  /**
    * Exported helper, for custom rules only.
    */
  @JSName("getBreak")
  var getBreak_Original: GetBreak = js.native
  var rules: Rules = js.native
  /**
    * Exported helper, for custom rules only.
    */
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: js.UndefOr[scala.Nothing],
    /**
    * The key-value store created by the parsing rules.
    */
  env: js.UndefOr[scala.Nothing],
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: js.UndefOr[scala.Nothing],
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: js.UndefOr[scala.Nothing],
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: js.UndefOr[scala.Nothing],
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed = js.native
  /**
    * Render a string of HTML with the given `tokens` and
    * `options`.
    */
  def render(tokens: js.Array[Token], options: Options, env: Env): String = js.native
  /**
    * Render a string of inline HTML with the given `tokens` and
    * `options`.
    */
  def renderInline(tokens: js.Array[Token], options: Options, env: Env): String = js.native
}

