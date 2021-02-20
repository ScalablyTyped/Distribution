package typings.reactTimeago

import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  class ^[T /* <: ComponentType[js.Object] */] ()
    extends Component[ReactTimeagoProps[T] with ComponentProps[T], js.Object, js.Any]
  
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
  
  type ReactTimeago[T /* <: ComponentType[js.Object] */] = Component[ReactTimeagoProps[T] with ComponentProps[T], js.Object, js.Any]
  
  @js.native
  trait ReactTimeagoProps[T /* <: ComponentType[js.Object] */] extends StObject {
    
    val component: js.UndefOr[String | T] = js.native
    
    val date: String | Double | Date = js.native
    
    val formatter: js.UndefOr[Formatter] = js.native
    
    val live: js.UndefOr[Boolean] = js.native
    
    val maxPeriod: js.UndefOr[Double] = js.native
    
    val minPeriod: js.UndefOr[Double] = js.native
    
    val now: js.UndefOr[js.Function0[Double]] = js.native
    
    val title: js.UndefOr[String] = js.native
  }
  object ReactTimeagoProps {
    
    @scala.inline
    def apply[T /* <: ComponentType[js.Object] */](date: String | Double | Date): ReactTimeagoProps[T] = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTimeagoProps[T]]
    }
    
    @scala.inline
    implicit class ReactTimeagoPropsMutableBuilder[Self <: ReactTimeagoProps[_], T /* <: ComponentType[js.Object] */] (val x: Self with ReactTimeagoProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String | T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDate(value: String | Double | Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(
        value: (/* value */ Double, /* unit */ Unit, /* suffix */ Suffix, /* epochMiliseconds */ Double, /* nextFormatter */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
            ]) => ReactNode
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      @scala.inline
      def setMaxPeriod(value: Double): Self = StObject.set(x, "maxPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPeriodUndefined: Self = StObject.set(x, "maxPeriod", js.undefined)
      
      @scala.inline
      def setMinPeriod(value: Double): Self = StObject.set(x, "minPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPeriodUndefined: Self = StObject.set(x, "minPeriod", js.undefined)
      
      @scala.inline
      def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTimeago.reactTimeagoStrings.ago
    - typings.reactTimeago.reactTimeagoStrings.`from now`
  */
  trait Suffix extends StObject
  object Suffix {
    
    @scala.inline
    def ago: typings.reactTimeago.reactTimeagoStrings.ago = "ago".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.ago]
    
    @scala.inline
    def `from now`: typings.reactTimeago.reactTimeagoStrings.`from now` = ("from now").asInstanceOf[typings.reactTimeago.reactTimeagoStrings.`from now`]
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
    
    @scala.inline
    def day: typings.reactTimeago.reactTimeagoStrings.day = "day".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.day]
    
    @scala.inline
    def hour: typings.reactTimeago.reactTimeagoStrings.hour = "hour".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.hour]
    
    @scala.inline
    def minute: typings.reactTimeago.reactTimeagoStrings.minute = "minute".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.minute]
    
    @scala.inline
    def month: typings.reactTimeago.reactTimeagoStrings.month = "month".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.month]
    
    @scala.inline
    def second: typings.reactTimeago.reactTimeagoStrings.second = "second".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.second]
    
    @scala.inline
    def week: typings.reactTimeago.reactTimeagoStrings.week = "week".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.week]
    
    @scala.inline
    def year: typings.reactTimeago.reactTimeagoStrings.year = "year".asInstanceOf[typings.reactTimeago.reactTimeagoStrings.year]
  }
}
