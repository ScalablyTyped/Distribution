package typings.rxDotWamp.rxDotWampMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("rx", JSImport.Namespace)
@js.native
object rxMod extends js.Object {
  // Patch ObservableStatic to contain observableWamp methods.
  type ObservableStatic = IObservableWampStatic
}

