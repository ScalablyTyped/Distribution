package typings.stackDashUtils.stackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackUtils extends js.Object {
  def at(): CallSiteLike = js.native
  def at(startStackFunction: js.Function): CallSiteLike = js.native
  def capture(): js.Array[CallSite] = js.native
  def capture(limit: Double): js.Array[CallSite] = js.native
  def capture(limit: Double, startStackFunction: js.Function): js.Array[CallSite] = js.native
  def capture(startStackFunction: js.Function): js.Array[CallSite] = js.native
  def captureString(): String = js.native
  def captureString(limit: Double): String = js.native
  def captureString(limit: Double, startStackFunction: js.Function): String = js.native
  def captureString(startStackFunction: js.Function): String = js.native
  def clean(stack: String): String = js.native
  def clean(stack: js.Array[String]): String = js.native
  def parseLine(line: String): StackLineData | Null = js.native
}

