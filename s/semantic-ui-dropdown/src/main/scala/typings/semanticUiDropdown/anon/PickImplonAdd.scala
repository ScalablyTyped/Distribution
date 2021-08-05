package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onAdd'> */
trait PickImplonAdd extends StObject {
  
  def onAdd(addedValue: js.Any, addedText: String, $addedChoice: JQuery): Unit
  @JSName("onAdd")
  var onAdd_Original: js.ThisFunction3[
    /* this */ JQuery, 
    /* addedValue */ js.Any, 
    /* addedText */ String, 
    /* $addedChoice */ JQuery, 
    Unit
  ]
}
object PickImplonAdd {
  
  inline def apply(
    onAdd: js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ): PickImplonAdd = {
    val __obj = js.Dynamic.literal(onAdd = onAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonAdd]
  }
  
  extension [Self <: PickImplonAdd](x: Self) {
    
    inline def setOnAdd(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* addedValue */ js.Any, 
          /* addedText */ String, 
          /* $addedChoice */ JQuery, 
          Unit
        ]
    ): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
  }
}
