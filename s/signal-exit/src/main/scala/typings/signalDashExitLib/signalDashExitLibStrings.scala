package typings
package signalDashExitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object signalDashExitLibStrings {
  @js.native
  sealed trait SIGABRT
    extends signalDashExitLib.signalDashExitMod.signalExitNs._Signal
  
  @js.native
  sealed trait SIGALRM
    extends signalDashExitLib.signalDashExitMod.signalExitNs._Signal
  
  @js.native
  sealed trait SIGHUP
    extends signalDashExitLib.signalDashExitMod.signalExitNs._Signal
  
  @js.native
  sealed trait SIGINT
    extends signalDashExitLib.signalDashExitMod.signalExitNs._Signal
  
  @js.native
  sealed trait SIGTERM
    extends signalDashExitLib.signalDashExitMod.signalExitNs._Signal
  
  @scala.inline
  def SIGABRT: SIGABRT = "SIGABRT".asInstanceOf[SIGABRT]
  @scala.inline
  def SIGALRM: SIGALRM = "SIGALRM".asInstanceOf[SIGALRM]
  @scala.inline
  def SIGHUP: SIGHUP = "SIGHUP".asInstanceOf[SIGHUP]
  @scala.inline
  def SIGINT: SIGINT = "SIGINT".asInstanceOf[SIGINT]
  @scala.inline
  def SIGTERM: SIGTERM = "SIGTERM".asInstanceOf[SIGTERM]
}

