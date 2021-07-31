package typings.reactNativeDraggableFlatlist

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.VirtualizedListWithoutRenderItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-draggable-flatlist", JSImport.Default)
  @js.native
  class default[Item] protected ()
    extends Component[DraggableFlatListProps[Item], js.Object, js.Any] {
    def this(props: DraggableFlatListProps[Item]) = this()
  }
  
  type DraggableFlatList[Item] = Component[DraggableFlatListProps[Item], js.Object, js.Any]
  
  trait DraggableFlatListProps[Item]
    extends StObject
       with VirtualizedListWithoutRenderItemProps[Item] {
    
    /**
      * Items to be rendered.
      */
    @JSName("data")
    var data_DraggableFlatListProps: js.Array[Item] | Null
    
    /**
      * Function that is called when row becomes active.
      */
    var onMoveBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    /**
      *  Function that returns updated ordering of data
      */
    var onMoveEnd: js.UndefOr[js.Function1[/* info */ OnMoveEndInfo[Item], Unit]] = js.undefined
    
    /**
      * Function that calls move when the row should become active (in an onPress, onLongPress, etc). Calls moveEnd when the gesture is complete (in onPressOut).
      */
    def renderItem(info: RenderItemInfo[Item]): ReactElement | Null
    
    /**
      * Sets where scrolling begins.
      *
      * Default is 5
      */
    var scrollPercent: js.UndefOr[Double] = js.undefined
  }
  object DraggableFlatListProps {
    
    @scala.inline
    def apply[Item](renderItem: RenderItemInfo[Item] => ReactElement | Null): DraggableFlatListProps[Item] = {
      val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem), data = null)
      __obj.asInstanceOf[DraggableFlatListProps[Item]]
    }
    
    @scala.inline
    implicit class DraggableFlatListPropsMutableBuilder[Self <: DraggableFlatListProps[?], Item] (val x: Self & DraggableFlatListProps[Item]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Item]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataVarargs(value: Item*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setOnMoveBegin(value: /* index */ Double => Unit): Self = StObject.set(x, "onMoveBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveBeginUndefined: Self = StObject.set(x, "onMoveBegin", js.undefined)
      
      @scala.inline
      def setOnMoveEnd(value: /* info */ OnMoveEndInfo[Item] => Unit): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
      
      @scala.inline
      def setRenderItem(value: RenderItemInfo[Item] => ReactElement | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollPercent(value: Double): Self = StObject.set(x, "scrollPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPercentUndefined: Self = StObject.set(x, "scrollPercent", js.undefined)
    }
  }
  
  trait OnMoveEndInfo[ItemM] extends StObject {
    
    var data: js.Array[ItemM] | Null
    
    var from: Double
    
    var row: ItemM
    
    var to: Double
  }
  object OnMoveEndInfo {
    
    @scala.inline
    def apply[ItemM](from: Double, row: ItemM, to: Double): OnMoveEndInfo[ItemM] = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[OnMoveEndInfo[ItemM]]
    }
    
    @scala.inline
    implicit class OnMoveEndInfoMutableBuilder[Self <: OnMoveEndInfo[?], ItemM] (val x: Self & OnMoveEndInfo[ItemM]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[ItemM]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataVarargs(value: ItemM*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: ItemM): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderItemInfo[ItemR] extends StObject {
    
    var index: Double
    
    var isActive: Boolean
    
    var item: ItemR
    
    def move(): Unit
    
    def moveEnd(): Unit
  }
  object RenderItemInfo {
    
    @scala.inline
    def apply[ItemR](index: Double, isActive: Boolean, item: ItemR, move: () => Unit, moveEnd: () => Unit): RenderItemInfo[ItemR] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], move = js.Any.fromFunction0(move), moveEnd = js.Any.fromFunction0(moveEnd))
      __obj.asInstanceOf[RenderItemInfo[ItemR]]
    }
    
    @scala.inline
    implicit class RenderItemInfoMutableBuilder[Self <: RenderItemInfo[?], ItemR] (val x: Self & RenderItemInfo[ItemR]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: ItemR): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMove(value: () => Unit): Self = StObject.set(x, "move", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoveEnd(value: () => Unit): Self = StObject.set(x, "moveEnd", js.Any.fromFunction0(value))
    }
  }
}
