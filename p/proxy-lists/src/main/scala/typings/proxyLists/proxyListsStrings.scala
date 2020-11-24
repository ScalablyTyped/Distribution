package typings.proxyLists

import typings.proxyLists.mod.AnonymityLevel
import typings.proxyLists.mod.IPType
import typings.proxyLists.mod.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyListsStrings {
  
  @scala.inline
  def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @scala.inline
  def elite: elite = "elite".asInstanceOf[elite]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @scala.inline
  def socks4: socks4 = "socks4".asInstanceOf[socks4]
  
  @scala.inline
  def socks5: socks5 = "socks5".asInstanceOf[socks5]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait anonymous extends AnonymityLevel
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait elite extends AnonymityLevel
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait http extends Protocol
  
  @js.native
  sealed trait https extends Protocol
  
  @js.native
  sealed trait ipv4 extends IPType
  
  @js.native
  sealed trait ipv6 extends IPType
  
  @js.native
  sealed trait loose extends js.Object
  
  @js.native
  sealed trait socks4 extends Protocol
  
  @js.native
  sealed trait socks5 extends Protocol
  
  @js.native
  sealed trait strict extends js.Object
  
  @js.native
  sealed trait transparent extends AnonymityLevel
}
