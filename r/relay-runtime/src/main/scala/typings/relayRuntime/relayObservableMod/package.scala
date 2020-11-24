package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object relayObservableMod {
  
  type ObservableFromValue[T] = typings.relayRuntime.relayObservableMod.Subscribable[T] | js.Promise[T] | T
  
  type Source[T] = js.Function1[
    /* sink */ typings.relayRuntime.relayObservableMod.Sink[T], 
    scala.Unit | typings.relayRuntime.relayObservableMod.Subscription | js.Function0[js.Any]
  ]
}
