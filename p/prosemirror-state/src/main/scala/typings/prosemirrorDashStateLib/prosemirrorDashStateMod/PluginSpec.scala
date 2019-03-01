package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpec[T, S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
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
      js.UndefOr[Transaction[S] | scala.Null | scala.Unit]
    ]) | scala.Null
  ] = js.undefined
  /**
    * When present, this will be called before a transaction is
    * applied by the state, allowing the plugin to cancel it (by
    * returning false).
    */
  var filterTransaction: js.UndefOr[
    (js.Function2[/* p1 */ Transaction[S], /* p2 */ EditorState[S], scala.Boolean]) | scala.Null
  ] = js.undefined
  /**
    * Can be used to make this a keyed plugin. You can have only one
    * plugin with a given key in a given state, but it is possible to
    * access the plugin's configuration and state through the key,
    * without having access to the plugin instance object.
    */
  var key: js.UndefOr[(PluginKey[T, S]) | scala.Null] = js.undefined
  /**
    * The [view props](#view.EditorProps) added by this plugin. Props
    * that are functions will be bound to have the plugin instance as
    * their `this` binding.
    */
  var props: js.UndefOr[prosemirrorDashViewLib.prosemirrorDashViewMod.EditorProps[S] | scala.Null] = js.undefined
  /**
    * Allows a plugin to define a [state field](#state.StateField), an
    * extra slot in the state object in which it can keep its own data.
    */
  var state: js.UndefOr[(StateField[T, S]) | scala.Null] = js.undefined
  /**
    * When the plugin needs to interact with the editor view, or
    * set something up in the DOM, use this field. The function
    * will be called when the plugin's state is associated with an
    * editor view.
    */
  var view: js.UndefOr[
    (js.Function1[
      /* p */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], 
      prosemirrorDashStateLib.Anon_Destroy[S]
    ]) | scala.Null
  ] = js.undefined
}

object PluginSpec {
  @scala.inline
  def apply[T, S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    appendTransaction: js.Function3[
      /* transactions */ js.Array[Transaction[S]], 
      /* oldState */ EditorState[S], 
      /* newState */ EditorState[S], 
      js.UndefOr[Transaction[S] | scala.Null | scala.Unit]
    ] = null,
    filterTransaction: js.Function2[/* p1 */ Transaction[S], /* p2 */ EditorState[S], scala.Boolean] = null,
    key: PluginKey[T, S] = null,
    props: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorProps[S] = null,
    state: StateField[T, S] = null,
    view: js.Function1[
      /* p */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], 
      prosemirrorDashStateLib.Anon_Destroy[S]
    ] = null
  ): PluginSpec[T, S] = {
    val __obj = js.Dynamic.literal()
    if (appendTransaction != null) __obj.updateDynamic("appendTransaction")(appendTransaction)
    if (filterTransaction != null) __obj.updateDynamic("filterTransaction")(filterTransaction)
    if (key != null) __obj.updateDynamic("key")(key)
    if (props != null) __obj.updateDynamic("props")(props)
    if (state != null) __obj.updateDynamic("state")(state)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PluginSpec[T, S]]
  }
}

