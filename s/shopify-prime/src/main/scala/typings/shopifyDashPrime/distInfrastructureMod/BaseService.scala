package typings.shopifyDashPrime.distInfrastructureMod

import typings.shopifyDashPrime.Anon_Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure", "BaseService")
@js.native
class BaseService protected ()
  extends typings.shopifyDashPrime.distInfrastructureBaseUnderscoreServiceMod.BaseService {
  def this(shopDomain: String, accessToken: String, resource: String) = this()
}

/* static members */
@JSImport("shopify-prime/dist/infrastructure", "BaseService")
@js.native
object BaseService extends js.Object {
  def buildDefaultHeaders(): Anon_Accept = js.native
}

