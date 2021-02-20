package typings.sidewayAddress

import typings.sidewayAddress.mod.ip.Cidr
import typings.sidewayAddress.mod.ip.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidewayAddressStrings {
  
  @js.native
  sealed trait forbidden extends Cidr
  @scala.inline
  def forbidden: forbidden = "forbidden".asInstanceOf[forbidden]
  
  @js.native
  sealed trait ipv4 extends Version
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @js.native
  sealed trait ipv6 extends Version
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @js.native
  sealed trait ipvfuture extends Version
  @scala.inline
  def ipvfuture: ipvfuture = "ipvfuture".asInstanceOf[ipvfuture]
  
  @js.native
  sealed trait optional extends Cidr
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait required extends Cidr
  @scala.inline
  def required: required = "required".asInstanceOf[required]
}
