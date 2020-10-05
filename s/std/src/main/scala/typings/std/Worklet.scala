package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worklet extends js.Object {
  def addModule(moduleURL: java.lang.String): js.Promise[Unit] = js.native
  def addModule(moduleURL: java.lang.String, options: WorkletOptions): js.Promise[Unit] = js.native
}

