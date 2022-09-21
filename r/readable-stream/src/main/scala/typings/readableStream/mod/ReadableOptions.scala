package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableOptions
  extends StObject
     with ReadableStateOptions {
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ IReadable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var read: js.UndefOr[js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]] = js.undefined
}
object ReadableOptions {
  
  inline def apply(): ReadableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableOptions]
  }
  
  extension [Self <: ReadableOptions](x: Self) {
    
    inline def setDestroy(
      value: js.ThisFunction2[
          /* this */ IReadable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setRead(value: js.ThisFunction1[/* this */ IReadable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
