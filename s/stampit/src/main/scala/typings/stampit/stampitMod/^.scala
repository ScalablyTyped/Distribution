package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Return a factory (aka Stamp) function that will produce new objects using the
    * prototypes that are passed in or composed.
    * @param options Stampit options object containing refs, methods,
    * init, props, statics, configurations, and property descriptors.
    */
  def apply(composables: StampitComposable*): Stamp = js.native
}

