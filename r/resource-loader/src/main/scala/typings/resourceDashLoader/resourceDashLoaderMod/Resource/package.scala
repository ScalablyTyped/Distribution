package typings.resourceDashLoader.resourceDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Resource {
  /**
    * When the resource finishes loading.
    *
    * @memberof Resource
    * @callback OnCompleteSignal
    * @param {Resource} resource - The resource that the event happened on.
    */
  type OnCompleteSignal = js.Function1[/* resource */ typings.resourceDashLoader.resourceDashLoaderMod.Resource, Unit]
  /**
    * When the resource reports loading progress.
    *
    * @memberof Resource
    * @callback OnProgressSignal
    * @param {Resource} resource - The resource that the event happened on.
    * @param {number} percentage - The progress of the load in the range [0, 1].
    */
  type OnProgressSignal = js.Function2[
    /* resource */ typings.resourceDashLoader.resourceDashLoaderMod.Resource, 
    /* percentage */ Double, 
    Unit
  ]
  /**
    * When the resource starts to load.
    *
    * @memberof Resource
    * @callback OnStartSignal
    * @param {Resource} resource - The resource that the event happened on.
    */
  type OnStartSignal = js.Function1[/* resource */ typings.resourceDashLoader.resourceDashLoaderMod.Resource, Unit]
}
