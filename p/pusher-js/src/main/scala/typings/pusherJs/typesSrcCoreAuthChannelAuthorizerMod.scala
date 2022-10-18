package typings.pusherJs

import typings.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationHandler
import typings.pusherJs.typesSrcCoreAuthOptionsMod.InternalAuthOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreAuthChannelAuthorizerMod {
  
  @JSImport("pusher-js/types/src/core/auth/channel_authorizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(authOptions: InternalAuthOptions): ChannelAuthorizationHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(authOptions.asInstanceOf[js.Any]).asInstanceOf[ChannelAuthorizationHandler]
}
