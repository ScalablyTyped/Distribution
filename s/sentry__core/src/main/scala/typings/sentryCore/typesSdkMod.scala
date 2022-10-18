package typings.sentryCore

import org.scalablytyped.runtime.Instantiable1
import typings.sentryTypes.typesClientMod.Client
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSdkMod {
  
  @JSImport("@sentry/core/types/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initAndBind[F /* <: Client[ClientOptions[BaseTransportOptions]] */, O /* <: ClientOptions[BaseTransportOptions] */](clientClass: ClientClass[F, O], options: O): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initAndBind")(clientClass.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ClientClass[F /* <: Client[ClientOptions[BaseTransportOptions]] */, O /* <: ClientOptions[BaseTransportOptions] */] = Instantiable1[/* options */ O, F]
}
