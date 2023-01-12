package typings.reactPieMenu

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactPieMenu.anon.Context
import typings.reactPieMenu.anon.ItemId
import typings.std.Event
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-pie-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-pie-menu", "PieCenter")
  @js.native
  val PieCenter: ComponentType[PieCenterProps] = js.native
  
  @JSImport("react-pie-menu", "PieMenu")
  @js.native
  val PieMenu: ComponentType[PieMenuProps] = js.native
  
  @JSImport("react-pie-menu", "Slice")
  @js.native
  val Slice: ComponentType[SliceProps] = js.native
  
  @JSImport("react-pie-menu", "centerRadius")
  @js.native
  val centerRadius: ThemeContextSelector[Double] = js.native
  
  @JSImport("react-pie-menu", "centralAngle")
  @js.native
  val centralAngle: ThemeContextSelector[Double] = js.native
  
  @JSImport("react-pie-menu", "endAngle")
  @js.native
  val endAngle: ThemeContextSelector[Double] = js.native
  
  inline def ifObtuse(value: Any, _default: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ifObtuse")(value.asInstanceOf[js.Any], _default.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("react-pie-menu", "polar")
  @js.native
  val polar: ThemeContextSelector[Boolean] = js.native
  
  @JSImport("react-pie-menu", "radius")
  @js.native
  val radius: ThemeContextSelector[Double] = js.native
  
  @JSImport("react-pie-menu", "skew")
  @js.native
  val skew: ThemeContextSelector[Double] = js.native
  
  @JSImport("react-pie-menu", "startAngle")
  @js.native
  val startAngle: ThemeContextSelector[Double] = js.native
  
  type Callback = js.Function1[/* _event */ SyntheticEvent[Any, Event], Any]
  
  trait ContextSelectorProps[T] extends StObject {
    
    var theme: Context[T]
  }
  object ContextSelectorProps {
    
    inline def apply[T](theme: Context[T]): ContextSelectorProps[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSelectorProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextSelectorProps[?], T] (val x: Self & ContextSelectorProps[T]) extends AnyVal {
      
      inline def setTheme(value: Context[T]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var centerRadiusPx: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var radiusPx: js.UndefOr[Double] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setCenterRadiusPx(value: Double): Self = StObject.set(x, "centerRadiusPx", value.asInstanceOf[js.Any])
      
      inline def setCenterRadiusPxUndefined: Self = StObject.set(x, "centerRadiusPx", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRadiusPx(value: Double): Self = StObject.set(x, "radiusPx", value.asInstanceOf[js.Any])
      
      inline def setRadiusPxUndefined: Self = StObject.set(x, "radiusPx", js.undefined)
    }
  }
  
  trait PieCenterProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[Callback] = js.undefined
  }
  object PieCenterProps {
    
    inline def apply(): PieCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieCenterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieCenterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnClick(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait PieMenuProps
    extends StObject
       with SliceContext
       with Metadata {
    
    var Center: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var attrs: js.UndefOr[Record[String, Any]] = js.undefined
    
    var children: ReactNode
    
    var slices: js.UndefOr[ItemId] = js.undefined
    
    var startOffsetAngle: js.UndefOr[Double] = js.undefined
  }
  object PieMenuProps {
    
    inline def apply(): PieMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieMenuProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieMenuProps] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setCenter(value: ComponentType[Any]): Self = StObject.set(x, "Center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "Center", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSlices(value: ItemId): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
      
      inline def setStartOffsetAngle(value: Double): Self = StObject.set(x, "startOffsetAngle", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetAngleUndefined: Self = StObject.set(x, "startOffsetAngle", js.undefined)
    }
  }
  
  trait SliceContext extends StObject {
    
    var centerRadius: js.UndefOr[String] = js.undefined
    
    var centralAngle: js.UndefOr[Double] = js.undefined
    
    var polar: js.UndefOr[Boolean] = js.undefined
    
    var radius: js.UndefOr[String] = js.undefined
  }
  object SliceContext {
    
    inline def apply(): SliceContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliceContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliceContext] (val x: Self) extends AnyVal {
      
      inline def setCenterRadius(value: String): Self = StObject.set(x, "centerRadius", value.asInstanceOf[js.Any])
      
      inline def setCenterRadiusUndefined: Self = StObject.set(x, "centerRadius", js.undefined)
      
      inline def setCentralAngle(value: Double): Self = StObject.set(x, "centralAngle", value.asInstanceOf[js.Any])
      
      inline def setCentralAngleUndefined: Self = StObject.set(x, "centralAngle", js.undefined)
      
      inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
      
      inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
      
      inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait SliceProps
    extends StObject
       with SliceContext {
    
    var as: js.UndefOr[Any] = js.undefined
    
    var attrs: js.UndefOr[Record[String, Any]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentHeight: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[Callback] = js.undefined
    
    var onFocus: js.UndefOr[Callback] = js.undefined
    
    var onKeyDown: js.UndefOr[Callback] = js.undefined
    
    var onMouseEnter: js.UndefOr[Callback] = js.undefined
    
    var onMouseOut: js.UndefOr[Callback] = js.undefined
    
    var onMouseOver: js.UndefOr[Callback] = js.undefined
    
    var onSelect: js.UndefOr[Callback] = js.undefined
  }
  object SliceProps {
    
    inline def apply(): SliceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliceProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentHeight(value: String): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setOnBlur(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseOut(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnSelect(value: /* _event */ SyntheticEvent[Any, Event] => Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
  
  type ThemeContextSelector[T] = js.Function1[/* props */ ContextSelectorProps[T], T]
}
