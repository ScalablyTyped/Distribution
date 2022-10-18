package typings.stormReactDiagrams.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams", "Toolkit")
@js.native
open class Toolkit ()
  extends typings.stormReactDiagrams.distSrcToolkitMod.Toolkit
/* static members */
object Toolkit {
  
  @JSImport("storm-react-diagrams", "Toolkit")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("storm-react-diagrams", "Toolkit.TESTING")
  @js.native
  def TESTING: Boolean = js.native
  inline def TESTING_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTING")(x.asInstanceOf[js.Any])
  
  @JSImport("storm-react-diagrams", "Toolkit.TESTING_UID")
  @js.native
  def TESTING_UID: Double = js.native
  inline def TESTING_UID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTING_UID")(x.asInstanceOf[js.Any])
  
  /**
    * Generats a unique ID (thanks Stack overflow :3)
    * @returns {String}
    */
  inline def UID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UID")().asInstanceOf[String]
  
  /**
    * Finds the closest element as a polyfill
    *
    * @param  {Element} element  [description]
    * @param  {string}  selector [description]
    */
  inline def closest(element: Element, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def generateCurvePath(
    firstPoint: typings.stormReactDiagrams.distSrcModelsPointModelMod.PointModel,
    lastPoint: typings.stormReactDiagrams.distSrcModelsPointModelMod.PointModel
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCurvePath")(firstPoint.asInstanceOf[js.Any], lastPoint.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCurvePath(
    firstPoint: typings.stormReactDiagrams.distSrcModelsPointModelMod.PointModel,
    lastPoint: typings.stormReactDiagrams.distSrcModelsPointModelMod.PointModel,
    curvy: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCurvePath")(firstPoint.asInstanceOf[js.Any], lastPoint.asInstanceOf[js.Any], curvy.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateDynamicPath(pathCoords: js.Array[js.Array[Double]]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDynamicPath")(pathCoords.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def generateLinePath(
    firstPoint: typings.stormReactDiagrams.distSrcModelsPointModelMod.PointModel,
    lastPoint: typings.stormReactDiagrams.distSrcModelsPointModelMod.PointModel
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLinePath")(firstPoint.asInstanceOf[js.Any], lastPoint.asInstanceOf[js.Any])).asInstanceOf[String]
}
