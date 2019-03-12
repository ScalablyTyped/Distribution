package typings
package stompitLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClientNs {
  type MessageCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* message */ Message, scala.Unit]
}
