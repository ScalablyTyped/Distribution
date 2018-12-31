package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenizerHandle extends js.Object {
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  @JSName("cmnt")
  var cmnt_Original: protobufjsLib.TokenizerHandleCmnt = js.native
  /** Current line number */
  var line: scala.Double = js.native
  /** Gets the next token and advances (`null` on eof) */
  @JSName("next")
  var next_Original: protobufjsLib.TokenizerHandleNext = js.native
  /** Peeks for the next token (`null` on eof) */
  @JSName("peek")
  var peek_Original: protobufjsLib.TokenizerHandlePeek = js.native
  /** Pushes a token back to the stack */
  @JSName("push")
  var push_Original: protobufjsLib.TokenizerHandlePush = js.native
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  @JSName("skip")
  var skip_Original: protobufjsLib.TokenizerHandleSkip = js.native
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  def cmnt(): java.lang.String | scala.Null = js.native
  def cmnt(line: scala.Double): java.lang.String | scala.Null = js.native
  /** Gets the next token and advances (`null` on eof) */
  def next(): java.lang.String | scala.Null = js.native
  /** Peeks for the next token (`null` on eof) */
  def peek(): java.lang.String | scala.Null = js.native
  /** Pushes a token back to the stack */
  def push(token: java.lang.String): scala.Unit = js.native
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  def skip(expected: java.lang.String): scala.Boolean = js.native
  def skip(expected: java.lang.String, optional: scala.Boolean): scala.Boolean = js.native
}

