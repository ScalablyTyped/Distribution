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
ScalablyTyped.runtime.Instantiable1[(/* el */ java.lang.String) | (/* el */ stdLib.Element), RellaxInstance]
     with /**
         * Inits and starts the Parallax animations
         * @param el Single element or string with selector of elements
         * @param options Options
         */
ScalablyTyped.runtime.Instantiable2[
      (/* el */ java.lang.String) | (/* el */ stdLib.Element), 
      /* options */ RellaxOptions, 
      RellaxInstance
    ]
     with /**
         * Inits and starts the Parallax animations
         * @param el Single element or string with selector of elements
         * @param options Options
         */
ScalablyTyped.runtime.Instantiable0[RellaxInstance] {
  /**
           * Inits and starts the Parallax animations
           * @param el Single element or string with selector of elements
           * @param options Options
           */
  def apply(): RellaxInstance = js.native
  /**
           * Inits and starts the Parallax animations
           * @param el Single element or string with selector of elements
           * @param options Options
           */
  def apply(el: java.lang.String): RellaxInstance = js.native
  /**
           * Inits and starts the Parallax animations
           * @param el Single element or string with selector of elements
           * @param options Options
           */
  def apply(el: java.lang.String, options: RellaxOptions): RellaxInstance = js.native
  /**
           * Inits and starts the Parallax animations
           * @param el Single element or string with selector of elements
           * @param options Options
           */
  def apply(el: stdLib.Element): RellaxInstance = js.native
  /**
           * Inits and starts the Parallax animations
           * @param el Single element or string with selector of elements
           * @param options Options
           */
  def apply(el: stdLib.Element, options: RellaxOptions): RellaxInstance = js.native
}

