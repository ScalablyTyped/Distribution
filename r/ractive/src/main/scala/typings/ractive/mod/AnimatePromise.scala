package typings.ractive.mod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatePromise
  extends StObject
     with Promise[Unit] {
  
  /** Stops the associated animation. */
  def stop(): Unit = js.native
}
