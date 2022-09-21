package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptionsBorn
import typings.rotJs.mapMapMod.CreateCallback
import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellularMod {
  
  @JSImport("rot-js/lib/map/cellular", JSImport.Default)
  @js.native
  open class default protected () extends Cellular {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: PartialOptionsBorn) = this()
  }
  
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
  
  type ConnectionCallback = js.Function2[/* from */ Point, /* to */ Point, Unit]
  
  trait Options extends StObject {
    
    var born: js.Array[Double]
    
    var survive: js.Array[Double]
    
    var topology: `4` | `6` | `8`
  }
  object Options {
    
    inline def apply(born: js.Array[Double], survive: js.Array[Double], topology: `4` | `6` | `8`): Options = {
      val __obj = js.Dynamic.literal(born = born.asInstanceOf[js.Any], survive = survive.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBorn(value: js.Array[Double]): Self = StObject.set(x, "born", value.asInstanceOf[js.Any])
      
      inline def setBornVarargs(value: Double*): Self = StObject.set(x, "born", js.Array(value*))
      
      inline def setSurvive(value: js.Array[Double]): Self = StObject.set(x, "survive", value.asInstanceOf[js.Any])
      
      inline def setSurviveVarargs(value: Double*): Self = StObject.set(x, "survive", js.Array(value*))
      
      inline def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = js.Tuple2[Double, Double]
  
  type PointMap = StringDictionary[Point]
}
