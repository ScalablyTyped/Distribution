package typings
package remarkableLib.libRendererMod

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
  var getBreak_Original: remarkableLib.libMod.GetBreak = js.native
  var rules: remarkableLib.libMod.Rules = js.native
  /**
    * Exported helper, for custom rules only.
    */
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[remarkableLib.libMod.ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double
  ): remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[remarkableLib.libMod.ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: remarkableLib.libMod.Options
  ): remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[remarkableLib.libMod.ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: remarkableLib.libMod.Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: remarkableLib.libMod.Env
  ): remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[remarkableLib.libMod.ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: remarkableLib.libMod.Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: remarkableLib.libMod.Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: remarkableLib.libMod.Remarkable
  ): remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn = js.native
  /**
    * Render a string of HTML with the given `tokens` and
    * `options`.
    */
  def render(
    tokens: js.Array[remarkableLib.libMod.Token],
    options: remarkableLib.libMod.Options,
    env: remarkableLib.libMod.Env
  ): java.lang.String = js.native
  /**
    * Render a string of inline HTML with the given `tokens` and
    * `options`.
    */
  def renderInline(
    tokens: js.Array[remarkableLib.libMod.Token],
    options: remarkableLib.libMod.Options,
    env: remarkableLib.libMod.Env
  ): java.lang.String = js.native
}

