package typings
package stackDashUtilsLib.stackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackUtils extends js.Object {
  def at(): CallSiteLike = js.native
  def at(startStackFunction: js.Function): CallSiteLike = js.native
  def capture(): js.Array[CallSite] = js.native
  def capture(limit: scala.Double): js.Array[CallSite] = js.native
  def capture(limit: scala.Double, startStackFunction: js.Function): js.Array[CallSite] = js.native
  def capture(startStackFunction: js.Function): js.Array[CallSite] = js.native
  def captureString(): java.lang.String = js.native
  def captureString(limit: scala.Double): java.lang.String = js.native
  def captureString(limit: scala.Double, startStackFunction: js.Function): java.lang.String = js.native
  def captureString(startStackFunction: js.Function): java.lang.String = js.native
  def clean(stack: java.lang.String): java.lang.String = js.native
  def clean(stack: js.Array[java.lang.String]): java.lang.String = js.native
  def parseLine(line: java.lang.String): StackLineData | scala.Null = js.native
}

