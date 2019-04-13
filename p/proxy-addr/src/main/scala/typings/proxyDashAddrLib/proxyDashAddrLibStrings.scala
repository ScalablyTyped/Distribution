package typings
package proxyDashAddrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object proxyDashAddrLibStrings {
  @js.native
  sealed trait linklocal
    extends proxyDashAddrLib.proxyDashAddrMod._Address
  
  @js.native
  sealed trait loopback
    extends proxyDashAddrLib.proxyDashAddrMod._Address
  
  @js.native
  sealed trait uniquelocal
    extends proxyDashAddrLib.proxyDashAddrMod._Address
  
  @scala.inline
  def linklocal: linklocal = "linklocal".asInstanceOf[linklocal]
  @scala.inline
  def loopback: loopback = "loopback".asInstanceOf[loopback]
  @scala.inline
  def uniquelocal: uniquelocal = "uniquelocal".asInstanceOf[uniquelocal]
}

