package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedObservable[TKey, TElement]
  extends StObject
     with Observable[TElement] {
  
  var key: TKey = js.native
  
  var underlyingObservable: Observable[TElement] = js.native
}
