package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomResourceOptions extends ResourceOptions {
  /**
       * An optional provider to use for this resource's CRUD operations. If no provider is supplied, the default
       * provider for the resource's package will be used. The default provider is pulled from the parent's
       * provider bag (see also ComponentResourceOptions.providers).
       */
  var provider: js.UndefOr[ProviderResource] = js.undefined
}

