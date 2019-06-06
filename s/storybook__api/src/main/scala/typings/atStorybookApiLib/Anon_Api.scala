package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  var api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any
  var provider: atStorybookApiLib.distInitDashProviderDashApiMod.Provider
  var store: atStorybookApiLib.distStoreMod.default
}

object Anon_Api {
  @scala.inline
  def apply(
    api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any,
    provider: atStorybookApiLib.distInitDashProviderDashApiMod.Provider,
    store: atStorybookApiLib.distStoreMod.default
  ): Anon_Api = {
    val __obj = js.Dynamic.literal(api = api, provider = provider, store = store)
  
    __obj.asInstanceOf[Anon_Api]
  }
}

