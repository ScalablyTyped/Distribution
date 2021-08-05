package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.std.ArrayLike
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WritableOptions
  extends StObject
     with WritableStateOptions {
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}
object WritableOptions {
  
  inline def apply(): WritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableOptions]
  }
  
  extension [Self <: WritableOptions](x: Self) {
    
    inline def setDestroy(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setFinal(
      value: js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
    
    inline def setWrite(
      value: js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding | String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    
    inline def setWritev(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* chunk */ ArrayLike[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
    
    inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
  }
}
