package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDistanceForDirectionMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/getDistanceForDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(layout: Layout, gestureDirection: GestureDirection): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(layout.asInstanceOf[js.Any], gestureDirection.asInstanceOf[js.Any])).asInstanceOf[Double]
}
