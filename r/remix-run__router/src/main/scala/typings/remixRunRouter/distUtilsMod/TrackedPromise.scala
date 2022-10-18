package typings.remixRunRouter.distUtilsMod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackedPromise
  extends StObject
     with Promise[Any] {
  
  var _data: js.UndefOr[Any] = js.native
  
  var _error: js.UndefOr[Any] = js.native
  
  var _tracked: js.UndefOr[Boolean] = js.native
}
