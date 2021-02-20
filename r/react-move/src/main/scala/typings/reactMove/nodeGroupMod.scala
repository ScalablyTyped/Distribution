package typings.reactMove

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactMove.mod.GetInterpolator
import typings.reactMove.mod.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait INodeGroupProps extends StObject {
    
    def children(nodes: js.Array[_]): ReactElement = js.native
    
    var data: js.Array[_] = js.native
    
    var enter: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
    
    var interpolation: js.UndefOr[GetInterpolator] = js.native
    
    def keyAccessor(data: js.Any, index: Double): String | Double = js.native
    
    var leave: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
    
    def start(data: js.Any, index: Double): HashMap = js.native
    
    var update: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
  }
  object INodeGroupProps {
    
    @scala.inline
    def apply(
      children: js.Array[_] => ReactElement,
      data: js.Array[_],
      keyAccessor: (js.Any, Double) => String | Double,
      start: (js.Any, Double) => HashMap
    ): INodeGroupProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
      __obj.asInstanceOf[INodeGroupProps]
    }
    
    @scala.inline
    implicit class INodeGroupPropsMutableBuilder[Self <: INodeGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[_] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEnter(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setInterpolation(
        value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
      ): Self = StObject.set(x, "interpolation", js.Any.fromFunction4(value))
      
      @scala.inline
      def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      @scala.inline
      def setKeyAccessor(value: (js.Any, Double) => String | Double): Self = StObject.set(x, "keyAccessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeave(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = StObject.set(x, "leave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      @scala.inline
      def setStart(value: (js.Any, Double) => HashMap): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
