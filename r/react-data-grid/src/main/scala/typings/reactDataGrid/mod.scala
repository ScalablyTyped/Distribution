package typings.reactDataGrid

import typings.react.mod.Component
import typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-data-grid", JSImport.Namespace)
  @js.native
  class ^[T] () extends ReactDataGrid[T]
  
  @JSImport("react-data-grid", "Cell")
  @js.native
  class Cell ()
    extends Component[js.Any, js.Object, js.Any]
  
  @JSImport("react-data-grid", "Row")
  @js.native
  class Row ()
    extends Component[js.Any, js.Object, js.Any]
  
  object editors {
    
    @JSImport("react-data-grid", "editors.EditorBase")
    @js.native
    class EditorBase[P, S] ()
      extends typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[P, S]
  }
}
