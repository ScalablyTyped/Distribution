package typings
package spdyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object spdyLibStrings {
  @js.native
  sealed trait h2
    extends spdyLib.spdyMod.serverNs.Protocol
  
  @js.native
  sealed trait `http/1DOT0`
    extends spdyLib.spdyMod.serverNs.Protocol
  
  @js.native
  sealed trait `http/1DOT1`
    extends spdyLib.spdyMod.serverNs.Protocol
  
  @js.native
  sealed trait `spdy/2`
    extends spdyLib.spdyMod.serverNs.Protocol
  
  @js.native
  sealed trait `spdy/3`
    extends spdyLib.spdyMod.serverNs.Protocol
  
  @js.native
  sealed trait `spdy/3DOT1`
    extends spdyLib.spdyMod.serverNs.Protocol
  
  @scala.inline
  def h2: h2 = "h2".asInstanceOf[h2]
  @scala.inline
  def `http/1DOT0`: `http/1DOT0` = "http/1.0".asInstanceOf[`http/1DOT0`]
  @scala.inline
  def `http/1DOT1`: `http/1DOT1` = "http/1.1".asInstanceOf[`http/1DOT1`]
  @scala.inline
  def `spdy/2`: `spdy/2` = "spdy/2".asInstanceOf[`spdy/2`]
  @scala.inline
  def `spdy/3`: `spdy/3` = "spdy/3".asInstanceOf[`spdy/3`]
  @scala.inline
  def `spdy/3DOT1`: `spdy/3DOT1` = "spdy/3.1".asInstanceOf[`spdy/3DOT1`]
}

