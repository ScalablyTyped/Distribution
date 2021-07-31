package typings.primereact

import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsetMod {
  
  @JSImport("primereact/components/fieldset/Fieldset", "Fieldset")
  @js.native
  class Fieldset protected ()
    extends Component[FieldsetProps, js.Any, js.Any] {
    def this(props: FieldsetProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FieldsetProps, context: js.Any) = this()
  }
  
  trait FieldsetProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var legend: js.UndefOr[js.Any] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onExpand: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* e */ typings.primereact.anon.Event, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var toggleable: js.UndefOr[Boolean] = js.undefined
  }
  object FieldsetProps {
    
    @scala.inline
    def apply(): FieldsetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsetProps]
    }
    
    @scala.inline
    implicit class FieldsetPropsMutableBuilder[Self <: FieldsetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: /* event */ Event => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOnExpand(value: /* event */ Event => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* e */ typings.primereact.anon.Event => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToggleable(value: Boolean): Self = StObject.set(x, "toggleable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleableUndefined: Self = StObject.set(x, "toggleable", js.undefined)
    }
  }
}
