package typings
package stampitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampitMod {
  /**
    * Composer function
    */
  type Composer = js.Function1[/* hasStampComposables */ stampitLib.Anon_Composables, js.Any]
  type Init = js.Function2[/* factoryArg */ js.Any, /* ctx */ js.UndefOr[Context], js.Any]
}
