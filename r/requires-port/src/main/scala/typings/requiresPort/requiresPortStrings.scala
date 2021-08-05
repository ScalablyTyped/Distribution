package typings.requiresPort

import typings.requiresPort.mod.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requiresPortStrings {
  
  @js.native
  sealed trait file
    extends StObject
       with Protocol
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait ftp
    extends StObject
       with Protocol
  inline def ftp: ftp = "ftp".asInstanceOf[ftp]
  
  @js.native
  sealed trait gopher
    extends StObject
       with Protocol
  inline def gopher: gopher = "gopher".asInstanceOf[gopher]
  
  @js.native
  sealed trait http
    extends StObject
       with Protocol
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with Protocol
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait ws
    extends StObject
       with Protocol
  inline def ws: ws = "ws".asInstanceOf[ws]
  
  @js.native
  sealed trait wss
    extends StObject
       with Protocol
  inline def wss: wss = "wss".asInstanceOf[wss]
}
