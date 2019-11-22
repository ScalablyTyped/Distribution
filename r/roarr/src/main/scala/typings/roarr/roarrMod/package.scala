package typings.roarr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object roarrMod {
  type MessageEventHandlerType = js.Function1[/* message */ MessageType, Unit]
  type SprintfArgumentType = String | Double | Boolean | Null
  type TranslateMessageFunctionType = js.Function1[/* message */ MessageType, MessageType]
}
