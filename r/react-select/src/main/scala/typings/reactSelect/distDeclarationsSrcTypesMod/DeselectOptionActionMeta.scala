package typings.reactSelect.distDeclarationsSrcTypesMod

import typings.reactSelect.reactSelectStrings.`deselect-option`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeselectOptionActionMeta[Option]
  extends StObject
     with ActionMetaBase[Option]
     with ActionMeta[Option] {
  
  var action: `deselect-option`
}
object DeselectOptionActionMeta {
  
  inline def apply[Option](): DeselectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "deselect-option")
    __obj.asInstanceOf[DeselectOptionActionMeta[Option]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeselectOptionActionMeta[?], Option] (val x: Self & DeselectOptionActionMeta[Option]) extends AnyVal {
    
    inline def setAction(value: `deselect-option`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
