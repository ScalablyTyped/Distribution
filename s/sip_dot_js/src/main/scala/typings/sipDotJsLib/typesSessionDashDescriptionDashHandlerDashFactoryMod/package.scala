package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSessionDashDescriptionDashHandlerDashFactoryMod {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ sipDotJsLib.typesSessionMod.Session, 
    /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions], 
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
  ]
  type SessionDescriptionHandlerFactoryOptions = js.Object
}
