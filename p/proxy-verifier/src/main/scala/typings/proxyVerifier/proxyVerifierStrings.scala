package typings.proxyVerifier

import typings.proxyVerifier.mod.AnonymityLevel
import typings.proxyVerifier.mod.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object proxyVerifierStrings {
  @js.native
  sealed trait anonymous extends AnonymityLevel
  
  @js.native
  sealed trait elite extends AnonymityLevel
  
  @js.native
  sealed trait http extends Protocol
  
  @js.native
  sealed trait https extends Protocol
  
  @js.native
  sealed trait socks4 extends Protocol
  
  @js.native
  sealed trait socks5 extends Protocol
  
  @js.native
  sealed trait transparent extends AnonymityLevel
  
  @scala.inline
  def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  @scala.inline
  def elite: elite = "elite".asInstanceOf[elite]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def socks4: socks4 = "socks4".asInstanceOf[socks4]
  @scala.inline
  def socks5: socks5 = "socks5".asInstanceOf[socks5]
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
}

