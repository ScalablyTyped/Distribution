package typings.randomNumberCsprng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(minimum: Double, maximum: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def apply(minimum: Double, maximum: Double, cb: js.Function0[Unit]): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].apply(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @JSImport("random-number-csprng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
