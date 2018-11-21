package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PluginSpec[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
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
      /* transactions */ js.Array[Transaction[_]], 
      /* oldState */ EditorState[S], 
      /* newState */ EditorState[S], 
      js.UndefOr[Transaction[_] | scala.Null | scala.Unit]
    ]) | scala.Null
  ] = js.undefined
  /**
     * When present, this will be called before a transaction is
     * applied by the state, allowing the plugin to cancel it (by
     * returning false).
     */
  var filterTransaction: js.UndefOr[
    (js.Function2[/* p1 */ Transaction[_], /* p2 */ EditorState[S], scala.Boolean]) | scala.Null
  ] = js.undefined
  /**
     * Can be used to make this a keyed plugin. You can have only one
     * plugin with a given key in a given state, but it is possible to
     * access the plugin's configuration and state through the key,
     * without having access to the plugin instance object.
     */
  var key: js.UndefOr[PluginKey[S] | scala.Null] = js.undefined
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
  var state: js.UndefOr[
    (StateField[_, prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _]]) | scala.Null
  ] = js.undefined
  /**
     * When the plugin needs to interact with the editor view, or
     * set something up in the DOM, use this field. The function
     * will be called when the plugin's state is associated with an
     * editor view.
     */
  var view: js.UndefOr[
    (js.Function1[
      /* p */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S], 
      prosemirrorDashStateLib.Anon_Update[S]
    ]) | scala.Null
  ] = js.undefined
}

