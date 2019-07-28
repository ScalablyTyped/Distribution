package typings.atStorybookApi

import typings.atStorybookApi.distInitDashProviderDashApiMod.Provider
import typings.atStorybookApi.distStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  var api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any
  var provider: Provider
  var store: default
}

object Anon_Api {
  @scala.inline
  def apply(
    api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any,
    provider: Provider,
    store: default
  ): Anon_Api = {
    val __obj = js.Dynamic.literal(api = api, provider = provider, store = store)
  
    __obj.asInstanceOf[Anon_Api]
  }
}

