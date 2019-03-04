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
    clone: js.Function1[LanguageDefinition, LanguageDefinition],
    encode: js.Function1[TokenNode, TokenNode],
    objId: js.Function1[js.Any, Identifier],
    `type`: js.Function1[js.Any, java.lang.String]
  ): Util = {
    val __obj = js.Dynamic.literal(clone = clone, encode = encode, objId = objId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Util]
  }
}

