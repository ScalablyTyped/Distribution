package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLinkResult extends js.Object {
  /** The keypath of the source in the host instance. */
  var keypath: String
  /** The Ractive instance that hosts the source keypath. */
  var ractive: Ractive[Ractive[_]]
}

object ReadLinkResult {
  @scala.inline
  def apply(keypath: String, ractive: Ractive[Ractive[_]]): ReadLinkResult = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadLinkResult]
  }
}

