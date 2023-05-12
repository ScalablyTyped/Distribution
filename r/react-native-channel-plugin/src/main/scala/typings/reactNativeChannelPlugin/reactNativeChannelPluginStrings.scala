package typings.reactNativeChannelPlugin

import typings.reactNativeChannelPlugin.mod.BootStatus
import typings.reactNativeChannelPlugin.mod.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeChannelPluginStrings {
  
  @js.native
  sealed trait ACCESS_DENIED
    extends StObject
       with BootStatus
  inline def ACCESS_DENIED: ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ACCESS_DENIED]
  
  @js.native
  sealed trait NETWORK_TIMEOUT
    extends StObject
       with BootStatus
  inline def NETWORK_TIMEOUT: NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[NETWORK_TIMEOUT]
  
  @js.native
  sealed trait NOT_AVAILABLE_VERSION
    extends StObject
       with BootStatus
  inline def NOT_AVAILABLE_VERSION: NOT_AVAILABLE_VERSION = "NOT_AVAILABLE_VERSION".asInstanceOf[NOT_AVAILABLE_VERSION]
  
  @js.native
  sealed trait NOT_INITIALIZED
    extends StObject
       with BootStatus
  inline def NOT_INITIALIZED: NOT_INITIALIZED = "NOT_INITIALIZED".asInstanceOf[NOT_INITIALIZED]
  
  @js.native
  sealed trait REQUIRE_PAYMENT
    extends StObject
       with BootStatus
  inline def REQUIRE_PAYMENT: REQUIRE_PAYMENT = "REQUIRE_PAYMENT".asInstanceOf[REQUIRE_PAYMENT]
  
  @js.native
  sealed trait SERVICE_UNDER_CONSTRUCTION
    extends StObject
       with BootStatus
  inline def SERVICE_UNDER_CONSTRUCTION: SERVICE_UNDER_CONSTRUCTION = "SERVICE_UNDER_CONSTRUCTION".asInstanceOf[SERVICE_UNDER_CONSTRUCTION]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with BootStatus
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with BootStatus
  inline def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  
  @js.native
  sealed trait bottom extends StObject
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait en
    extends StObject
       with Language
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait jp
    extends StObject
       with Language
  inline def jp: jp = "jp".asInstanceOf[jp]
  
  @js.native
  sealed trait ko
    extends StObject
       with Language
  inline def ko: ko = "ko".asInstanceOf[ko]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
}
