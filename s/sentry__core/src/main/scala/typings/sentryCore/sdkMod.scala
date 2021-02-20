package typings.sentryCore

import org.scalablytyped.runtime.Instantiable1
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkMod {
  
  @JSImport("@sentry/core/dist/sdk", "initAndBind")
  @js.native
  def initAndBind[F /* <: Client[Options] */, O /* <: Options */](clientClass: ClientClass[F, O], options: O): Unit = js.native
  
  type ClientClass[F /* <: Client[Options] */, O /* <: Options */] = Instantiable1[/* options */ O, F]
}
