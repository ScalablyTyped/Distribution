package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fromEventMod {
  
  type FromEventTarget[T] = typings.rxjs.fromEventMod.EventTargetLike[T] | typings.std.ArrayLike[typings.rxjs.fromEventMod.EventTargetLike[T]]
  
  type NodeEventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
}
