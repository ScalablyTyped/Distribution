package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  /** Deep clone a language definition (e.g. to extend it) */
  def clone(o: LanguageDefinition): LanguageDefinition
  /** Encode raw strings in tokens in preparation to display as HTML */
  def encode(tokens: TokenNode): TokenNode
  /** Get the unique id of this object or give it one if it does not have one */
  def objId(obj: js.Any): Identifier
  /** Determine the type of the object */
  def `type`(o: js.Any): java.lang.String
}

object Util {
  @scala.inline
  def apply(
    clone: LanguageDefinition => LanguageDefinition,
    encode: TokenNode => TokenNode,
    objId: js.Any => Identifier,
    `type`: js.Any => java.lang.String
  ): Util = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), encode = js.Any.fromFunction1(encode), objId = js.Any.fromFunction1(objId))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Util]
  }
}

