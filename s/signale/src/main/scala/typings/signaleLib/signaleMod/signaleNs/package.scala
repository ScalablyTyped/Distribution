package typings
package signaleLib.signaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object signaleNs {
  type DefaultMethods = signaleLib.signaleLibStrings.await | signaleLib.signaleLibStrings.complete | signaleLib.signaleLibStrings.error | signaleLib.signaleLibStrings.debug | signaleLib.signaleLibStrings.fatal | signaleLib.signaleLibStrings.fav | signaleLib.signaleLibStrings.info | signaleLib.signaleLibStrings.note | signaleLib.signaleLibStrings.pause | signaleLib.signaleLibStrings.pending | signaleLib.signaleLibStrings.star | signaleLib.signaleLibStrings.start | signaleLib.signaleLibStrings.success | signaleLib.signaleLibStrings.warn | signaleLib.signaleLibStrings.watch | signaleLib.signaleLibStrings.log
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */js.Any, scala.Unit]
  type Signale[TTypes /* <: java.lang.String */] = SignaleBase[TTypes] with (stdLib.Record[TTypes, LoggerFunc]) with (stdLib.Record[DefaultMethods, LoggerFunc])
}
