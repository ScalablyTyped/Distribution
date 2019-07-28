package typings.senchaUnderscoreTouch.ExtNs.drawNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.Draw")
@js.native
class Draw () extends js.Object

/* static members */
@JSGlobal("Ext.draw.Draw")
@js.native
object Draw extends js.Object {
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Converting radians to degrees
  		* @param radian Number
  		* @returns Number
  		*/
  def degrees(): Double = js.native
  def degrees(radian: Double): Double = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method]
  		* @param bbox1 Object
  		* @param bbox2 Object
  		* @param padding Number
  		* @returns Boolean
  		*/
  def isBBoxIntersect(): Boolean = js.native
  def isBBoxIntersect(bbox1: js.Any): Boolean = js.native
  def isBBoxIntersect(bbox1: js.Any, bbox2: js.Any): Boolean = js.native
  def isBBoxIntersect(bbox1: js.Any, bbox2: js.Any, padding: Double): Boolean = js.native
  /** [Method] Converting degrees to radians
  		* @param degrees Number
  		* @returns Number
  		*/
  def rad(): Double = js.native
  def rad(degrees: Double): Double = js.native
  /** [Method] Function that returns its first element
  		* @param a Mixed
  		* @returns Mixed
  		*/
  def reflectFn(): js.Any = js.native
  def reflectFn(a: js.Any): js.Any = js.native
  /** [Method] Given coordinates of the points calculates coordinates of a Bezier curve that goes through them
  		* @param dataX Object x-coordinates of the points.
  		* @param dataY Object y-coordinates of the points.
  		* @param value Object A value to control the smoothness of the curve.
  		* @returns Object Object holding two arrays, for x and y coordinates of the curve.
  		*/
  def smooth(): js.Any = js.native
  def smooth(dataX: js.Any): js.Any = js.native
  def smooth(dataX: js.Any, dataY: js.Any): js.Any = js.native
  def smooth(dataX: js.Any, dataY: js.Any, value: js.Any): js.Any = js.native
  /** [Method] Natural cubic spline interpolation
  		* @param points Array Array of numbers.
  		*/
  def spline(): Unit = js.native
  def spline(points: Array): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
}

