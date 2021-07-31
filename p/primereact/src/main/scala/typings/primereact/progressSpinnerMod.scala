package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressSpinnerMod {
  
  @JSImport("primereact/components/progressspinner/ProgressSpinner", "ProgressSpinner")
  @js.native
  class ProgressSpinner protected ()
    extends Component[ProgressSpinnerProps, js.Any, js.Any] {
    def this(props: ProgressSpinnerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProgressSpinnerProps, context: js.Any) = this()
  }
  
  trait ProgressSpinnerProps extends StObject {
    
    var animationDuration: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ProgressSpinnerProps {
    
    @scala.inline
    def apply(): ProgressSpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressSpinnerProps]
    }
    
    @scala.inline
    implicit class ProgressSpinnerPropsMutableBuilder[Self <: ProgressSpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
