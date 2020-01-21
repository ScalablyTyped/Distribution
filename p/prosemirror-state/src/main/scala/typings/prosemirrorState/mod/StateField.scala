package typings.prosemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateField[T, S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Deserialize the JSON representation of this field. Note that the
    * `state` argument is again a half-initialized state.
    */
  var fromJSON: js.UndefOr[
    (js.Function3[
      /* config */ StringDictionary[js.Any], 
      /* value */ js.Any, 
      /* state */ EditorState[S], 
      T
    ]) | Null
  ] = js.undefined
  /**
    * Convert this field to JSON. Optional, can be left off to disable
    * JSON serialization for the field.
    */
  var toJSON: js.UndefOr[(js.Function1[/* value */ T, _]) | Null] = js.undefined
  /**
    * Apply the given transaction to this state field, producing a new
    * field value. Note that the `newState` argument is again a partially
    * constructed state does not yet contain the state from plugins
    * coming after this one.
    */
  @JSName("apply")
  def apply(tr: Transaction[S], value: T, oldState: EditorState[S], newState: EditorState[S]): T
  /**
    * Initialize the value of the field. `config` will be the object
    * passed to [`EditorState.create`](#state.EditorState^create). Note
    * that `instance` is a half-initialized state instance, and will
    * not have values for plugin fields initialized after this one.
    */
  def init(config: StringDictionary[js.Any], instance: EditorState[S]): T
}

object StateField {
  @scala.inline
  def apply[T, S /* <: Schema[_, _] */](
    apply: (Transaction[S], T, EditorState[S], EditorState[S]) => T,
    init: (StringDictionary[js.Any], EditorState[S]) => T,
    fromJSON: (/* config */ StringDictionary[js.Any], /* value */ js.Any, /* state */ EditorState[S]) => T = null,
    toJSON: /* value */ T => _ = null
  ): StateField[T, S] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction4(apply), init = js.Any.fromFunction2(init))
    if (fromJSON != null) __obj.updateDynamic("fromJSON")(js.Any.fromFunction3(fromJSON))
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[StateField[T, S]]
  }
}

