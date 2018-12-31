package typings
package prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-inputrules", "InputRule")
@js.native
class InputRule[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
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
  def this(`match`: stdLib.RegExp, handler: java.lang.String) = this()
  def this(`match`: stdLib.RegExp, handler: js.Function4[
      /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      /* match */ js.Array[java.lang.String], 
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S] | scala.Null
    ]) = this()
}

