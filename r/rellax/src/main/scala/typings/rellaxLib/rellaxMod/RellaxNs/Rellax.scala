package typings
package rellaxLib.rellaxMod.RellaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rellax
  extends /**
  * Inits and starts the Parallax animations
  * @param el Single element or string with selector of elements
  * @param options Options
  */
org.scalablytyped.runtime.Instantiable0[RellaxInstance]
     with org.scalablytyped.runtime.Instantiable2[
      (/* el */ stdLib.Element) | (/* el */ java.lang.String), 
      /* options */ RellaxOptions, 
      RellaxInstance
    ]
     with org.scalablytyped.runtime.Instantiable1[(/* el */ stdLib.Element) | (/* el */ java.lang.String), RellaxInstance] {
  /**
    * Inits and starts the Parallax animations
    * @param el Single element or string with selector of elements
    * @param options Options
    */
  def apply(): RellaxInstance = js.native
  def apply(el: java.lang.String): RellaxInstance = js.native
  def apply(el: java.lang.String, options: RellaxOptions): RellaxInstance = js.native
  def apply(el: stdLib.Element): RellaxInstance = js.native
  def apply(el: stdLib.Element, options: RellaxOptions): RellaxInstance = js.native
}

