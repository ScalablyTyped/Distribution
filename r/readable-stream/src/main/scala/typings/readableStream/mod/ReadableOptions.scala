package typings.readableStream.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableOptions
  extends StObject
     with ReadableStateOptions {
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var read: js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]] = js.undefined
}
object ReadableOptions {
  
  @scala.inline
  def apply(): ReadableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableOptions]
  }
  
  @scala.inline
  implicit class ReadableOptionsMutableBuilder[Self <: ReadableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(
      value: js.ThisFunction2[
          /* this */ _Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setRead(value: js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
