package typings.seatsio

import org.scalablytyped.runtime.Shortcut
import typings.seatsio.Seatsio.ChartManagerConfig
import typings.seatsio.Seatsio.EventManagerConfig
import typings.seatsio.Seatsio.SeatingChartConfig
import typings.seatsio.Seatsio.SeatingChartDesignerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object seatsio extends Shortcut {
    
    @JSGlobal("seatsio")
    @js.native
    val ^ : Seatsio = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("seatsio.ChartManager")
    @js.native
    class ChartManager protected ()
      extends StObject
         with typings.seatsio.Seatsio.ChartManager {
      // tslint:disable-next-line:no-misused-new
      def this(config: ChartManagerConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("seatsio.EventManager")
    @js.native
    class EventManager protected ()
      extends StObject
         with typings.seatsio.Seatsio.EventManager {
      // tslint:disable-next-line:no-misused-new
      def this(config: EventManagerConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("seatsio.SeatingChart")
    @js.native
    class SeatingChart protected ()
      extends StObject
         with typings.seatsio.Seatsio.SeatingChart {
      // tslint:disable-next-line:no-misused-new
      def this(config: SeatingChartConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("seatsio.SeatingChartDesigner")
    @js.native
    class SeatingChartDesigner protected ()
      extends StObject
         with typings.seatsio.Seatsio.SeatingChartDesigner {
      // tslint:disable-next-line:no-misused-new
      def this(config: SeatingChartDesignerConfig) = this()
    }
    
    type _To = Seatsio
    
    /* This means you don't have to write `^`, but can instead just say `seatsio.foo` */
    override def _to: Seatsio = ^
  }
}
