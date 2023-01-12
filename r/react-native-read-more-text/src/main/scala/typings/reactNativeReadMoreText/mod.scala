package typings.reactNativeReadMoreText

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReadMoreProps, js.Object, Any]
  
  type ReadMore = Component[ReadMoreProps, js.Object, Any]
  
  trait ReadMoreProps extends StObject {
    
    var children: ReactNode
    
    var numberOfLines: Double
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def renderRevealedFooter(onPress: js.Function0[Unit]): ReactNode
    
    def renderTruncatedFooter(onPress: js.Function0[Unit]): ReactNode
  }
  object ReadMoreProps {
    
    inline def apply(
      numberOfLines: Double,
      renderRevealedFooter: js.Function0[Unit] => ReactNode,
      renderTruncatedFooter: js.Function0[Unit] => ReactNode
    ): ReadMoreProps = {
      val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
      __obj.asInstanceOf[ReadMoreProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadMoreProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setRenderRevealedFooter(value: js.Function0[Unit] => ReactNode): Self = StObject.set(x, "renderRevealedFooter", js.Any.fromFunction1(value))
      
      inline def setRenderTruncatedFooter(value: js.Function0[Unit] => ReactNode): Self = StObject.set(x, "renderTruncatedFooter", js.Any.fromFunction1(value))
    }
  }
}
