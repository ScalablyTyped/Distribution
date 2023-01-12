package typings.reactSizeReporter

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactSizeReporter.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-size-reporter", JSImport.Default)
  @js.native
  val default: FC[Children] = js.native
  
  type ReactSizeReporter = FC[Children]
  
  trait ReactSizeReporterRef extends StObject {
    
    // Use this if for any reason onSizeChange doesn't trigger anymore.
    def reattachResizeListener(): Unit
  }
  object ReactSizeReporterRef {
    
    inline def apply(reattachResizeListener: () => Unit): ReactSizeReporterRef = {
      val __obj = js.Dynamic.literal(reattachResizeListener = js.Any.fromFunction0(reattachResizeListener))
      __obj.asInstanceOf[ReactSizeReporterRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactSizeReporterRef] (val x: Self) extends AnyVal {
      
      inline def setReattachResizeListener(value: () => Unit): Self = StObject.set(x, "reattachResizeListener", js.Any.fromFunction0(value))
    }
  }
  
  type _To = FC[Children]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[Children] = default
}
