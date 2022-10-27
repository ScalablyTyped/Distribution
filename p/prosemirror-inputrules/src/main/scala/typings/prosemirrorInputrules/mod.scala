package typings.prosemirrorInputrules

import typings.prosemirrorInputrules.anon.From
import typings.prosemirrorInputrules.anon.Rules
import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorState.mod.Command
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-inputrules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Input rules are regular expressions describing a piece of text
  that, when typed, causes something to happen. This might be
  changing two dashes into an emdash, wrapping a paragraph starting
  with `"> "` into a blockquote, or something entirely different.
  */
  @JSImport("prosemirror-inputrules", "InputRule")
  @js.native
  open class InputRule protected () extends StObject {
    /**
      Create an input rule. The rule applies when the user typed
      something and the text directly in front of the cursor matches
      `match`, which should end with `$`.
      
      The `handler` can be a string, in which case the matched text, or
      the first matched group in the regexp, is replaced by that
      string.
      
      Or a it can be a function, which will be called with the match
      array produced by
      [`RegExp.exec`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/exec),
      as well as the start and end of the matched range, and which can
      return a [transaction](https://prosemirror.net/docs/ref/#state.Transaction) that describes the
      rule's effect, or null to indicate the input was not handled.
      */
    def this(/**
      @internal
      */
    `match`: js.RegExp, handler: String) = this()
    def this(
      /**
      @internal
      */
    `match`: js.RegExp,
      handler: js.Function4[
            /* state */ EditorState, 
            /* match */ RegExpMatchArray, 
            /* start */ Double, 
            /* end */ Double, 
            Transaction | Null
          ]
    ) = this()
  }
  
  /**
  “Smart” closing double quotes.
  */
  @JSImport("prosemirror-inputrules", "closeDoubleQuote")
  @js.native
  val closeDoubleQuote: InputRule = js.native
  
  /**
  “Smart” closing single quotes.
  */
  @JSImport("prosemirror-inputrules", "closeSingleQuote")
  @js.native
  val closeSingleQuote: InputRule = js.native
  
  /**
  Converts three dots to an ellipsis character.
  */
  @JSImport("prosemirror-inputrules", "ellipsis")
  @js.native
  val ellipsis: InputRule = js.native
  
  /**
  Converts double dashes to an emdash.
  */
  @JSImport("prosemirror-inputrules", "emDash")
  @js.native
  val emDash: InputRule = js.native
  
  /**
  Create an input rules plugin. When enabled, it will cause text
  input that matches any of the given rules to trigger the rule's
  action.
  */
  inline def inputRules(param0: Rules): Plugin[From | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("inputRules")(param0.asInstanceOf[js.Any]).asInstanceOf[Plugin[From | Null]]
  
  /**
  “Smart” opening double quotes.
  */
  @JSImport("prosemirror-inputrules", "openDoubleQuote")
  @js.native
  val openDoubleQuote: InputRule = js.native
  
  /**
  “Smart” opening single quotes.
  */
  @JSImport("prosemirror-inputrules", "openSingleQuote")
  @js.native
  val openSingleQuote: InputRule = js.native
  
  /**
  Smart-quote related input rules.
  */
  @JSImport("prosemirror-inputrules", "smartQuotes")
  @js.native
  val smartQuotes: js.Array[InputRule] = js.native
  
  /**
  Build an input rule that changes the type of a textblock when the
  matched text is typed into it. You'll usually want to start your
  regexp with `^` to that it is only matched at the start of a
  textblock. The optional `getAttrs` parameter can be used to compute
  the new node's attributes, and works the same as in the
  `wrappingInputRule` function.
  */
  inline def textblockTypeInputRule(regexp: js.RegExp, nodeType: NodeType): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("textblockTypeInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def textblockTypeInputRule(
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: js.Function1[/* match */ RegExpMatchArray, Attrs | Null]
  ): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("textblockTypeInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def textblockTypeInputRule(regexp: js.RegExp, nodeType: NodeType, getAttrs: Attrs): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("textblockTypeInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  
  /**
  This is a command that will undo an input rule, if applying such a
  rule was the last thing that the user did.
  */
  @JSImport("prosemirror-inputrules", "undoInputRule")
  @js.native
  val undoInputRule: Command = js.native
  
  /**
  Build an input rule for automatically wrapping a textblock when a
  given string is typed. The `regexp` argument is
  directly passed through to the `InputRule` constructor. You'll
  probably want the regexp to start with `^`, so that the pattern can
  only occur at the start of a textblock.
  `nodeType` is the type of node to wrap in. If it needs attributes,
  you can either pass them directly, or pass a function that will
  compute them from the regular expression match.
  By default, if there's a node with the same type above the newly
  wrapped node, the rule will try to [join](https://prosemirror.net/docs/ref/#transform.Transform.join) those
  two nodes. You can pass a join predicate, which takes a regular
  expression match and the node before the wrapped node, and can
  return a boolean to indicate whether a join should happen.
  */
  inline def wrappingInputRule(regexp: js.RegExp, nodeType: NodeType): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def wrappingInputRule(
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: js.Function1[/* matches */ RegExpMatchArray, Attrs | Null]
  ): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def wrappingInputRule(
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: js.Function1[/* matches */ RegExpMatchArray, Attrs | Null],
    joinPredicate: js.Function2[/* match */ RegExpMatchArray, /* node */ Node, Boolean]
  ): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def wrappingInputRule(
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: Null,
    joinPredicate: js.Function2[/* match */ RegExpMatchArray, /* node */ Node, Boolean]
  ): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def wrappingInputRule(
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: Unit,
    joinPredicate: js.Function2[/* match */ RegExpMatchArray, /* node */ Node, Boolean]
  ): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def wrappingInputRule(regexp: js.RegExp, nodeType: NodeType, getAttrs: Attrs): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any])).asInstanceOf[InputRule]
  inline def wrappingInputRule(
    regexp: js.RegExp,
    nodeType: NodeType,
    getAttrs: Attrs,
    joinPredicate: js.Function2[/* match */ RegExpMatchArray, /* node */ Node, Boolean]
  ): InputRule = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappingInputRule")(regexp.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], getAttrs.asInstanceOf[js.Any], joinPredicate.asInstanceOf[js.Any])).asInstanceOf[InputRule]
}
