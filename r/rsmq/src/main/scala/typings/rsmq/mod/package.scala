package typings.rsmq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* response */ T, scala.Unit]
  
  type DeleteQueueOptions = typings.rsmq.mod.BaseOptions
  
  type GetQueueAttributesOptions = typings.rsmq.mod.BaseOptions
  
  type PopMessageOptions = typings.rsmq.mod.BaseOptions
}
