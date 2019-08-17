package typings.stampit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampitMod {
  import typings.stampit.Anon_Composables

  /**
    * Composer function
    */
  type Composer = js.Function1[/* hasStampComposables */ Anon_Composables, js.Any]
  type Init = js.Function2[/* factoryArg */ js.Any, /* ctx */ js.UndefOr[Context], js.Any]
}
