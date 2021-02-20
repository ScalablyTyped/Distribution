package typings.sha1

import typings.node.Buffer
import typings.sha1.sha1Booleans.`false`
import typings.sha1.sha1Booleans.`true`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * js function for hashing messages with SHA1
    *
    * @param message - a string or buffer to hash
    * @param options - an options object
    * @returns the resultant SHA1 hash of the given message
    */
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: String): String = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: String, options: Sha1AsBytesOptions): Uint8Array = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: String, options: Sha1AsStringOptions): String = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: String, options: Sha1Options): String | Uint8Array = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: Buffer): String = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: Buffer, options: Sha1AsBytesOptions): Uint8Array = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: Buffer, options: Sha1AsStringOptions): String = js.native
  @JSImport("sha1", JSImport.Namespace)
  @js.native
  def apply(message: Buffer, options: Sha1Options): String | Uint8Array = js.native
  
  @js.native
  trait Sha1AsBytesOptions extends Sha1Options {
    
    var asBytes: `true` = js.native
    
    var asString: js.UndefOr[`false`] = js.native
  }
  object Sha1AsBytesOptions {
    
    @scala.inline
    def apply(asBytes: `true`): Sha1AsBytesOptions = {
      val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sha1AsBytesOptions]
    }
    
    @scala.inline
    implicit class Sha1AsBytesOptionsMutableBuilder[Self <: Sha1AsBytesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBytes(value: `true`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsString(value: `false`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
    }
  }
  
  @js.native
  trait Sha1AsStringOptions extends Sha1Options {
    
    var asBytes: js.UndefOr[`false`] = js.native
    
    var asString: js.UndefOr[Boolean] = js.native
  }
  object Sha1AsStringOptions {
    
    @scala.inline
    def apply(): Sha1AsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sha1AsStringOptions]
    }
    
    @scala.inline
    implicit class Sha1AsStringOptionsMutableBuilder[Self <: Sha1AsStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBytes(value: `false`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsBytesUndefined: Self = StObject.set(x, "asBytes", js.undefined)
      
      @scala.inline
      def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sha1.mod.Sha1AsStringOptions
    - typings.sha1.mod.Sha1AsBytesOptions
  */
  trait Sha1Options extends StObject
  object Sha1Options {
    
    @scala.inline
    def Sha1AsBytesOptions(asBytes: `true`): typings.sha1.mod.Sha1AsBytesOptions = {
      val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sha1.mod.Sha1AsBytesOptions]
    }
    
    @scala.inline
    def Sha1AsStringOptions(): typings.sha1.mod.Sha1AsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.sha1.mod.Sha1AsStringOptions]
    }
  }
}
