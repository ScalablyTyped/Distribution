package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatePromise
  extends js.Promise[Unit] {
  
  /** Stops the associated animation. */
  def stop(): Unit = js.native
}
