package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Simple user interface events. */
@js.native
trait UIEvent extends Event {
  val detail: Double = js.native
  val view: Window | Null = js.native
  /** @deprecated */
  val which: Double = js.native
}

