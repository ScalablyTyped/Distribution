package typings.spdy

import typings.spdy.spdyMod.server.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object spdyStrings {
  @js.native
  sealed trait h2 extends Protocol
  
  @js.native
  sealed trait httpSlash1Dot0 extends Protocol
  
  @js.native
  sealed trait httpSlash1Dot1 extends Protocol
  
  @js.native
  sealed trait spdySlash2 extends Protocol
  
  @js.native
  sealed trait spdySlash3 extends Protocol
  
  @js.native
  sealed trait spdySlash3Dot1 extends Protocol
  
  @scala.inline
  def h2: h2 = "h2".asInstanceOf[h2]
  @scala.inline
  def httpSlash1Dot0: httpSlash1Dot0 = "http/1.0".asInstanceOf[httpSlash1Dot0]
  @scala.inline
  def httpSlash1Dot1: httpSlash1Dot1 = "http/1.1".asInstanceOf[httpSlash1Dot1]
  @scala.inline
  def spdySlash2: spdySlash2 = "spdy/2".asInstanceOf[spdySlash2]
  @scala.inline
  def spdySlash3: spdySlash3 = "spdy/3".asInstanceOf[spdySlash3]
  @scala.inline
  def spdySlash3Dot1: spdySlash3Dot1 = "spdy/3.1".asInstanceOf[spdySlash3Dot1]
}

