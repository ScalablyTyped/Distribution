package typings.sentryCore

import org.scalablytyped.runtime.Instantiable1
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkMod {
  
  @JSImport("@sentry/core/dist/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initAndBind[F /* <: Client[Options] */, O /* <: Options */](clientClass: ClientClass[F, O], options: O): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initAndBind")(clientClass.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ClientClass[F /* <: Client[Options] */, O /* <: Options */] = Instantiable1[/* options */ O, F]
}
