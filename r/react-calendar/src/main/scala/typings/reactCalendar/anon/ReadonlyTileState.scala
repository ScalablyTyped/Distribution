package typings.reactCalendar.anon

import typings.react.mod.ReactNode
import typings.reactCalendar.distCjsSharedTypesMod.TileArgs
import typings.reactCalendar.distCjsSharedTypesMod.TileClassNameFunc
import typings.reactCalendar.distCjsSharedTypesMod.TileContentFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-calendar.react-calendar/dist/cjs/Tile.TileState> */
trait ReadonlyTileState extends StObject {
  
  val activeStartDateProps: js.UndefOr[js.Date] = js.undefined
  
  val tileClassName: js.UndefOr[typings.reactCalendar.distCjsSharedTypesMod.ClassName] = js.undefined
  
  val tileClassNameProps: js.UndefOr[TileClassNameFunc | typings.reactCalendar.distCjsSharedTypesMod.ClassName] = js.undefined
  
  val tileContent: js.UndefOr[ReactNode] = js.undefined
  
  val tileContentProps: js.UndefOr[TileContentFunc | ReactNode] = js.undefined
}
object ReadonlyTileState {
  
  inline def apply(): ReadonlyTileState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyTileState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyTileState] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDateProps(value: js.Date): Self = StObject.set(x, "activeStartDateProps", value.asInstanceOf[js.Any])
    
    inline def setActiveStartDatePropsUndefined: Self = StObject.set(x, "activeStartDateProps", js.undefined)
    
    inline def setTileClassName(value: typings.reactCalendar.distCjsSharedTypesMod.ClassName): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
    
    inline def setTileClassNameNull: Self = StObject.set(x, "tileClassName", null)
    
    inline def setTileClassNameProps(value: TileClassNameFunc | typings.reactCalendar.distCjsSharedTypesMod.ClassName): Self = StObject.set(x, "tileClassNameProps", value.asInstanceOf[js.Any])
    
    inline def setTileClassNamePropsFunction1(value: /* args */ TileArgs => typings.reactCalendar.distCjsSharedTypesMod.ClassName): Self = StObject.set(x, "tileClassNameProps", js.Any.fromFunction1(value))
    
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
