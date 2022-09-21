package typings.reactDraggableList

import typings.react.mod.Component
import typings.reactDraggableList.anon.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exampleMod {
  
  @JSImport("react-draggable-list/dist/example/Example", JSImport.Default)
  @js.native
  open class default () extends Example
  
  @js.native
  trait Example
    extends Component[js.Object, ExampleState, Any] {
    
    /* private */ var _container: Any = js.native
    
    /* private */ var _onListChange: Any = js.native
    
    /* private */ var _toggleContainer: Any = js.native
    
    /* private */ var _togglePluto: Any = js.native
    
    @JSName("state")
    var state_Example: List = js.native
  }
  
  trait ExampleState extends StObject {
    
    var list: js.Array[PlanetListItem]
    
    var useContainer: Boolean
  }
  object ExampleState {
    
    inline def apply(list: js.Array[PlanetListItem], useContainer: Boolean): ExampleState = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], useContainer = useContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExampleState]
    }
    
    extension [Self <: ExampleState](x: Self) {
      
      inline def setList(value: js.Array[PlanetListItem]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: PlanetListItem*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setUseContainer(value: Boolean): Self = StObject.set(x, "useContainer", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlanetListItem extends StObject {
    
    var name: String
    
    var subtitle: js.UndefOr[Boolean] = js.undefined
  }
  object PlanetListItem {
    
    inline def apply(name: String): PlanetListItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlanetListItem]
    }
    
    extension [Self <: PlanetListItem](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: Boolean): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
}
