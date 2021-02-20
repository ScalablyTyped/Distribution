package typings.reactTruncate

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactTruncate.reactTruncateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-truncate", JSImport.Default)
  @js.native
  class default ()
    extends Component[TruncateProps, js.Object, js.Any]
  
  @js.native
  trait Truncate
    extends Component[TruncateProps, js.Object, js.Any]
  
  @js.native
  trait TruncateProps extends HTMLProps[Truncate] {
    
    var ellipsis: js.UndefOr[ReactNode] = js.native
    
    var lines: js.UndefOr[Double | `false`] = js.native
    
    var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.native
    
    var trimWhitespace: js.UndefOr[Boolean] = js.native
  }
  object TruncateProps {
    
    @scala.inline
    def apply(): TruncateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncateProps]
    }
    
    @scala.inline
    implicit class TruncatePropsMutableBuilder[Self <: TruncateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsis(value: ReactNode): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setLines(value: Double | `false`): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setOnTruncate(value: /* isTruncated */ Boolean => Unit): Self = StObject.set(x, "onTruncate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTruncateUndefined: Self = StObject.set(x, "onTruncate", js.undefined)
      
      @scala.inline
      def setTrimWhitespace(value: Boolean): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    }
  }
}
