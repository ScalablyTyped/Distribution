package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowCountMod {
  
  @JSImport("rxjs/operator/windowCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def windowCount[T](windowSize: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def windowCount[T](windowSize: Double, startWindowEvery: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
