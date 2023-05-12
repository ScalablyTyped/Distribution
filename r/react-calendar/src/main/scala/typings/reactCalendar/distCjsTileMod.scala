package typings.reactCalendar

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactCalendar.anon.FormatAbbr
import typings.reactCalendar.anon.ReadonlyTileState
import typings.reactCalendar.distCjsSharedTypesMod.ClassName
import typings.reactCalendar.distCjsSharedTypesMod.TileArgs
import typings.reactCalendar.distCjsSharedTypesMod.TileClassNameFunc
import typings.reactCalendar.distCjsSharedTypesMod.TileContentFunc
import typings.reactCalendar.distCjsSharedTypesMod.TileDisabledFunc
import typings.reactCalendar.distCjsSharedTypesMod.View
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTileMod {
  
  @JSImport("react-calendar/dist/cjs/Tile", JSImport.Default)
  @js.native
  open class default () extends Tile
  /* static members */
  object default {
    
    @JSImport("react-calendar/dist/cjs/Tile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: TileProps, prevState: TileState): TileState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[TileState]
    
    @JSImport("react-calendar/dist/cjs/Tile", "default.propTypes")
    @js.native
    def propTypes: FormatAbbr = js.native
    inline def propTypes_=(x: FormatAbbr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tile extends Component[TileProps, TileState, Any] {
    
    @JSName("state")
    var state_Tile: ReadonlyTileState = js.native
  }
  
  trait TileProps extends StObject {
    
    var activeStartDate: js.Date
    
    var children: ReactNode
    
    var classes: js.UndefOr[ClassName] = js.undefined
    
    var date: js.Date
    
    var formatAbbr: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    def maxDateTransform(date: js.Date): js.Date
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    def minDateTransform(date: js.Date): js.Date
    
    def onClick(date: js.Date, event: MouseEvent[Element, NativeMouseEvent]): Unit
    
    def onMouseOver(date: js.Date): Unit
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tileClassName: js.UndefOr[TileClassNameFunc | ClassName] = js.undefined
    
    var tileContent: js.UndefOr[TileContentFunc | ReactNode] = js.undefined
    
    var tileDisabled: js.UndefOr[TileDisabledFunc] = js.undefined
    
    var view: View
  }
  object TileProps {
    
    inline def apply(
      activeStartDate: js.Date,
      date: js.Date,
      maxDateTransform: js.Date => js.Date,
      minDateTransform: js.Date => js.Date,
      onClick: (js.Date, MouseEvent[Element, NativeMouseEvent]) => Unit,
      onMouseOver: js.Date => Unit,
      view: View
    ): TileProps = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], maxDateTransform = js.Any.fromFunction1(maxDateTransform), minDateTransform = js.Any.fromFunction1(minDateTransform), onClick = js.Any.fromFunction2(onClick), onMouseOver = js.Any.fromFunction1(onMouseOver), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileProps] (val x: Self) extends AnyVal {
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClasses(value: ClassName): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesNull: Self = StObject.set(x, "classes", null)
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFormatAbbr(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatAbbr", js.Any.fromFunction2(value))
      
      inline def setFormatAbbrUndefined: Self = StObject.set(x, "formatAbbr", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateTransform(value: js.Date => js.Date): Self = StObject.set(x, "maxDateTransform", js.Any.fromFunction1(value))
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateTransform(value: js.Date => js.Date): Self = StObject.set(x, "minDateTransform", js.Any.fromFunction1(value))
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnClick(value: (js.Date, MouseEvent[Element, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnMouseOver(value: js.Date => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTileClassName(value: TileClassNameFunc | ClassName): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      inline def setTileClassNameFunction1(value: /* args */ TileArgs => ClassName): Self = StObject.set(x, "tileClassName", js.Any.fromFunction1(value))
      
      inline def setTileClassNameNull: Self = StObject.set(x, "tileClassName", null)
      
      inline def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      inline def setTileClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "tileClassName", js.Array(value*))
      
      inline def setTileContent(value: TileContentFunc | ReactNode): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentFunction1(value: /* args */ TileArgs => ReactNode): Self = StObject.set(x, "tileContent", js.Any.fromFunction1(value))
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      inline def setTileDisabled(value: /* args */ TileArgs => Boolean): Self = StObject.set(x, "tileDisabled", js.Any.fromFunction1(value))
      
      inline def setTileDisabledUndefined: Self = StObject.set(x, "tileDisabled", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait TileState extends StObject {
    
    var activeStartDateProps: js.UndefOr[js.Date] = js.undefined
    
    var tileClassName: js.UndefOr[ClassName] = js.undefined
    
    var tileClassNameProps: js.UndefOr[TileClassNameFunc | ClassName] = js.undefined
    
    var tileContent: js.UndefOr[ReactNode] = js.undefined
    
    var tileContentProps: js.UndefOr[TileContentFunc | ReactNode] = js.undefined
  }
  object TileState {
    
    inline def apply(): TileState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileState] (val x: Self) extends AnyVal {
      
      inline def setActiveStartDateProps(value: js.Date): Self = StObject.set(x, "activeStartDateProps", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDatePropsUndefined: Self = StObject.set(x, "activeStartDateProps", js.undefined)
      
      inline def setTileClassName(value: ClassName): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      inline def setTileClassNameNull: Self = StObject.set(x, "tileClassName", null)
      
      inline def setTileClassNameProps(value: TileClassNameFunc | ClassName): Self = StObject.set(x, "tileClassNameProps", value.asInstanceOf[js.Any])
      
      inline def setTileClassNamePropsFunction1(value: /* args */ TileArgs => ClassName): Self = StObject.set(x, "tileClassNameProps", js.Any.fromFunction1(value))
      
      inline def setTileClassNamePropsNull: Self = StObject.set(x, "tileClassNameProps", null)
      
      inline def setTileClassNamePropsUndefined: Self = StObject.set(x, "tileClassNameProps", js.undefined)
      
      inline def setTileClassNamePropsVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "tileClassNameProps", js.Array(value*))
      
      inline def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      inline def setTileClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "tileClassName", js.Array(value*))
      
      inline def setTileContent(value: ReactNode): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentProps(value: TileContentFunc | ReactNode): Self = StObject.set(x, "tileContentProps", value.asInstanceOf[js.Any])
      
      inline def setTileContentPropsFunction1(value: /* args */ TileArgs => ReactNode): Self = StObject.set(x, "tileContentProps", js.Any.fromFunction1(value))
      
      inline def setTileContentPropsUndefined: Self = StObject.set(x, "tileContentProps", js.undefined)
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
    }
  }
}
