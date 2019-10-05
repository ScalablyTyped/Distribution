package typings.protobufjs.minimalMod

import typings.protobufjs.protobufjsMod.ITokenizerHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "tokenize")
@js.native
object tokenize extends js.Object {
  def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  def unescape(str: String): String = js.native
}

