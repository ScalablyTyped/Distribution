package typings.requiresPort

import typings.requiresPort.mod.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object requiresPortStrings {
  @js.native
  sealed trait file extends Protocol
  
  @js.native
  sealed trait ftp extends Protocol
  
  @js.native
  sealed trait gopher extends Protocol
  
  @js.native
  sealed trait http extends Protocol
  
  @js.native
  sealed trait https extends Protocol
  
  @js.native
  sealed trait ws extends Protocol
  
  @js.native
  sealed trait wss extends Protocol
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def ftp: ftp = "ftp".asInstanceOf[ftp]
  @scala.inline
  def gopher: gopher = "gopher".asInstanceOf[gopher]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def ws: ws = "ws".asInstanceOf[ws]
  @scala.inline
  def wss: wss = "wss".asInstanceOf[wss]
}

