package typings.prosemirrorDashInputrules.prosemirrorDashInputrulesMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashInputrules.Anon_Rules
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeType
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-inputrules", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var closeDoubleQuote: InputRule[js.Any] = js.native
  var closeSingleQuote: InputRule[js.Any] = js.native
  var ellipsis: InputRule[js.Any] = js.native
  var emDash: InputRule[js.Any] = js.native
  var openDoubleQuote: InputRule[js.Any] = js.native
  var openSingleQuote: InputRule[js.Any] = js.native
  var smartQuotes: js.Array[InputRule[js.Any]] = js.native
  def inputRules[S /* <: Schema[_, _] */](config: Anon_Rules[S]): Plugin[S, _] = js.native
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

