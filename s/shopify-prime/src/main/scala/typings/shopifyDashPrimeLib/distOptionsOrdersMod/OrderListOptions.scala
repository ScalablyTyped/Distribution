package typings
package shopifyDashPrimeLib.distOptionsOrdersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OrderListOptions
  extends shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
     with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
     with shopifyDashPrimeLib.distOptionsBaseMod.ProcessedOptions
     with OrderCountOptions {
  /**
       * A comma-separated list of order ids.
       */
  var ids: js.UndefOr[java.lang.String] = js.undefined
}

