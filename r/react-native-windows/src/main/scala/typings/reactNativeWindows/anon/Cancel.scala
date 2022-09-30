package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  def cancel(): Unit = js.native
  
  def done(args: Any*): Any = js.native
  
  def `then`(): js.Promise[Any] = js.native
  def `then`(onfulfilled: js.Function0[Any]): js.Promise[Any] = js.native
  def `then`(onfulfilled: js.Function0[Any], onrejected: js.Function0[Any]): js.Promise[Any] = js.native
  def `then`(onfulfilled: Unit, onrejected: js.Function0[Any]): js.Promise[Any] = js.native
}
