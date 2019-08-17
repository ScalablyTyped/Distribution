package typings.rsocketDashCore

import typings.rsocketDashCore.rSocketBufferUtilsMod.Encoding
import typings.rsocketDashCore.rSocketMachineMod.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rsocketDashCoreStrings {
  @js.native
  sealed trait CLIENT extends Role
  
  @js.native
  sealed trait SERVER extends Role
  
  @js.native
  sealed trait ascii extends Encoding
  
  @js.native
  sealed trait base64 extends Encoding
  
  @js.native
  sealed trait hex extends Encoding
  
  @js.native
  sealed trait utf8 extends Encoding
  
  @scala.inline
  def CLIENT: CLIENT = "CLIENT".asInstanceOf[CLIENT]
  @scala.inline
  def SERVER: SERVER = "SERVER".asInstanceOf[SERVER]
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

