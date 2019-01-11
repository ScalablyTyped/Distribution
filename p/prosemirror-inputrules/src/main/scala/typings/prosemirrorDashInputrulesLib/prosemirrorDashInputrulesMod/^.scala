package typings
package prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-inputrules", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var closeDoubleQuote: prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any] = js.native
  var closeSingleQuote: prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any] = js.native
  var ellipsis: prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any] = js.native
  var emDash: prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any] = js.native
  var openDoubleQuote: prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any] = js.native
  var openSingleQuote: prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any] = js.native
  var smartQuotes: js.Array[prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[js.Any]] = js.native
  def inputRules[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](config: prosemirrorDashInputrulesLib.Anon_Rules[S]): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[S] = js.native
  def textblockTypeInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](regexp: stdLib.RegExp, nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def textblockTypeInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    regexp: stdLib.RegExp,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    getAttrs: js.Function1[
      /* p */ js.Array[java.lang.String], 
      js.UndefOr[org.scalablytyped.runtime.StringDictionary[_] | scala.Null]
    ]
  ): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def textblockTypeInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    regexp: stdLib.RegExp,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    getAttrs: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def undoInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def undoInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[/* p */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], scala.Unit]
  ): scala.Boolean = js.native
  def wrappingInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](regexp: stdLib.RegExp, nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def wrappingInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    regexp: stdLib.RegExp,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    getAttrs: js.Function1[
      /* p */ js.Array[java.lang.String], 
      js.UndefOr[org.scalablytyped.runtime.StringDictionary[_] | scala.Null]
    ]
  ): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def wrappingInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    regexp: stdLib.RegExp,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    getAttrs: js.Function1[
      /* p */ js.Array[java.lang.String], 
      js.UndefOr[org.scalablytyped.runtime.StringDictionary[_] | scala.Null]
    ],
    joinPredicate: js.Function2[
      /* p1 */ js.Array[java.lang.String], 
      /* p2 */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      scala.Boolean
    ]
  ): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def wrappingInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    regexp: stdLib.RegExp,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    getAttrs: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
  def wrappingInputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    regexp: stdLib.RegExp,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    getAttrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    joinPredicate: js.Function2[
      /* p1 */ js.Array[java.lang.String], 
      /* p2 */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      scala.Boolean
    ]
  ): prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S] = js.native
}

