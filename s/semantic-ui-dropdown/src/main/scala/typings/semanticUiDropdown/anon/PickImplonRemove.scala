package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onRemove'> */
trait PickImplonRemove extends StObject {
  
  def onRemove(removedValue: js.Any, removedText: String, $removedChoice: JQuery): Unit
  @JSName("onRemove")
  var onRemove_Original: js.ThisFunction3[
    /* this */ JQuery, 
    /* removedValue */ js.Any, 
    /* removedText */ String, 
    /* $removedChoice */ JQuery, 
    Unit
  ]
}
object PickImplonRemove {
  
  @scala.inline
  def apply(
    onRemove: js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ): PickImplonRemove = {
    val __obj = js.Dynamic.literal(onRemove = onRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRemove]
  }
  
  @scala.inline
  implicit class PickImplonRemoveMutableBuilder[Self <: PickImplonRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRemove(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* removedValue */ js.Any, 
          /* removedText */ String, 
          /* $removedChoice */ JQuery, 
          Unit
        ]
    ): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
  }
}
