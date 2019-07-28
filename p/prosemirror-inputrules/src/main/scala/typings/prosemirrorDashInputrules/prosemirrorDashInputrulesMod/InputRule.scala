package typings.prosemirrorDashInputrules.prosemirrorDashInputrulesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-inputrules", "InputRule")
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

