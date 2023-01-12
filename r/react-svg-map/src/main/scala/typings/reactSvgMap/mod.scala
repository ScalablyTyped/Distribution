package typings.reactSvgMap

import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-map", "CheckboxSVGMap")
  @js.native
  open class CheckboxSVGMap protected ()
    extends Component[OnChangeMapProps, js.Object, Any] {
    def this(props: OnChangeMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnChangeMapProps, context: Any) = this()
  }
  
  @JSImport("react-svg-map", "RadioSVGMap")
  @js.native
  open class RadioSVGMap protected ()
    extends Component[OnChangeMapProps, js.Object, Any] {
    def this(props: OnChangeMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnChangeMapProps, context: Any) = this()
  }
  
  @JSImport("react-svg-map", "SVGMap")
  @js.native
  val SVGMap: FC[SVGMapProps] = js.native
  
  trait BaseMapProps extends StObject {
    
    var childrenAfter: js.UndefOr[ReactElement] = js.undefined
    
    var childrenBefore: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var locationClassName: js.UndefOr[String | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var map: Map
    
    var onLocationBlur: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onLocationFocus: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onLocationMouseMove: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onLocationMouseOut: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onLocationMouseOver: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object BaseMapProps {
    
    inline def apply(map: Map): BaseMapProps = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMapProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseMapProps] (val x: Self) extends AnyVal {
      
      inline def setChildrenAfter(value: ReactElement): Self = StObject.set(x, "childrenAfter", value.asInstanceOf[js.Any])
      
      inline def setChildrenAfterUndefined: Self = StObject.set(x, "childrenAfter", js.undefined)
      
      inline def setChildrenBefore(value: ReactElement): Self = StObject.set(x, "childrenBefore", value.asInstanceOf[js.Any])
      
      inline def setChildrenBeforeUndefined: Self = StObject.set(x, "childrenBefore", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLocationClassName(value: String | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "locationClassName", value.asInstanceOf[js.Any])
      
      inline def setLocationClassNameFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "locationClassName", js.Any.fromFunction1(value))
      
      inline def setLocationClassNameUndefined: Self = StObject.set(x, "locationClassName", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOnLocationBlur(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationBlur", js.Any.fromFunction1(value))
      
      inline def setOnLocationBlurUndefined: Self = StObject.set(x, "onLocationBlur", js.undefined)
      
      inline def setOnLocationFocus(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationFocus", js.Any.fromFunction1(value))
      
      inline def setOnLocationFocusUndefined: Self = StObject.set(x, "onLocationFocus", js.undefined)
      
      inline def setOnLocationMouseMove(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnLocationMouseMoveUndefined: Self = StObject.set(x, "onLocationMouseMove", js.undefined)
      
      inline def setOnLocationMouseOut(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnLocationMouseOutUndefined: Self = StObject.set(x, "onLocationMouseOut", js.undefined)
      
      inline def setOnLocationMouseOver(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnLocationMouseOverUndefined: Self = StObject.set(x, "onLocationMouseOver", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    var id: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object Location {
    
    inline def apply(id: String, path: String): Location = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Map extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var locations: js.Array[Location]
    
    var viewBox: String
  }
  object Map {
    
    inline def apply(locations: js.Array[Location], viewBox: String): Map = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnChangeMapProps
    extends StObject
       with BaseMapProps {
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object OnChangeMapProps {
    
    inline def apply(map: Map): OnChangeMapProps = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeMapProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangeMapProps] (val x: Self) extends AnyVal {
      
      inline def setOnChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait SVGMapProps
    extends StObject
       with BaseMapProps {
    
    var isLocationSelected: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var locationRole: js.UndefOr[String] = js.undefined
    
    var locationTabIndex: js.UndefOr[String | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var onLocationClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onLocationKeyDown: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object SVGMapProps {
    
    inline def apply(map: Map): SVGMapProps = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGMapProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SVGMapProps] (val x: Self) extends AnyVal {
      
      inline def setIsLocationSelected(value: /* repeated */ Any => Any): Self = StObject.set(x, "isLocationSelected", js.Any.fromFunction1(value))
      
      inline def setIsLocationSelectedUndefined: Self = StObject.set(x, "isLocationSelected", js.undefined)
      
      inline def setLocationRole(value: String): Self = StObject.set(x, "locationRole", value.asInstanceOf[js.Any])
      
      inline def setLocationRoleUndefined: Self = StObject.set(x, "locationRole", js.undefined)
      
      inline def setLocationTabIndex(value: String | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "locationTabIndex", value.asInstanceOf[js.Any])
      
      inline def setLocationTabIndexFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "locationTabIndex", js.Any.fromFunction1(value))
      
      inline def setLocationTabIndexUndefined: Self = StObject.set(x, "locationTabIndex", js.undefined)
      
      inline def setOnLocationClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationClick", js.Any.fromFunction1(value))
      
      inline def setOnLocationClickUndefined: Self = StObject.set(x, "onLocationClick", js.undefined)
      
      inline def setOnLocationKeyDown(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLocationKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnLocationKeyDownUndefined: Self = StObject.set(x, "onLocationKeyDown", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
