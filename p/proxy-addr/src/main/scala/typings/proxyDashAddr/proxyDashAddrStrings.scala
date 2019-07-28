package typings.proxyDashAddr

import typings.proxyDashAddr.proxyDashAddrMod._Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object proxyDashAddrStrings {
  @js.native
  sealed trait linklocal extends _Address
  
  @js.native
  sealed trait loopback extends _Address
  
  @js.native
  sealed trait uniquelocal extends _Address
  
  @scala.inline
  def linklocal: linklocal = "linklocal".asInstanceOf[linklocal]
  @scala.inline
  def loopback: loopback = "loopback".asInstanceOf[loopback]
  @scala.inline
  def uniquelocal: uniquelocal = "uniquelocal".asInstanceOf[uniquelocal]
}

