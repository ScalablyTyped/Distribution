package typings
package stormDashReactDashDiagramsLib.distSrcToolkitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/Toolkit", "Toolkit")
@js.native
class Toolkit () extends js.Object

/* static members */
@JSImport("storm-react-diagrams/dist/src/Toolkit", "Toolkit")
@js.native
object Toolkit extends js.Object {
  var TESTING: scala.Boolean = js.native
  var TESTING_UID: scala.Double = js.native
  /**
    * Generats a unique ID (thanks Stack overflow :3)
    * @returns {String}
    */
  def UID(): java.lang.String = js.native
  /**
    * Finds the closest element as a polyfill
    *
    * @param  {Element} element  [description]
    * @param  {string}  selector [description]
    */
  def closest(element: reactLib.Element, selector: java.lang.String): js.Any = js.native
  def generateCurvePath(
    firstPoint: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel,
    lastPoint: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel
  ): java.lang.String = js.native
  def generateCurvePath(
    firstPoint: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel,
    lastPoint: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel,
    curvy: scala.Double
  ): java.lang.String = js.native
  def generateDynamicPath(pathCoords: js.Array[js.Array[scala.Double]]): js.Any = js.native
  def generateLinePath(
    firstPoint: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel,
    lastPoint: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel
  ): java.lang.String = js.native
}

