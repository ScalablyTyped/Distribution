package typings.sha1

import typings.node.Buffer
import typings.sha1.sha1Booleans.`false`
import typings.sha1.sha1Booleans.`true`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * js function for hashing messages with SHA1
    *
    * @param message - a string or buffer to hash
    * @param options - an options object
    * @returns the resultant SHA1 hash of the given message
    */
  inline def apply(message: String): String = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(message: String, options: Sha1AsBytesOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  inline def apply(message: String, options: Sha1AsStringOptions): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: String, options: Sha1Options): String | Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Uint8Array]
  inline def apply(message: Buffer): String = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(message: Buffer, options: Sha1AsBytesOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  inline def apply(message: Buffer, options: Sha1AsStringOptions): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: Buffer, options: Sha1Options): String | Uint8Array = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Uint8Array]
  
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
    
    extension [Self <: Sha1AsBytesOptions](x: Self) {
      
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
    
    extension [Self <: Sha1AsStringOptions](x: Self) {
      
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
