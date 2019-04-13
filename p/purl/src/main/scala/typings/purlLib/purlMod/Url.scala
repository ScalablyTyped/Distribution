package typings
package purlLib.purlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url extends js.Object {
  /**
    * The .attr() method is used to return information on various parts of the URL.
    */
  def attr(option: java.lang.String): java.lang.String = js.native
  /**
    * Gets a parameter from the fragment segment
    */
  def fparam(): ParameterMap = js.native
  def fparam(parameterName: java.lang.String): java.lang.String = js.native
  /**
    * Gets the fragment segment at the especified position.
    */
  def fsegment(position: scala.Double): java.lang.String = js.native
  /**
    * The .param() method is used to return the values of querystring parameters.
    */
  def param(): ParameterMap = js.native
  def param(parameterName: java.lang.String): java.lang.String = js.native
  /**
    * The .segment() method is used to return values of individual segments from the URL's path.
    * Pass in an integer value to get the value of that segment - note however that the count is not zero-indexed like an array - i.e. .segment(1) returns the first segment, not the second one.
    * You can also pass in negative values, in which case it will count back from the end of the path rather than forwards from the start.
    */
  def segment(position: scala.Double): java.lang.String = js.native
}

