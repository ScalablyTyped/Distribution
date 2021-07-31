package typings.reactSvgMap

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-map", "CheckboxSVGMap")
  @js.native
  class CheckboxSVGMap protected ()
    extends Component[OnChangeMapProps, js.Object, js.Any] {
    def this(props: OnChangeMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnChangeMapProps, context: js.Any) = this()
  }
  
  @JSImport("react-svg-map", "RadioSVGMap")
  @js.native
  class RadioSVGMap protected ()
    extends Component[OnChangeMapProps, js.Object, js.Any] {
    def this(props: OnChangeMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnChangeMapProps, context: js.Any) = this()
  }
  
  @JSImport("react-svg-map", "SVGMap")
  @js.native
  val SVGMap: SFC[SVGMapProps] = js.native
  
  trait BaseMapProps extends StObject {
    
    var childrenAfter: js.UndefOr[ReactElement] = js.undefined
    
    var childrenBefore: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var locationClassName: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
    
    var map: Map
    
    var onLocationBlur: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onLocationFocus: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onLocationMouseMove: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onLocationMouseOut: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onLocationMouseOver: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object BaseMapProps {
    
    @scala.inline
    def apply(map: Map): BaseMapProps = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMapProps]
    }
    
    @scala.inline
    implicit class BaseMapPropsMutableBuilder[Self <: BaseMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenAfter(value: ReactElement): Self = StObject.set(x, "childrenAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenAfterUndefined: Self = StObject.set(x, "childrenAfter", js.undefined)
      
      @scala.inline
      def setChildrenBefore(value: ReactElement): Self = StObject.set(x, "childrenBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenBeforeUndefined: Self = StObject.set(x, "childrenBefore", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLocationClassName(value: String | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "locationClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationClassNameFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "locationClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocationClassNameUndefined: Self = StObject.set(x, "locationClassName", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLocationBlur(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationBlurUndefined: Self = StObject.set(x, "onLocationBlur", js.undefined)
      
      @scala.inline
      def setOnLocationFocus(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationFocusUndefined: Self = StObject.set(x, "onLocationFocus", js.undefined)
      
      @scala.inline
      def setOnLocationMouseMove(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationMouseMoveUndefined: Self = StObject.set(x, "onLocationMouseMove", js.undefined)
      
      @scala.inline
      def setOnLocationMouseOut(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationMouseOutUndefined: Self = StObject.set(x, "onLocationMouseOut", js.undefined)
      
      @scala.inline
      def setOnLocationMouseOver(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationMouseOverUndefined: Self = StObject.set(x, "onLocationMouseOver", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    var id: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object Location {
    
    @scala.inline
    def apply(id: String, path: String): Location = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Map extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var locations: js.Array[Location]
    
    var viewBox: String
  }
  object Map {
    
    @scala.inline
    def apply(locations: js.Array[Location], viewBox: String): Map = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnChangeMapProps
    extends StObject
       with BaseMapProps {
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object OnChangeMapProps {
    
    @scala.inline
    def apply(map: Map): OnChangeMapProps = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeMapProps]
    }
    
    @scala.inline
    implicit class OnChangeMapPropsMutableBuilder[Self <: OnChangeMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait SVGMapProps
    extends StObject
       with BaseMapProps {
    
    var isLocationSelected: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var locationRole: js.UndefOr[String] = js.undefined
    
    var locationTabIndex: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
    
    var onLocationClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onLocationKeyDown: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object SVGMapProps {
    
    @scala.inline
    def apply(map: Map): SVGMapProps = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGMapProps]
    }
    
    @scala.inline
    implicit class SVGMapPropsMutableBuilder[Self <: SVGMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLocationSelected(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "isLocationSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsLocationSelectedUndefined: Self = StObject.set(x, "isLocationSelected", js.undefined)
      
      @scala.inline
      def setLocationRole(value: String): Self = StObject.set(x, "locationRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationRoleUndefined: Self = StObject.set(x, "locationRole", js.undefined)
      
      @scala.inline
      def setLocationTabIndex(value: String | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "locationTabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationTabIndexFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "locationTabIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocationTabIndexUndefined: Self = StObject.set(x, "locationTabIndex", js.undefined)
      
      @scala.inline
      def setOnLocationClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationClickUndefined: Self = StObject.set(x, "onLocationClick", js.undefined)
      
      @scala.inline
      def setOnLocationKeyDown(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onLocationKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocationKeyDownUndefined: Self = StObject.set(x, "onLocationKeyDown", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
