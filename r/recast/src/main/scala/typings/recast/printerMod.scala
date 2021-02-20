package typings.recast

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("recast/lib/printer", "Printer")
  @js.native
  class Printer () extends PrinterType {
    def this(config: js.Any) = this()
  }
  @JSImport("recast/lib/printer", "Printer")
  @js.native
  val Printer: PrinterConstructor = js.native
  
  @js.native
  trait PrintResultType extends StObject {
    
    var code: String = js.native
    
    var map: js.UndefOr[js.Any] = js.native
  }
  object PrintResultType {
    
    @scala.inline
    def apply(code: String): PrintResultType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintResultType]
    }
    
    @scala.inline
    implicit class PrintResultTypeMutableBuilder[Self <: PrintResultType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  @js.native
  trait PrinterConstructor
    extends Instantiable0[PrinterType]
       with Instantiable1[/* config */ js.Any, PrinterType]
  
  @js.native
  trait PrinterType extends StObject {
    
    def print(ast: js.Any): PrintResultType = js.native
    
    def printGenerically(ast: js.Any): PrintResultType = js.native
  }
  object PrinterType {
    
    @scala.inline
    def apply(print: js.Any => PrintResultType, printGenerically: js.Any => PrintResultType): PrinterType = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction1(print), printGenerically = js.Any.fromFunction1(printGenerically))
      __obj.asInstanceOf[PrinterType]
    }
    
    @scala.inline
    implicit class PrinterTypeMutableBuilder[Self <: PrinterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrint(value: js.Any => PrintResultType): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrintGenerically(value: js.Any => PrintResultType): Self = StObject.set(x, "printGenerically", js.Any.fromFunction1(value))
    }
  }
}
