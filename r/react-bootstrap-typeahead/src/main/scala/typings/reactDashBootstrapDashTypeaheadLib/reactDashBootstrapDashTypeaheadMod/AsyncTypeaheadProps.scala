package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncTypeaheadProps[T /* <: TypeaheadModel */] extends TypeaheadProps[T] {
  /* 	Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: scala.Boolean
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[scala.Boolean] = js.undefined
  /* Callback to perform when the search is executed. */
  def onSearch(query: java.lang.String): scala.Unit
}

