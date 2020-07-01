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
    (js.ThisFunction3[
      /* this */ Plugin[T, S], 
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
  var toJSON: js.UndefOr[(js.ThisFunction1[/* this */ Plugin[T, S], /* value */ T, _]) | Null] = js.undefined
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
  def apply[T, /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    apply: (Transaction[S], T, EditorState[S], EditorState[S]) => T,
    init: (StringDictionary[js.Any], EditorState[S]) => T,
    fromJSON: js.UndefOr[
      Null | (js.ThisFunction3[
        /* this */ Plugin[T, S], 
        /* config */ StringDictionary[js.Any], 
        /* value */ js.Any, 
        /* state */ EditorState[S], 
        T
      ])
    ] = js.undefined,
    toJSON: js.UndefOr[Null | (js.ThisFunction1[/* this */ Plugin[T, S], /* value */ T, _])] = js.undefined
  ): StateField[T, S] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction4(apply), init = js.Any.fromFunction2(init))
    if (!js.isUndefined(fromJSON)) __obj.updateDynamic("fromJSON")(fromJSON.asInstanceOf[js.Any])
    if (!js.isUndefined(toJSON)) __obj.updateDynamic("toJSON")(toJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateField[T, S]]
  }
}

