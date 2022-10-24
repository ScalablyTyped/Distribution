package typings.rcPicker

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsHeaderMod {
  
  @JSImport("rc-picker/es/panels/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: HeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HeaderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var nextIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** Next one step */
    var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Last one step */
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Next multiple steps */
    var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Last multiple steps */
    var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: String
    
    var prevIcon: js.UndefOr[ReactNode] = js.undefined
    
    var superNextIcon: js.UndefOr[ReactNode] = js.undefined
    
    var superPrevIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(prefixCls: String): HeaderProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNextIcon(value: ReactNode): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
      
      inline def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      inline def setOnSuperNext(value: () => Unit): Self = StObject.set(x, "onSuperNext", js.Any.fromFunction0(value))
      
      inline def setOnSuperNextUndefined: Self = StObject.set(x, "onSuperNext", js.undefined)
      
      inline def setOnSuperPrev(value: () => Unit): Self = StObject.set(x, "onSuperPrev", js.Any.fromFunction0(value))
      
      inline def setOnSuperPrevUndefined: Self = StObject.set(x, "onSuperPrev", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrevIcon(value: ReactNode): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setSuperNextIcon(value: ReactNode): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      inline def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      inline def setSuperPrevIcon(value: ReactNode): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      inline def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
    }
  }
}
