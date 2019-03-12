package typings
package stompitLib.libIncomingFrameStreamMod.IncomingFrameStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal class, which is not exported
@js.native
trait IncomingFrame
  extends nodeLib.streamMod.Readable {
  def readEmptyBody(): scala.Unit = js.native
  def readEmptyBody(callback: js.Function1[/* isEmpty */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def readString(encoding: java.lang.String): scala.Unit = js.native
  def readString(
    encoding: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* buffer */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

