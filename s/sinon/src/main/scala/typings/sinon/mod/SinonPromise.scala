package typings.sinon.mod

import typings.sinon.sinonStrings.pending
import typings.sinon.sinonStrings.rejected
import typings.sinon.sinonStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonPromise[T]
  extends js.Promise[T] {
  
  def reject(reason: Any): js.Promise[Unit] = js.native
  
  var rejectedValue: js.UndefOr[Any] = js.native
  
  def resolve(`val`: Any): js.Promise[T] = js.native
  
  var resolvedValue: js.UndefOr[T] = js.native
  
  var status: pending | resolved | rejected = js.native
}
