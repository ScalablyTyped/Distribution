package typings
package signaleLib.signaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signaleNs {
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type Signale[TTypes /* <: java.lang.String */] = SignaleBase[TTypes] with (stdLib.Record[TTypes, LoggerFunc]) with (stdLib.Record[DefaultMethods, LoggerFunc])
}
