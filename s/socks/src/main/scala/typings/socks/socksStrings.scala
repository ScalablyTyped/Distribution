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
  inline def associate: associate = "associate".asInstanceOf[associate]
  
  @js.native
  sealed trait bind
    extends StObject
       with SocksCommandOption
  inline def bind: bind = "bind".asInstanceOf[bind]
  
  @js.native
  sealed trait bound extends StObject
  inline def bound: bound = "bound".asInstanceOf[bound]
  
  @js.native
  sealed trait connect
    extends StObject
       with SocksCommandOption
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait established extends StObject
  inline def established: established = "established".asInstanceOf[established]
  
  @js.native
  sealed trait host extends StObject
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait ipaddress extends StObject
  inline def ipaddress: ipaddress = "ipaddress".asInstanceOf[ipaddress]
}
