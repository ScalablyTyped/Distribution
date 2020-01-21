package typings.qlikEngineapi.EngineAPI

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
  - typings.qlikEngineapi.qlikEngineapiStrings.REMOVABLE
  - typings.qlikEngineapi.qlikEngineapiStrings.FIXED
  - typings.qlikEngineapi.qlikEngineapiStrings.NETWORK
  - typings.qlikEngineapi.qlikEngineapiStrings.CD_ROM
  - typings.qlikEngineapi.qlikEngineapiStrings.RAM
  - typings.qlikEngineapi.qlikEngineapiStrings.UNKNOWN_TYPE
*/
trait DriveType extends js.Object

object DriveType {
  @scala.inline
  def CD_ROM: typings.qlikEngineapi.qlikEngineapiStrings.CD_ROM = this.cast("CD_ROM")
  @scala.inline
  def FIXED: typings.qlikEngineapi.qlikEngineapiStrings.FIXED = this.cast("FIXED")
  @scala.inline
  def NETWORK: typings.qlikEngineapi.qlikEngineapiStrings.NETWORK = this.cast("NETWORK")
  @scala.inline
  def RAM: typings.qlikEngineapi.qlikEngineapiStrings.RAM = this.cast("RAM")
  @scala.inline
  def REMOVABLE: typings.qlikEngineapi.qlikEngineapiStrings.REMOVABLE = this.cast("REMOVABLE")
  @scala.inline
  def UNKNOWN_TYPE: typings.qlikEngineapi.qlikEngineapiStrings.UNKNOWN_TYPE = this.cast("UNKNOWN_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

