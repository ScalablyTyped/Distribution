package typings.sequelize.mod

import typings.lodash.mod.LoDashStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequelizeLoDash
  extends StObject
     with LoDashStatic {
  
  def camelizeIf(str: String, condition: Boolean): String = js.native
  
  /**
    * * Returns an array with some falsy values removed. The values null, "", undefined and NaN are considered
    * falsey.
    *
    * @param arr Array to compact.
    */
  def compactLite[T](arr: js.Array[T]): js.Array[T] = js.native
  
  def matchesDots(dots: String, value: js.Object): js.Function1[/* item */ js.Object, Boolean] = js.native
  def matchesDots(dots: js.Array[String], value: js.Object): js.Function1[/* item */ js.Object, Boolean] = js.native
  
  def underscoredIf(str: String, condition: Boolean): String = js.native
}
