package typings.rcSlider

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMarksMod {
  
  @JSImport("rc-slider/lib/Marks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MarksProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait InternalMarkObj
    extends StObject
       with MarkObj {
    
    var value: Double
  }
  object InternalMarkObj {
    
    inline def apply(value: Double): InternalMarkObj = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalMarkObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalMarkObj] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkObj extends StObject {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object MarkObj {
    
    inline def apply(): MarkObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkObj] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait MarksProps extends StObject {
    
    var marks: js.UndefOr[js.Array[InternalMarkObj]] = js.undefined
    
    def onClick(value: Double): Unit
    
    var prefixCls: String
  }
  object MarksProps {
    
    inline def apply(onClick: Double => Unit, prefixCls: String): MarksProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarksProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarksProps] (val x: Self) extends AnyVal {
      
      inline def setMarks(value: js.Array[InternalMarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMarksVarargs(value: InternalMarkObj*): Self = StObject.set(x, "marks", js.Array(value*))
      
      inline def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
