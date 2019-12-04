package typings.reactDashInstantsearch

import typings.reactDashInstantsearchDashDom.Anon_App
import typings.reactDashInstantsearchDashDom.Anon_UseRequestCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def createInstantSearch(): Anon_App = js.native
  def createInstantSearch(
    defaultAlgoliaClient: js.Function3[/* appId */ String, /* apiKey */ String, /* options */ Anon_UseRequestCache, js.Object]
  ): Anon_App = js.native
}

