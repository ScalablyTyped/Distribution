package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTemplateOverrides extends StObject {
  
  /** Defines templates for rendering the field on a display form. */
  var DisplayForm: js.UndefOr[FieldInFormCallback] = js.undefined
  
  /** Defines templates for rendering the field on an edit form. */
  var EditForm: js.UndefOr[FieldInFormCallback] = js.undefined
  
  /** Defines templates for rendering the field on a new form. */
  var NewForm: js.UndefOr[FieldInFormCallback] = js.undefined
  
  /** Defines templates for rendering the field on a list view. */
  var View: js.UndefOr[FieldInViewCallback] = js.undefined
}
object FieldTemplateOverrides {
  
  inline def apply(): FieldTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldTemplateOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldTemplateOverrides] (val x: Self) extends AnyVal {
    
    inline def setDisplayForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = StObject.set(x, "DisplayForm", js.Any.fromFunction1(value))
    
    inline def setDisplayFormUndefined: Self = StObject.set(x, "DisplayForm", js.undefined)
    
    inline def setEditForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = StObject.set(x, "EditForm", js.Any.fromFunction1(value))
    
    inline def setEditFormUndefined: Self = StObject.set(x, "EditForm", js.undefined)
    
    inline def setNewForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = StObject.set(x, "NewForm", js.Any.fromFunction1(value))
    
    inline def setNewFormUndefined: Self = StObject.set(x, "NewForm", js.undefined)
    
    inline def setView(value: /* renderContext */ RenderContextFieldInView => String): Self = StObject.set(x, "View", js.Any.fromFunction1(value))
    
    inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
