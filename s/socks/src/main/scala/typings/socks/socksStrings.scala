package typings.socks

import typings.socks.constantsMod.SocksCommandOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socksStrings {
  
  @js.native
  sealed trait associate
    extends StObject
       with SocksCommandOption
  @scala.inline
  def associate: associate = "associate".asInstanceOf[associate]
  
  @js.native
  sealed trait bind
    extends StObject
       with SocksCommandOption
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  
  @js.native
  sealed trait bound extends StObject
  @scala.inline
  def bound: bound = "bound".asInstanceOf[bound]
  
  @js.native
  sealed trait connect
    extends StObject
       with SocksCommandOption
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait established extends StObject
  @scala.inline
  def established: established = "established".asInstanceOf[established]
  
  @js.native
  sealed trait host extends StObject
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait ipaddress extends StObject
  @scala.inline
  def ipaddress: ipaddress = "ipaddress".asInstanceOf[ipaddress]
}
