package typings.serviceworkerWebpackPlugin

import typings.std.RegistrationOptions
import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serviceworker-webpack-plugin/lib/runtime", JSImport.Namespace)
@js.native
object runtimeMod extends js.Object {
  @js.native
  trait ServiceWorkerWebpackPluginRuntime extends js.Object {
    def register(): js.Promise[ServiceWorkerRegistration] = js.native
    def register(options: RegistrationOptions): js.Promise[ServiceWorkerRegistration] = js.native
  }
  
  val default: ServiceWorkerWebpackPluginRuntime = js.native
}

