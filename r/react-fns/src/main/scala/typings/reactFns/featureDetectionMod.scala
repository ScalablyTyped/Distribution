package typings.reactFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureDetectionMod {
  
  @JSImport("react-fns/dist/utils/featureDetection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/utils/featureDetection", "supportsPassiveListener")
  @js.native
  def supportsPassiveListener: Boolean = js.native
  @scala.inline
  def supportsPassiveListener_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsPassiveListener")(x.asInstanceOf[js.Any])
}
