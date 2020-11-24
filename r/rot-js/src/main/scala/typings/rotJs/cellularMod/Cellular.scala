package typings.rotJs.cellularMod

import typings.rotJs.anon.PartialOptionsBorn
import typings.rotJs.mapMapMod.CreateCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cellular
  extends typings.rotJs.mapMapMod.default {
  
  var _dirs: js.Array[js.Array[Double]] = js.native
  
  def _findConnected(
    connected: PointMap,
    notConnected: PointMap,
    stack: js.Array[Point],
    keepNotConnected: Boolean,
    value: Double
  ): Unit = js.native
  
  def _freeSpace(x: Double, y: Double, value: Double): Boolean = js.native
  
  def _getClosest(point: Point, space: PointMap): Point = js.native
  
  /**
    * Find random points to connect. Search for the closest point in the larger space.
    * This is to minimize the length of the passage while maintaining good performance.
    */
  def _getFromTo(connected: PointMap, notConnected: PointMap): js.Array[Point] = js.native
  
  /**
    * Get neighbor count at [i,j] in this._map
    */
  def _getNeighbors(cx: Double, cy: Double): Double = js.native
  
  var _map: js.Array[js.Array[Double]] = js.native
  
  var _options: Options = js.native
  
  def _pointKey(p: Point): String = js.native
  
  def _serviceCallback(callback: CreateCallback): Unit = js.native
  
  def _tunnelToConnected(to: Point, from: Point, connected: PointMap, notConnected: PointMap, value: Double): Unit = js.native
  def _tunnelToConnected(
    to: Point,
    from: Point,
    connected: PointMap,
    notConnected: PointMap,
    value: Double,
    connectionCallback: ConnectionCallback
  ): Unit = js.native
  
  def _tunnelToConnected6(to: Point, from: Point, connected: PointMap, notConnected: PointMap, value: Double): Unit = js.native
  def _tunnelToConnected6(
    to: Point,
    from: Point,
    connected: PointMap,
    notConnected: PointMap,
    value: Double,
    connectionCallback: ConnectionCallback
  ): Unit = js.native
  
  /**
    * Make sure every non-wall space is accessible.
    * @param {function} callback to call to display map when do
    * @param {int} value to consider empty space - defaults to 0
    * @param {function} callback to call when a new connection is made
    */
  def connect(callback: CreateCallback, value: Double): Unit = js.native
  def connect(callback: CreateCallback, value: Double, connectionCallback: ConnectionCallback): Unit = js.native
  
  /**
    * Fill the map with random values
    * @param {float} probability Probability for a cell to become alive; 0 = all empty, 1 = all full
    */
  def randomize(probability: Double): this.type = js.native
  
  def set(x: Double, y: Double, value: Double): Unit = js.native
  
  /**
    * Change options.
    * @see ROT.Map.Cellular
    */
  def setOptions(options: PartialOptionsBorn): Unit = js.native
}
