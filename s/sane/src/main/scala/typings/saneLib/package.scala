package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saneLib {
  type AllEventType = saneLib.saneLibStrings.add | saneLib.saneLibStrings.change | saneLib.saneLibStrings.delete
  type EventType = saneLib.saneLibStrings.ready | saneLib.saneLibStrings.error | saneLib.saneLibStrings.all | AllEventType
}
