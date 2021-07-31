package typings.stormReactDiagrams

import typings.std.Element
import typings.stormReactDiagrams.pointModelMod.PointModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolkitMod {
  
  @JSImport("storm-react-diagrams/dist/src/Toolkit", "Toolkit")
  @js.native
  class Toolkit () extends StObject
  /* static members */
  object Toolkit {
    
    @JSImport("storm-react-diagrams/dist/src/Toolkit", "Toolkit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("storm-react-diagrams/dist/src/Toolkit", "Toolkit.TESTING")
    @js.native
    def TESTING: Boolean = js.native
    @scala.inline
    def TESTING_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTING")(x.asInstanceOf[js.Any])
    
    @JSImport("storm-react-diagrams/dist/src/Toolkit", "Toolkit.TESTING_UID")
    @js.native
    def TESTING_UID: Double = js.native
    @scala.inline
    def TESTING_UID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTING_UID")(x.asInstanceOf[js.Any])
    
    /**
      * Generats a unique ID (thanks Stack overflow :3)
      * @returns {String}
      */
    @scala.inline
    def UID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UID")().asInstanceOf[String]
    
    /**
      * Finds the closest element as a polyfill
      *
      * @param  {Element} element  [description]
      * @param  {string}  selector [description]
      */
    @scala.inline
    def closest(element: Element, selector: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def generateCurvePath(firstPoint: PointModel, lastPoint: PointModel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCurvePath")(firstPoint.asInstanceOf[js.Any], lastPoint.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def generateCurvePath(firstPoint: PointModel, lastPoint: PointModel, curvy: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCurvePath")(firstPoint.asInstanceOf[js.Any], lastPoint.asInstanceOf[js.Any], curvy.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def generateDynamicPath(pathCoords: js.Array[js.Array[Double]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDynamicPath")(pathCoords.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def generateLinePath(firstPoint: PointModel, lastPoint: PointModel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLinePath")(firstPoint.asInstanceOf[js.Any], lastPoint.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
