package typings.ractive.Ractive

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPromise extends Object {
  def stop(): Unit
}

object AnimationPromise {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    stop: () => Unit
  ): AnimationPromise = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[AnimationPromise]
  }
}

