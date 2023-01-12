package typings.reactBootstrapDaterangepicker

import typings.daterangepicker.mod.DateOrString
import typings.daterangepicker.mod.Options
import typings.daterangepicker.mod.global.JQuery
import typings.jquery.JQuery.Event
import typings.react.mod.Component
import typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-daterangepicker", JSImport.Default)
  @js.native
  open class default protected () extends DateRangePicker {
    def this(props: Props) = this()
  }
  
  @JSImport("react-bootstrap-daterangepicker", "DateRangePicker")
  @js.native
  open class DateRangePicker protected ()
    extends Component[PropsWithChildren[Props], js.Object, Any] {
    def this(props: Props) = this()
    
    @JSName("$picker")
    var $picker: JQuery | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDateRangePicker(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDateRangePicker(): Unit = js.native
    
    def handleCallback(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit = js.native
    
    def makeEventHandler(eventType: String): js.Function2[
        /* event */ Event, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any, 
        Unit
      ] = js.native
    
    var ref: Any = js.native
    
    def setEndDate(dateOrString: DateOrString): Unit = js.native
    
    def setStartDate(dateOrString: DateOrString): Unit = js.native
  }
  
  type CallbackHandler = js.Function3[
    /* start */ js.UndefOr[DateOrString], 
    /* end */ js.UndefOr[DateOrString], 
    /* label */ js.UndefOr[String], 
    Any
  ]
  
  type EventHandler = js.Function2[
    /* event */ Event, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any, 
    Any
  ]
  
  trait Props extends StObject {
    
    var initialSettings: js.UndefOr[Options] = js.undefined
    
    var onApply: js.UndefOr[EventHandler] = js.undefined
    
    var onCallback: js.UndefOr[CallbackHandler] = js.undefined
    
    var onCancel: js.UndefOr[EventHandler] = js.undefined
    
    var onEvent: js.UndefOr[EventHandler] = js.undefined
    
    var onHide: js.UndefOr[EventHandler] = js.undefined
    
    var onHideCalendar: js.UndefOr[EventHandler] = js.undefined
    
    var onShow: js.UndefOr[EventHandler] = js.undefined
    
    var onShowCalendar: js.UndefOr[EventHandler] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setInitialSettings(value: Options): Self = StObject.set(x, "initialSettings", value.asInstanceOf[js.Any])
      
      inline def setInitialSettingsUndefined: Self = StObject.set(x, "initialSettings", js.undefined)
      
      inline def setOnApply(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onApply", js.Any.fromFunction2(value))
      
      inline def setOnApplyUndefined: Self = StObject.set(x, "onApply", js.undefined)
      
      inline def setOnCallback(
        value: (/* start */ js.UndefOr[DateOrString], /* end */ js.UndefOr[DateOrString], /* label */ js.UndefOr[String]) => Any
      ): Self = StObject.set(x, "onCallback", js.Any.fromFunction3(value))
      
      inline def setOnCallbackUndefined: Self = StObject.set(x, "onCallback", js.undefined)
      
      inline def setOnCancel(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnEvent(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
      
      inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      inline def setOnHide(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      inline def setOnHideCalendar(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onHideCalendar", js.Any.fromFunction2(value))
      
      inline def setOnHideCalendarUndefined: Self = StObject.set(x, "onHideCalendar", js.undefined)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      inline def setOnShowCalendar(
        value: (/* event */ Event, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify daterangepicker */ /* picker */ Any) => Any
      ): Self = StObject.set(x, "onShowCalendar", js.Any.fromFunction2(value))
      
      inline def setOnShowCalendarUndefined: Self = StObject.set(x, "onShowCalendar", js.undefined)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    }
  }
}
