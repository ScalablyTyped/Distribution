package typings.rsocketCore

import typings.rsocketCore.rsocketbufferutilsMod.Encoding
import typings.rsocketCore.rsocketleaseMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rsocketCoreStrings {
  @js.native
  sealed trait Accept extends EventType
  
  @js.native
  sealed trait Reject extends EventType
  
  @js.native
  sealed trait Terminate extends EventType
  
  @js.native
  sealed trait ascii extends Encoding
  
  @js.native
  sealed trait base64 extends Encoding
  
  @js.native
  sealed trait hex extends Encoding
  
  @js.native
  sealed trait utf8 extends Encoding
  
  @scala.inline
  def Accept: Accept = "Accept".asInstanceOf[Accept]
  @scala.inline
  def Reject: Reject = "Reject".asInstanceOf[Reject]
  @scala.inline
  def Terminate: Terminate = "Terminate".asInstanceOf[Terminate]
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

