package typings.puppeteerLottie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-lottie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Renders the given Lottie animation via Puppeteer.
    *
    * You must pass either `path` or `animationData` to specify the Lottie animation.
    * @async
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(opts: Options): js.Promise[Unit] = js.native
}
