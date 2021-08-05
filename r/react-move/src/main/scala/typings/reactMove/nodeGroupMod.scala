package typings.reactMove

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactMove.mod.GetInterpolator
import typings.reactMove.mod.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeGroupMod {
  
  @JSImport("react-move/NodeGroup", JSImport.Default)
  @js.native
  class default protected () extends INodeGroup {
    def this(props: INodeGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: INodeGroupProps, context: js.Any) = this()
  }
  
  @JSImport("react-move/NodeGroup", "INodeGroup")
  @js.native
  class INodeGroup protected ()
    extends Component[INodeGroupProps, js.Object, js.Any] {
    def this(props: INodeGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: INodeGroupProps, context: js.Any) = this()
  }
  
  trait INodeGroupProps extends StObject {
    
    def children(nodes: js.Array[js.Any]): ReactElement
    
    var data: js.Array[js.Any]
    
    var enter: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
    
    var interpolation: js.UndefOr[GetInterpolator] = js.undefined
    
    def keyAccessor(data: js.Any, index: Double): String | Double
    
    var leave: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
    
    def start(data: js.Any, index: Double): HashMap
    
    var update: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  }
  object INodeGroupProps {
    
    inline def apply(
      children: js.Array[js.Any] => ReactElement,
      data: js.Array[js.Any],
      keyAccessor: (js.Any, Double) => String | Double,
      start: (js.Any, Double) => HashMap
    ): INodeGroupProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
      __obj.asInstanceOf[INodeGroupProps]
    }
    
    extension [Self <: INodeGroupProps](x: Self) {
      
      inline def setChildren(value: js.Array[js.Any] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setEnter(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setInterpolation(
        value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
      ): Self = StObject.set(x, "interpolation", js.Any.fromFunction4(value))
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setKeyAccessor(value: (js.Any, Double) => String | Double): Self = StObject.set(x, "keyAccessor", js.Any.fromFunction2(value))
      
      inline def setLeave(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = StObject.set(x, "leave", js.Any.fromFunction2(value))
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setStart(value: (js.Any, Double) => HashMap): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
