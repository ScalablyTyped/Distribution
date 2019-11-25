package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type of the drive. Can be:
  * - REMOVABLE
  * - FIXED
  * - NETWORK
  * - CD_ROM
  * - RAM
  * - UNKNOWN_TYPE
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.REMOVABLE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FIXED
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NETWORK
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CD_ROM
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.RAM
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.UNKNOWN_TYPE
*/
trait DriveType extends js.Object

object DriveType {
  @scala.inline
  def CD_ROM: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CD_ROM = this.cast("CD_ROM")
  @scala.inline
  def FIXED: typings.qlikDashEngineapi.qlikDashEngineapiStrings.FIXED = this.cast("FIXED")
  @scala.inline
  def NETWORK: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NETWORK = this.cast("NETWORK")
  @scala.inline
  def RAM: typings.qlikDashEngineapi.qlikDashEngineapiStrings.RAM = this.cast("RAM")
  @scala.inline
  def REMOVABLE: typings.qlikDashEngineapi.qlikDashEngineapiStrings.REMOVABLE = this.cast("REMOVABLE")
  @scala.inline
  def UNKNOWN_TYPE: typings.qlikDashEngineapi.qlikDashEngineapiStrings.UNKNOWN_TYPE = this.cast("UNKNOWN_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

