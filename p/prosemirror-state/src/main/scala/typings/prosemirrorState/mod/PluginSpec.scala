package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.anon.Destroy
import typings.prosemirrorView.mod.EditorProps
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSpec[T, S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Allows the plugin to append another transaction to be applied
    * after the given array of transactions. When another plugin
    * appends a transaction after this was called, it is called again
    * with the new state and new transactions—but only the new
    * transactions, i.e. it won't be passed transactions that it
    * already saw.
    */
  var appendTransaction: js.UndefOr[
    (js.Function3[
      /* transactions */ js.Array[Transaction[S]], 
      /* oldState */ EditorState[S], 
      /* newState */ EditorState[S], 
      js.UndefOr[Transaction[S] | Null | Unit]
    ]) | Null
  ] = js.native
  /**
    * When present, this will be called before a transaction is
    * applied by the state, allowing the plugin to cancel it (by
    * returning false).
    */
  var filterTransaction: js.UndefOr[(js.Function2[/* p1 */ Transaction[S], /* p2 */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Can be used to make this a keyed plugin. You can have only one
    * plugin with a given key in a given state, but it is possible to
    * access the plugin's configuration and state through the key,
    * without having access to the plugin instance object.
    */
  var key: js.UndefOr[(PluginKey[T, S]) | Null] = js.native
  /**
    * The [view props](#view.EditorProps) added by this plugin. Props
    * that are functions will be bound to have the plugin instance as
    * their `this` binding.
    */
  var props: js.UndefOr[(EditorProps[Plugin[T, S], S]) | Null] = js.native
  /**
    * Allows a plugin to define a [state field](#state.StateField), an
    * extra slot in the state object in which it can keep its own data.
    */
  var state: js.UndefOr[(StateField[T, S]) | Null] = js.native
  /**
    * When the plugin needs to interact with the editor view, or
    * set something up in the DOM, use this field. The function
    * will be called when the plugin's state is associated with an
    * editor view.
    */
  var view: js.UndefOr[(js.Function1[/* p */ EditorView[S], Destroy[S]]) | Null] = js.native
}

object PluginSpec {
  @scala.inline
  def apply[T, /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](): PluginSpec[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpec[T, S]]
  }
  @scala.inline
  implicit class PluginSpecOps[Self <: PluginSpec[_, _], T, /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S] (val x: Self with (PluginSpec[T, S])) extends AnyVal {
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
    def setAppendTransaction(
      value: (/* transactions */ js.Array[Transaction[S]], /* oldState */ EditorState[S], /* newState */ EditorState[S]) => js.UndefOr[Transaction[S] | Null | Unit]
    ): Self = this.set("appendTransaction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAppendTransaction: Self = this.set("appendTransaction", js.undefined)
    @scala.inline
    def setAppendTransactionNull: Self = this.set("appendTransaction", null)
    @scala.inline
    def setFilterTransaction(value: (/* p1 */ Transaction[S], /* p2 */ EditorState[S]) => Boolean): Self = this.set("filterTransaction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterTransaction: Self = this.set("filterTransaction", js.undefined)
    @scala.inline
    def setFilterTransactionNull: Self = this.set("filterTransaction", null)
    @scala.inline
    def setKey(value: PluginKey[T, S]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    @scala.inline
    def setProps(value: EditorProps[Plugin[T, S], S]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setPropsNull: Self = this.set("props", null)
    @scala.inline
    def setState(value: StateField[T, S]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    @scala.inline
    def setView(value: /* p */ EditorView[S] => Destroy[S]): Self = this.set("view", js.Any.fromFunction1(value))
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewNull: Self = this.set("view", null)
  }
  
}

