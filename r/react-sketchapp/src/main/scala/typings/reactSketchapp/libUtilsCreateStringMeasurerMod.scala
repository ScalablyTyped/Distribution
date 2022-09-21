package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.PlatformBridge
import typings.reactSketchapp.libTypesMod.Size
import typings.reactSketchapp.libTypesMod.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCreateStringMeasurerMod {
  
  @JSImport("react-sketchapp/lib/utils/createStringMeasurer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStringMeasurer(bridge: PlatformBridge): js.Function1[
    /* textNodes */ js.Array[TextNode], 
    js.Function1[/* width */ js.UndefOr[Double], Size]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringMeasurer")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* textNodes */ js.Array[TextNode], 
    js.Function1[/* width */ js.UndefOr[Double], Size]
  ]]
}
