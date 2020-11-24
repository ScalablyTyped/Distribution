package typings.shareApiPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Navigator extends js.Object {
    
    def share(): js.Promise[Unit] = js.native
    def share(data: js.UndefOr[scala.Nothing], configuration: ShareAPIPolyfillOptions): js.Promise[Unit] = js.native
    def share(data: ShareAPIPolyfillData): js.Promise[Unit] = js.native
    def share(data: ShareAPIPolyfillData, configuration: ShareAPIPolyfillOptions): js.Promise[Unit] = js.native
  }
}
