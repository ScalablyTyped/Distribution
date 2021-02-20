package typings.shpjs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Buffer extends StObject {
    
    var buffer: ArrayBuffer = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply(buffer: ArrayBuffer): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
