package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_TIMEOUT: /* 30000 */ scala.Double = typings.socks.constantsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_TIMEOUT").asInstanceOf[/* 30000 */ scala.Double]

type SocksClientBoundEvent = typings.socks.constantsMod.SocksClientEstablishedEvent

/**
  * Represents a SocksProxy
  */
type SocksProxy = typings.socks.utilMod.RequireOnlyOne[
typings.socks.anon.Host, 
typings.socks.socksStrings.host | typings.socks.socksStrings.ipaddress]
