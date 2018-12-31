package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentResourceOptions extends ResourceOptions {
  /**
    * An optional set of providers to use for child resources. Keyed by package name (e.g. "aws")
    */
  var providers: js.UndefOr[stdLib.Record[java.lang.String, ProviderResource]] = js.undefined
}

