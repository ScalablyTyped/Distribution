package typings.seleniumWebdriver

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolsMod extends Shortcut {
  
  @JSImport("selenium-webdriver/lib/symbols", JSImport.Default)
  @js.native
  val default: ISymbols = js.native
  
  trait ISymbols extends StObject {
    
    /**
      * The serialize symbol specifies a method that returns an object's serialized
      * representation. If an object's serialized form is not immediately
      * available, the serialize method will return a promise that will be resolved
      * with the serialized form.
      *
      * Note that the described method is analogous to objects that define a
      * `toJSON()` method, except the serialized result may be a promise, or
      * another object with a promised property.
      */
    val serialize: js.Symbol
  }
  object ISymbols {
    
    @scala.inline
    def apply(serialize: js.Symbol): ISymbols = {
      val __obj = js.Dynamic.literal(serialize = serialize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISymbols]
    }
    
    @scala.inline
    implicit class ISymbolsMutableBuilder[Self <: ISymbols] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSerialize(value: js.Symbol): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ISymbols
  
  /* This means you don't have to write `default`, but can instead just say `symbolsMod.foo` */
  override def _to: ISymbols = default
}
