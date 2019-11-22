package typings.rsmq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* response */ T, Unit]
  type DeleteQueueOptions = BaseOptions
  type GetQueueAttributesOptions = BaseOptions
  type PopMessageOptions = BaseOptions
}
