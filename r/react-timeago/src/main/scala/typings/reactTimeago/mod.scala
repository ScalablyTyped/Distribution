package typings.reactTimeago

import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  class ^[T /* <: ComponentType[js.Object] */] ()
    extends Component[ReactTimeagoProps[T] & ComponentProps[T], js.Object, js.Any]
  
  type Formatter = js.Function5[
    /* value */ Double, 
    /* unit */ Unit, 
    /* suffix */ Suffix, 
    /* epochMiliseconds */ Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    ReactNode
  ]
  
  type ReactTimeago[T /* <: ComponentType[js.Object] */] = Component[ReactTimeagoProps[T] & ComponentProps[T], js.Object, js.Any]
  
  trait ReactTimeagoProps[T /* <: ComponentType[js.Object] */] extends StObject {
    
    val component: js.UndefOr[String | T] = js.undefined
    
    val date: String | Double | Date
    
    val formatter: js.UndefOr[Formatter] = js.undefined
    
    val live: js.UndefOr[Boolean] = js.undefined
    
    val maxPeriod: js.UndefOr[Double] = js.undefined
    
    val minPeriod: js.UndefOr[Double] = js.undefined
    
    val now: js.UndefOr[js.Function0[Double]] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
  }
  object ReactTimeagoProps {
    
    inline def apply[T /* <: ComponentType[js.Object] */](date: String | Double | Date): ReactTimeagoProps[T] = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTimeagoProps[T]]
    }
    
    extension [Self <: ReactTimeagoProps[?], T /* <: ComponentType[js.Object] */](x: Self & ReactTimeagoProps[T]) {
      
      inline def setComponent(value: String | T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDate(value: String | Double | Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFormatter(
        value: (/* value */ Double, /* unit */ Unit, /* suffix */ Suffix, /* epochMiliseconds */ Double, /* nextFormatter */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
            ]) => ReactNode
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
      
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
