package typings.sha1

import typings.node.bufferMod.global.Buffer
import typings.sha1.sha1Booleans.`false`
import typings.sha1.sha1Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(message: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def apply(message: String, options: Sha1AsBytesOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def apply(message: String, options: Sha1AsStringOptions): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: String, options: Sha1Options): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def apply(message: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def apply(message: Buffer, options: Sha1AsBytesOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def apply(message: Buffer, options: Sha1AsStringOptions): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: Buffer, options: Sha1Options): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Sha1AsBytesOptions
    extends StObject
       with Sha1Options {
    
    var asBytes: `true`
    
    var asString: js.UndefOr[`false`] = js.undefined
  }
  object Sha1AsBytesOptions {
    
    inline def apply(): Sha1AsBytesOptions = {
      val __obj = js.Dynamic.literal(asBytes = true)
      __obj.asInstanceOf[Sha1AsBytesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sha1AsBytesOptions] (val x: Self) extends AnyVal {
      
      inline def setAsBytes(value: `true`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      inline def setAsString(value: `false`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
    }
  }
  
  trait Sha1AsStringOptions
    extends StObject
       with Sha1Options {
    
    var asBytes: js.UndefOr[`false`] = js.undefined
    
    var asString: js.UndefOr[Boolean] = js.undefined
  }
  object Sha1AsStringOptions {
    
    inline def apply(): Sha1AsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sha1AsStringOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sha1AsStringOptions] (val x: Self) extends AnyVal {
      
      inline def setAsBytes(value: `false`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      inline def setAsBytesUndefined: Self = StObject.set(x, "asBytes", js.undefined)
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sha1.mod.Sha1AsStringOptions
    - typings.sha1.mod.Sha1AsBytesOptions
  */
  trait Sha1Options extends StObject
  object Sha1Options {
    
    inline def Sha1AsBytesOptions(): typings.sha1.mod.Sha1AsBytesOptions = {
      val __obj = js.Dynamic.literal(asBytes = true)
      __obj.asInstanceOf[typings.sha1.mod.Sha1AsBytesOptions]
    }
    
    inline def Sha1AsStringOptions(): typings.sha1.mod.Sha1AsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.sha1.mod.Sha1AsStringOptions]
    }
  }
}
