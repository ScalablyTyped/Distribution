package typings
package shopifyDashPrimeLib.distModelsRedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Redirect
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The "before" path to be redirected. When the user this path, s/he will be redirected to the path specified by target.
       */
  var path: java.lang.String
  /**
       * The "after" path or URL to be redirected to. When the user visits the path specified by path, s/he will be redirected to this path or URL. This property can be set to any path on the shop's site, or any URL, even one on a completely different domain.
       */
  var target: java.lang.String
}

