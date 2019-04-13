package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequelizeLoDash
  extends lodashLib.lodashMod.LoDashStatic {
  def camelizeIf(str: java.lang.String, condition: scala.Boolean): java.lang.String = js.native
  /**
    * * Returns an array with some falsy values removed. The values null, "", undefined and NaN are considered
    * falsey.
    *
    * @param arr Array to compact.
    */
  def compactLite[T](arr: js.Array[T]): js.Array[T] = js.native
  def matchesDots(dots: java.lang.String, value: js.Object): js.Function1[/* item */ js.Object, scala.Boolean] = js.native
  def matchesDots(dots: js.Array[java.lang.String], value: js.Object): js.Function1[/* item */ js.Object, scala.Boolean] = js.native
  def underscoredIf(str: java.lang.String, condition: scala.Boolean): java.lang.String = js.native
}

