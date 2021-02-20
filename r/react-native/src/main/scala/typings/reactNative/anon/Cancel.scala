package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  def cancel(): Unit = js.native
  
  def done(args: js.Any*): js.Any = js.native
  
  def `then`(): js.Promise[_] = js.native
  def `then`(onfulfilled: js.UndefOr[scala.Nothing], onrejected: js.Function0[_]): js.Promise[_] = js.native
  def `then`(onfulfilled: js.Function0[_]): js.Promise[_] = js.native
  def `then`(onfulfilled: js.Function0[_], onrejected: js.Function0[_]): js.Promise[_] = js.native
}
