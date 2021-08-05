package typings.reactMovable

import typings.reactMovable.anon.Canceled
import typings.reactMovable.listMod.default
import typings.reactMovable.typesMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-movable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-movable", "List")
  @js.native
  class List[Value] protected () extends default[Value] {
    def this(props: IProps[Value]) = this()
  }
  object List {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-movable", "List.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-movable", "List.defaultProps.lockVertically")
      @js.native
      def lockVertically: Boolean = js.native
      inline def lockVertically_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lockVertically")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable", "List.defaultProps.removableByMove")
      @js.native
      def removableByMove: Boolean = js.native
      inline def removableByMove_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable", "List.defaultProps.transitionDuration")
      @js.native
      def transitionDuration: Double = js.native
      inline def transitionDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable", "List.defaultProps.voiceover")
      @js.native
      def voiceover: Canceled = js.native
      inline def voiceover_=(x: Canceled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("voiceover")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
