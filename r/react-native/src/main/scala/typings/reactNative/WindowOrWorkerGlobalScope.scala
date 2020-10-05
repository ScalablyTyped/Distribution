package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends js.Object {
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

