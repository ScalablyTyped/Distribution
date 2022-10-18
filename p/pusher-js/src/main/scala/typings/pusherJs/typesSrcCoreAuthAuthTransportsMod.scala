package typings.pusherJs

import org.scalablytyped.runtime.StringDictionary
import typings.pusherJs.typesSrcCoreAuthOptionsMod.AuthRequestType
import typings.pusherJs.typesSrcCoreAuthOptionsMod.InternalAuthOptions
import typings.pusherJs.typesSrcRuntimesInterfaceMod.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreAuthAuthTransportsMod {
  
  type AuthTransport = js.Function5[
    /* context */ Runtime, 
    /* query */ String, 
    /* authOptions */ InternalAuthOptions, 
    /* authRequestType */ AuthRequestType, 
    /* callback */ js.Function, 
    Unit
  ]
  
  type AuthTransports = StringDictionary[AuthTransport]
}
