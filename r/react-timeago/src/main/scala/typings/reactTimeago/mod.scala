package typings.reactTimeago

import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  open class ^[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.react.mod.ComponentType[js.Object], typings.reactTimeago.reactTimeagoStrings.a, typings.reactTimeago.reactTimeagoStrings.abbr */ Any */] ()
    extends Component[ReactTimeagoProps[T] & ComponentProps[T], js.Object, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Formatter = (value : number, unit : react-timeago.react-timeago.Unit, suffix : react-timeago.react-timeago.Suffix, epochMiliseconds : number, nextFormatter : react-timeago.react-timeago.Formatter | undefined): react.react.ReactNode
  }}}
  to avoid circular code involving: 
  - react-timeago.react-timeago.Formatter
  */
  @js.native
  trait Formatter extends StObject {
    
    def apply(value: Double, unit: Unit, suffix: Suffix, epochMiliseconds: Double): ReactNode = js.native
    def apply(value: Double, unit: Unit, suffix: Suffix, epochMiliseconds: Double, nextFormatter: Formatter): ReactNode = js.native
  }
  
  type ReactTimeago[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.react.mod.ComponentType[js.Object], typings.reactTimeago.reactTimeagoStrings.a, typings.reactTimeago.reactTimeagoStrings.abbr */ Any */] = Component[ReactTimeagoProps[T] & ComponentProps[T], js.Object, Any]
  
  trait ReactTimeagoProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.react.mod.ComponentType[js.Object], typings.reactTimeago.reactTimeagoStrings.a, typings.reactTimeago.reactTimeagoStrings.abbr */ Any */] extends StObject {
    
    val component: js.UndefOr[T] = js.undefined
    
    val date: String | Double | js.Date
    
    val formatter: js.UndefOr[Formatter] = js.undefined
    
    val live: js.UndefOr[Boolean] = js.undefined
    
    val maxPeriod: js.UndefOr[Double] = js.undefined
    
    val minPeriod: js.UndefOr[Double] = js.undefined
    
    val now: js.UndefOr[js.Function0[Double]] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
  }
  object ReactTimeagoProps {
    
    inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.react.mod.ComponentType[js.Object], typings.reactTimeago.reactTimeagoStrings.a, typings.reactTimeago.reactTimeagoStrings.abbr */ Any */](date: String | Double | js.Date): ReactTimeagoProps[T] = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTimeagoProps[T]]
    }
    
    extension [Self <: ReactTimeagoProps[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.react.mod.ComponentType[js.Object], typings.reactTimeago.reactTimeagoStrings.a, typings.reactTimeago.reactTimeagoStrings.abbr */ Any */](x: Self & ReactTimeagoProps[T]) {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDate(value: String | Double | js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      inline def setMaxPeriod(value: Double): Self = StObject.set(x, "maxPeriod", value.asInstanceOf[js.Any])
      
      inline def setMaxPeriodUndefined: Self = StObject.set(x, "maxPeriod", js.undefined)
      
      inline def setMinPeriod(value: Double): Self = StObject.set(x, "minPeriod", value.asInstanceOf[js.Any])
      
      inline def setMinPeriodUndefined: Self = StObject.set(x, "minPeriod", js.undefined)
      
      inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTimeago.reactTimeagoStrings.ago
    - typings.reactTimeago.reactTimeagoStrings.`from now`
  */
  trait Suffix extends StObject
  object Suffix {
    
    inline def ago: typings.reactTimeago.reactTimeagoStrings.ago = "ago".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.ago]
    
    inline def `from now`: typings.reactTimeago.reactTimeagoStrings.`from now` = ("from now").asInstanceOf[typings.reactTimeago.reactTimeagoStrings.`from now`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTimeago.reactTimeagoStrings.second
    - typings.reactTimeago.reactTimeagoStrings.minute
    - typings.reactTimeago.reactTimeagoStrings.hour
    - typings.reactTimeago.reactTimeagoStrings.day
    - typings.reactTimeago.reactTimeagoStrings.week
    - typings.reactTimeago.reactTimeagoStrings.month
    - typings.reactTimeago.reactTimeagoStrings.year
  */
  trait Unit extends StObject
  object Unit {
    
    inline def day: typings.reactTimeago.reactTimeagoStrings.day = "day".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.day]
    
    inline def hour: typings.reactTimeago.reactTimeagoStrings.hour = "hour".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.hour]
    
    inline def minute: typings.reactTimeago.reactTimeagoStrings.minute = "minute".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.minute]
    
    inline def month: typings.reactTimeago.reactTimeagoStrings.month = "month".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.month]
    
    inline def second: typings.reactTimeago.reactTimeagoStrings.second = "second".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.second]
    
    inline def week: typings.reactTimeago.reactTimeagoStrings.week = "week".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.week]
    
    inline def year: typings.reactTimeago.reactTimeagoStrings.year = "year".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.year]
  }
}
