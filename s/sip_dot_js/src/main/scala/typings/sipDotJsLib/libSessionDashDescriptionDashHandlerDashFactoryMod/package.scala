package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSessionDashDescriptionDashHandlerDashFactoryMod {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext, 
    /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions], 
    sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
  ]
  type SessionDescriptionHandlerFactoryOptions = js.Object
}
