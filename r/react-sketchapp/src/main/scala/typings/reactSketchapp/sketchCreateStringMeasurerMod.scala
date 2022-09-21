package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.Size
import typings.reactSketchapp.libTypesMod.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sketchCreateStringMeasurerMod {
  
  @JSImport("react-sketchapp/lib/platformBridges/sketch/createStringMeasurer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStringMeasurer(textNodes: js.Array[TextNode], width: Double): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("createStringMeasurer")(textNodes.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Size]
}
