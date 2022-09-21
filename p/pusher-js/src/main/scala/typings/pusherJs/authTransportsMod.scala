package typings.pusherJs

import org.scalablytyped.runtime.StringDictionary
import typings.pusherJs.interfaceMod.Runtime
import typings.pusherJs.optionsMod.AuthRequestType
import typings.pusherJs.optionsMod.InternalAuthOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authTransportsMod {
  
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
