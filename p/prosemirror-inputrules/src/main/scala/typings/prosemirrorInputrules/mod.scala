package typings.prosemirrorInputrules

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-inputrules", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InputRule[S /* <: Schema[_, _] */] protected () extends js.Object {
    /**
      * Create an input rule. The rule applies when the user typed
      * something and the text directly in front of the cursor matches
      * `match`, which should probably end with `$`.
      *
      * The `handler` can be a string, in which case the matched text, or
      * the first matched group in the regexp, is replaced by that
      * string.
      *
      * Or a it can be a function, which will be called with the match
      * array produced by
      * [`RegExp.exec`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/exec),
      * as well as the start and end of the matched range, and which can
      * return a [transaction](#state.Transaction) that describes the
      * rule's effect, or null to indicate the input was not handled.
      */
    def this(`match`: RegExp, handler: String) = this()
    def this(
      `match`: RegExp,
      handler: js.Function4[
            /* state */ EditorState[S], 
            /* match */ js.Array[String], 
            /* start */ Double, 
            /* end */ Double, 
            Transaction[S] | Null
          ]
    ) = this()
  }
  
  var closeDoubleQuote: InputRule[js.Any] = js.native
  var closeSingleQuote: InputRule[js.Any] = js.native
  var ellipsis: InputRule[js.Any] = js.native
  var emDash: InputRule[js.Any] = js.native
  var openDoubleQuote: InputRule[js.Any] = js.native
  var openSingleQuote: InputRule[js.Any] = js.native
  var smartQuotes: js.Array[InputRule[js.Any]] = js.native
  def inputRules[S /* <: Schema[_, _] */](config: AnonRules[S]): Plugin[S, _] = js.native
  def textblockTypeInputRule[S /* <: Schema[_, _] */](regexp: RegExp, nodeType: NodeType[S]): InputRule[S] = js.native
  def textblockTypeInputRule[S /* <: Schema[_, _] */](
    regexp: RegExp,
    nodeType: NodeType[S],
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[_] | Null]]
  ): InputRule[S] = js.native
  def textblockTypeInputRule[S /* <: Schema[_, _] */](regexp: RegExp, nodeType: NodeType[S], getAttrs: StringDictionary[js.Any]): InputRule[S] = js.native
  def undoInputRule[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def undoInputRule[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* p */ Transaction[S], Unit]): Boolean = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](regexp: RegExp, nodeType: NodeType[S]): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: RegExp,
    nodeType: NodeType[S],
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[_] | Null]]
  ): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: RegExp,
    nodeType: NodeType[S],
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[_] | Null]],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node[S], Boolean]
  ): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](regexp: RegExp, nodeType: NodeType[S], getAttrs: StringDictionary[js.Any]): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: RegExp,
    nodeType: NodeType[S],
    getAttrs: StringDictionary[js.Any],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node[S], Boolean]
  ): InputRule[S] = js.native
}

