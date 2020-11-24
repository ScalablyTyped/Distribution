package typings.requestPromiseNative.mod

import typings.request.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Thenable because Inheritance from two classes. Inlined 
- js.Promise because Inheritance from two classes. Inlined  */ @js.native
trait RequestPromise[T] extends Request {
  
  def promise(): js.Promise[T] = js.native
}
