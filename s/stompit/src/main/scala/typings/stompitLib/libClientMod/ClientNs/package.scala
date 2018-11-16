package typings
package stompitLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClientNs {
  type Ack = stompitLib.stompitLibStrings.auto | stompitLib.stompitLibStrings.client | stompitLib.stompitLibStrings.`client-individual`
  type MessageCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* message */ Message, scala.Unit]
}
