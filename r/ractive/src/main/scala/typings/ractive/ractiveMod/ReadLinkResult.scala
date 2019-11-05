package typings.ractive.ractiveMod

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
    val __obj = js.Dynamic.literal(keypath = keypath, ractive = ractive)
  
    __obj.asInstanceOf[ReadLinkResult]
  }
}

