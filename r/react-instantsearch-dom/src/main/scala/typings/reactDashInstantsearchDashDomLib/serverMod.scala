package typings
package reactDashInstantsearchDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def createInstantSearch(): reactDashInstantsearchDashDomLib.Anon_InstantSearch = js.native
  def createInstantSearch(
    defaultAlgoliaClient: js.Function3[
      /* appId */ java.lang.String, 
      /* apiKey */ java.lang.String, 
      /* options */ reactDashInstantsearchDashDomLib.Anon_UseRequestCache, 
      js.Object
    ]
  ): reactDashInstantsearchDashDomLib.Anon_InstantSearch = js.native
}

