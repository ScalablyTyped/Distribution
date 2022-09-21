package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferWhenMod {
  
  @JSImport("rxjs-compat/operator/bufferWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferWhen[T](
    closingSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[Any]
}
