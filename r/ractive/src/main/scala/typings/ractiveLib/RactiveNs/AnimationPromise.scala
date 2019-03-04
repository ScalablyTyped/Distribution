package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPromise
  extends stdLib.Object {
  def stop(): scala.Unit
}

object AnimationPromise {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stop: js.Function0[scala.Unit]
  ): AnimationPromise = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, stop = stop)
  
    __obj.asInstanceOf[AnimationPromise]
  }
}

