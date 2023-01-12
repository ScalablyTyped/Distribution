package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOverrides extends StObject {
  
  // TODO: determine appropriate context type and purpose of this template
  var Body: js.UndefOr[RenderCallback | String] = js.undefined
  
  /** Defines templates for fields rendering. The field is specified by it's internal name. */
  var Fields: js.UndefOr[FieldTemplateMap] = js.undefined
  
  /** Defines template for rendering list view footer.
    Can be either string or SingleTemplateCallback */
  var Footer: js.UndefOr[SingleTemplateCallback | String] = js.undefined
  
  // TODO: determine appropriate context type and purpose of this template
  /** Defines templates for rendering groups (aggregations). */
  var Group: js.UndefOr[GroupCallback | String] = js.undefined
  
  /** Defines template for rendering list view header.
    Can be either string or SingleTemplateCallback */
  var Header: js.UndefOr[SingleTemplateCallback | String] = js.undefined
  
  /** Defines templates for list items rendering. */
  var Item: js.UndefOr[ItemCallback | String] = js.undefined
  
  var View: js.UndefOr[RenderCallback | String] = js.undefined
}
object TemplateOverrides {
  
  inline def apply(): TemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateOverrides] (val x: Self) extends AnyVal {
    
    inline def setBody(value: RenderCallback | String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setFields(value: FieldTemplateMap): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setFooter(value: SingleTemplateCallback | String): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction1(value: /* renderContext */ RenderContextInView => String): Self = StObject.set(x, "Footer", js.Any.fromFunction1(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
    
    inline def setGroup(value: GroupCallback | String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupFunction1(value: /* renderContext */ RenderContextGroupInView => String): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setHeader(value: SingleTemplateCallback | String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderFunction1(value: /* renderContext */ RenderContextInView => String): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setItem(value: ItemCallback | String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemFunction1(value: /* renderContext */ RenderContext => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setView(value: RenderCallback | String): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "View", js.Any.fromFunction1(value))
    
    inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
