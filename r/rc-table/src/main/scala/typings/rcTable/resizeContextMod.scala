package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/ResizeContext", JSImport.Default)
  @js.native
  val default: Context[ResizeContextProps] = js.native
  
  @js.native
  trait ResizeContextProps extends StObject {
    
    def onColumnResize(columnKey: Key, width: Double): Unit = js.native
  }
  object ResizeContextProps {
    
    @scala.inline
    def apply(onColumnResize: (Key, Double) => Unit): ResizeContextProps = {
      val __obj = js.Dynamic.literal(onColumnResize = js.Any.fromFunction2(onColumnResize))
      __obj.asInstanceOf[ResizeContextProps]
    }
    
    @scala.inline
    implicit class ResizeContextPropsMutableBuilder[Self <: ResizeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
    }
  }
  
  type _To = Context[ResizeContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `resizeContextMod.foo` */
  override def _to: Context[ResizeContextProps] = default
}
