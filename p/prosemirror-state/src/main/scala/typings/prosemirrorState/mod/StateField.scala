package typings.prosemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateField[T, S /* <: Schema[_, _] */] extends js.Object {
  
  /**
    * Apply the given transaction to this state field, producing a new
    * field value. Note that the `newState` argument is again a partially
    * constructed state does not yet contain the state from plugins
    * coming after this one.
    */
  @JSName("apply")
  def apply(tr: Transaction[S], value: T, oldState: EditorState[S], newState: EditorState[S]): T = js.native
  
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
  ] = js.native
  
  /**
    * Initialize the value of the field. `config` will be the object
    * passed to [`EditorState.create`](#state.EditorState^create). Note
    * that `instance` is a half-initialized state instance, and will
    * not have values for plugin fields initialized after this one.
    */
  def init(config: StringDictionary[js.Any], instance: EditorState[S]): T = js.native
  
  /**
    * Convert this field to JSON. Optional, can be left off to disable
    * JSON serialization for the field.
    */
  var toJSON: js.UndefOr[(js.ThisFunction1[/* this */ Plugin[T, S], /* value */ T, _]) | Null] = js.native
}
object StateField {
  
  @scala.inline
  def apply[T, S /* <: Schema[_, _] */](
    apply: (Transaction[S], T, EditorState[S], EditorState[S]) => T,
    init: (StringDictionary[js.Any], EditorState[S]) => T
  ): StateField[T, S] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction4(apply), init = js.Any.fromFunction2(init))
    __obj.asInstanceOf[StateField[T, S]]
  }
  
  @scala.inline
  implicit class StateFieldOps[Self <: StateField[_, _], T, S /* <: Schema[_, _] */] (val x: Self with (StateField[T, S])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApply(value: (Transaction[S], T, EditorState[S], EditorState[S]) => T): Self = this.set("apply", js.Any.fromFunction4(value))
    
    @scala.inline
    def setInit(value: (StringDictionary[js.Any], EditorState[S]) => T): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromJSON(
      value: js.ThisFunction3[
          /* this */ Plugin[T, S], 
          /* config */ StringDictionary[js.Any], 
          /* value */ js.Any, 
          /* state */ EditorState[S], 
          T
        ]
    ): Self = this.set("fromJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromJSON: Self = this.set("fromJSON", js.undefined)
    
    @scala.inline
    def setFromJSONNull: Self = this.set("fromJSON", null)
    
    @scala.inline
    def setToJSON(value: js.ThisFunction1[/* this */ Plugin[T, S], /* value */ T, _]): Self = this.set("toJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToJSON: Self = this.set("toJSON", js.undefined)
    
    @scala.inline
    def setToJSONNull: Self = this.set("toJSON", null)
  }
}
