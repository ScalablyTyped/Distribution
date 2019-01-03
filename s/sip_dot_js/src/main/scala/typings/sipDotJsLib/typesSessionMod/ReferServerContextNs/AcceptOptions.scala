package typings
package sipDotJsLib.typesSessionMod.ReferServerContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptOptions extends js.Object {
  /** If true, accept REFER request and automatically attempt to follow it. */
  var followRefer: js.UndefOr[scala.Boolean] = js.undefined
  /** If followRefer is true, options to following INVITE request. */
  var inviteOptions: sipDotJsLib.typesSessionMod.InviteClientContextNs.Options
}

