package typings.prosemirrorDashState.prosemirrorDashStateMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.Anon_Destroy
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorProps
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  /**
    * When present, this will be called before a transaction is
    * applied by the state, allowing the plugin to cancel it (by
    * returning false).
    */
  var filterTransaction: js.UndefOr[(js.Function2[/* p1 */ Transaction[S], /* p2 */ EditorState[S], Boolean]) | Null] = js.undefined
  /**
    * Can be used to make this a keyed plugin. You can have only one
    * plugin with a given key in a given state, but it is possible to
    * access the plugin's configuration and state through the key,
    * without having access to the plugin instance object.
    */
  var key: js.UndefOr[(PluginKey[T, S]) | Null] = js.undefined
  /**
    * The [view props](#view.EditorProps) added by this plugin. Props
    * that are functions will be bound to have the plugin instance as
    * their `this` binding.
    */
  var props: js.UndefOr[EditorProps[S] | Null] = js.undefined
  /**
    * Allows a plugin to define a [state field](#state.StateField), an
    * extra slot in the state object in which it can keep its own data.
    */
  var state: js.UndefOr[(StateField[T, S]) | Null] = js.undefined
  /**
    * When the plugin needs to interact with the editor view, or
    * set something up in the DOM, use this field. The function
    * will be called when the plugin's state is associated with an
    * editor view.
    */
  var view: js.UndefOr[(js.Function1[/* p */ EditorView[S], Anon_Destroy[S]]) | Null] = js.undefined
}

object PluginSpec {
  @scala.inline
  def apply[T, S /* <: Schema[_, _] */](
    appendTransaction: (/* transactions */ js.Array[Transaction[S]], /* oldState */ EditorState[S], /* newState */ EditorState[S]) => js.UndefOr[Transaction[S] | Null | Unit] = null,
    filterTransaction: (/* p1 */ Transaction[S], /* p2 */ EditorState[S]) => Boolean = null,
    key: PluginKey[T, S] = null,
    props: EditorProps[S] = null,
    state: StateField[T, S] = null,
    view: /* p */ EditorView[S] => Anon_Destroy[S] = null
  ): PluginSpec[T, S] = {
    val __obj = js.Dynamic.literal()
    if (appendTransaction != null) __obj.updateDynamic("appendTransaction")(js.Any.fromFunction3(appendTransaction))
    if (filterTransaction != null) __obj.updateDynamic("filterTransaction")(js.Any.fromFunction2(filterTransaction))
    if (key != null) __obj.updateDynamic("key")(key)
    if (props != null) __obj.updateDynamic("props")(props)
    if (state != null) __obj.updateDynamic("state")(state)
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction1(view))
    __obj.asInstanceOf[PluginSpec[T, S]]
  }
}

