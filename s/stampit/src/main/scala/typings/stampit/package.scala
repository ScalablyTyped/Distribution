package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampit {
  /** @internal A plain old JavaScript object created by a `Stamp`. */
  type Pojo = js.Object
  /** @internal Base type for all `properties`-like metadata. */
  // TODO: discriminate Array
  type PropertyMap = js.Object
}
