package typings.reactNativeGetRandomValues

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type TypedIntArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray
  
  object global {
    
    @js.native
    trait crypto extends StObject {
      
      def getRandomValues(array: js.typedarray.Int16Array): js.typedarray.Int16Array | Null = js.native
      def getRandomValues(array: js.typedarray.Int32Array): js.typedarray.Int32Array | Null = js.native
      def getRandomValues(array: js.typedarray.Int8Array): js.typedarray.Int8Array | Null = js.native
      def getRandomValues(array: js.typedarray.Uint16Array): js.typedarray.Uint16Array | Null = js.native
      def getRandomValues(array: js.typedarray.Uint32Array): js.typedarray.Uint32Array | Null = js.native
      def getRandomValues(array: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
      def getRandomValues(array: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray | Null = js.native
    }
  }
}
