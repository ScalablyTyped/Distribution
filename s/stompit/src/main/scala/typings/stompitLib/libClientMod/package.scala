package typings
package stompitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libClientMod {
  type MessageCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* message */ Message, scala.Unit]
}
