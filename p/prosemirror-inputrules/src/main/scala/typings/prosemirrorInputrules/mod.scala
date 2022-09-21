package typings.prosemirrorInputrules

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorInputrules.anon.Rules
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-inputrules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-inputrules", "InputRule")
  @js.native
  open class InputRule[S /* <: Schema[Any, Any] */] protected () extends StObject {
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
    def this(`match`: js.RegExp, handler: String) = this()
    def this(
      `match`: js.RegExp,
      handler: js.Function4[
            /* state */ EditorState, 
            /* match */ js.Array[String], 
            /* start */ Double, 
            /* end */ Double, 
            Transaction | Null
          ]
    ) = this()
  }
  
  @JSImport("prosemirror-inputrules", "closeDoubleQuote")
  @js.native
  def closeDoubleQuote: InputRule[Any] = js.native
  inline def closeDoubleQuote_=(x: InputRule[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeDoubleQuote")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-inputrules", "closeSingleQuote")
  @js.native
  def closeSingleQuote: InputRule[Any] = js.native
  inline def closeSingleQuote_=(x: InputRule[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeSingleQuote")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-inputrules", "ellipsis")
  @js.native
  def ellipsis: InputRule[Any] = js.native
  inline def ellipsis_=(x: InputRule[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-inputrules", "emDash")
  @js.native
  def emDash: InputRule[Any] = js.native
  inline def emDash_=(x: InputRule[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emDash")(x.asInstanceOf[js.Any])
  
  inline def inputRules[S /* <: Schema[Any, Any] */](config: Rules[S]): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("inputRules")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  @JSImport("prosemirror-inputrules", "openDoubleQuote")
  @js.native
  def openDoubleQuote: InputRule[Any] = js.native
  inline def openDoubleQuote_=(x: InputRule[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openDoubleQuote")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-inputrules", "openSingleQuote")
  @js.native
  def openSingleQuote: InputRule[Any] = js.native
  inline def openSingleQuote_=(x: InputRule[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openSingleQuote")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-inputrules", "smartQuotes")
  @js.native
  def smartQuotes: js.Array[InputRule[Any]] = js.native
  inline def smartQuotes_=(x: js.Array[InputRule[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartQuotes")(x.asInstanceOf[js.Any])
  
  inline def textblockTypeInputRule[S /* <: Schema[Any, Any] */](regexp: js.RegExp, nodeType: NodeType): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("textblockTypeInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def textblockTypeInputRule[S /* <: Schema[Any, Any] */](
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[Any] | Null]]
  ): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("textblockTypeInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def textblockTypeInputRule[S /* <: Schema[Any, Any] */](regexp: js.RegExp, nodeType: NodeType, getAttrs: StringDictionary[Any]): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("textblockTypeInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  
  inline def undoInputRule[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("undoInputRule")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def undoInputRule[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* p */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("undoInputRule")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def wrappingInputRule[S /* <: Schema[Any, Any] */](regexp: js.RegExp, nodeType: NodeType): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def wrappingInputRule[S /* <: Schema[Any, Any] */](
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[Any] | Null]]
  ): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def wrappingInputRule[S /* <: Schema[Any, Any] */](
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[Any] | Null]],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node, Boolean]
  ): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def wrappingInputRule[S /* <: Schema[Any, Any] */](regexp: js.RegExp, nodeType: NodeType, getAttrs: StringDictionary[Any]): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def wrappingInputRule[S /* <: Schema[Any, Any] */](
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: StringDictionary[Any],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node, Boolean]
  ): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
  inline def wrappingInputRule[S /* <: Schema[Any, Any] */](
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: Unit,
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node, Boolean]
  ): InputRule[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule[S]]
}
