package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousObserverStatic
  extends /**
  * Creates an observer from the specified OnNext, OnError, and OnCompleted actions.
  * @param {Any} onNext Observer's OnNext action implementation.
  * @param {Any} onError Observer's OnError action implementation.
  * @param {Any} onCompleted Observer's OnCompleted action implementation.
  */
Instantiable0[AnonymousObserver[js.Object]]
     with Instantiable1[
      /* onNext */ js.Function1[/* value */ js.Object, Unit], 
      AnonymousObserver[js.Object]
    ]
     with Instantiable2[
      js.UndefOr[/* onNext */ js.Function1[/* value */ js.Object, Unit]], 
      /* onError */ js.Function1[/* exception */ js.Any, Unit], 
      AnonymousObserver[js.Object]
    ]
     with Instantiable3[
      js.UndefOr[/* onNext */ js.Function1[/* value */ js.Object, Unit]], 
      js.UndefOr[/* onError */ js.Function1[/* exception */ js.Any, Unit]], 
      /* onCompleted */ js.Function0[Unit], 
      AnonymousObserver[js.Object]
    ]
