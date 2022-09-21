package typings.reactTruncate

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactTruncate.reactTruncateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-truncate", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TruncateProps, js.Object, Any]
  
  type Truncate = Component[TruncateProps, js.Object, Any]
  
  trait TruncateProps
    extends StObject
       with HTMLProps[Truncate] {
    
    var ellipsis: js.UndefOr[ReactNode] = js.undefined
    
    var lines: js.UndefOr[Double | `false`] = js.undefined
    
    var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.undefined
    
    var trimWhitespace: js.UndefOr[Boolean] = js.undefined
  }
  object TruncateProps {
    
    inline def apply(): TruncateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncateProps]
    }
    
    extension [Self <: TruncateProps](x: Self) {
      
      inline def setEllipsis(value: ReactNode): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setLines(value: Double | `false`): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setOnTruncate(value: /* isTruncated */ Boolean => Unit): Self = StObject.set(x, "onTruncate", js.Any.fromFunction1(value))
      
      inline def setOnTruncateUndefined: Self = StObject.set(x, "onTruncate", js.undefined)
      
      inline def setTrimWhitespace(value: Boolean): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
      
      inline def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    }
  }
}
