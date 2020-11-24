package typings.reactDataGrid.global

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AdazzleReactDataGrid")
@js.native
object AdazzleReactDataGrid extends js.Object {
  
  @js.native
  class ReactDataGrid[T] ()
    extends typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid[T]
  @js.native
  object ReactDataGrid extends js.Object {
    
    @js.native
    class Cell ()
      extends Component[js.Any, js.Object, js.Any]
    
    @js.native
    class Row ()
      extends Component[js.Any, js.Object, js.Any]
    
    @js.native
    object editors extends js.Object {
      
      @js.native
      class EditorBase[P, S] ()
        extends typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[P, S]
    }
  }
  
  @js.native
  object SCROLL_DIRECTION extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION with String] = js.native
    
    /* "downwards" */ val DOWN: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.DOWN with String = js.native
    
    /* "left" */ val LEFT: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.LEFT with String = js.native
    
    /* "none" */ val NONE: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.NONE with String = js.native
    
    /* "right" */ val RIGHT: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.RIGHT with String = js.native
    
    /* "upwards" */ val UP: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.UP with String = js.native
  }
}
