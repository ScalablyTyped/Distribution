package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.PlatformBridge
import typings.reactSketchapp.libUtilsContextMod.Context
import typings.reactTestRenderer.mod.ReactTestRendererNode
import typings.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeYogaTreeMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/computeYogaTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeYogaTree(bridge: PlatformBridge): js.Function2[/* root */ ReactTestRendererNode, /* context */ Context, YogaNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeYogaTree")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* root */ ReactTestRendererNode, /* context */ Context, YogaNode]]
}
