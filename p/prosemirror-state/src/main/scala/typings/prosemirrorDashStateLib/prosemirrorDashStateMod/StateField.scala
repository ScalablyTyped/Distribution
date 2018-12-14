package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StateField[T, S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  /**
     * Deserialize the JSON representation of this field. Note that the
     * `state` argument is again a half-initialized state.
     */
  var fromJSON: js.UndefOr[
    (js.Function3[
      /* config */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      /* value */ js.Any, 
      /* state */ EditorState[S], 
      T
    ]) | scala.Null
  ] = js.undefined
  /**
     * Convert this field to JSON. Optional, can be left off to disable
     * JSON serialization for the field.
     */
  var toJSON: js.UndefOr[(js.Function1[/* value */ T, _]) | scala.Null] = js.undefined
  /**
     * Apply the given transaction to this state field, producing a new
     * field value. Note that the `newState` argument is again a partially
     * constructed state does not yet contain the state from plugins
     * coming after this one.
     */
  @JSName("apply")
  def apply(tr: Transaction[_], value: T, oldState: EditorState[S], newState: EditorState[S]): T
  /**
     * Initialize the value of the field. `config` will be the object
     * passed to [`EditorState.create`](#state.EditorState^create). Note
     * that `instance` is a half-initialized state instance, and will
     * not have values for plugin fields initialized after this one.
     */
  def init(config: org.scalablytyped.runtime.StringDictionary[js.Any], instance: EditorState[S]): T
}

