package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prismjs", "Token")
@js.native
class Token protected () extends js.Object {
  /**
    * The constructor for the Prism Token class
    * @param type The type of the token
    * @param content The contents of the token
    * @param alias Aliases for the current token (added as classes to this token's HTML)
    * @param matchedStr The matched string that generated this token
    * @param greedy Value that determines whether or not this token was generated using a greedy parsing algorithm
    */
  def this(`type`: java.lang.String, content: TokenNode, alias: js.Any, matchedStr: java.lang.String, greedy: scala.Boolean) = this()
  /** Other names for this token (added as classes to this token's HTML) */
  var alias: java.lang.String = js.native
  /** The content of the token */
  var content: TokenNode = js.native
  /** The type of the token */
  var `type`: java.lang.String = js.native
}

/* static members */
@JSImport("prismjs", "Token")
@js.native
object Token extends js.Object {
  /**
    * Given a token or string input, convert it to highlighted HTML
    * @param type The token(s) to stringify
    * @param language The language definition that understands the given token(s)
    * @param parent The parent element element to pass into hook callbacks
    * @returns The HTML that represents the given token(s)
    */
  def stringify(
    token: prismjsLib.prismjsMod.TokenNode,
    language: prismjsLib.prismjsMod.LanguageDefinition,
    parent: stdLib.HTMLPreElement
  ): java.lang.String = js.native
}

