package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampitLib {
  /** Any composable object (stamp or descriptor) */
  type Composable = js.Any
  /**
   * Composer function
   */
  type Composer = js.Function1[/* hasStampComposables */ Anon_Stamp, js.Any]
  type Init = js.Function2[/* factoryArg */ js.Any, /* ctx */ js.UndefOr[js.Any], js.Any]
  /** Stampit Composable for main stampit() function */
  type StampitComposable = js.Any
}
