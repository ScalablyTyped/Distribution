package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPClientTemplates.FieldSchema
import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPMgr extends StObject {
  
  def NewGroup(listItem: StringDictionary[Any], fieldName: String): Boolean
  
  def RenderField(
    renderCtx: RenderContext,
    field: FieldSchema,
    listItem: StringDictionary[Any],
    listSchema: ListSchema
  ): String
  
  def RenderFieldByName(
    renderCtx: RenderContext,
    fieldName: String,
    listItem: StringDictionary[Any],
    listSchema: ListSchema
  ): String
  
  def RenderHeader(renderCtx: RenderContext, field: FieldSchema): String
}
object SPMgr {
  
  inline def apply(
    NewGroup: (StringDictionary[Any], String) => Boolean,
    RenderField: (RenderContext, FieldSchema, StringDictionary[Any], ListSchema) => String,
    RenderFieldByName: (RenderContext, String, StringDictionary[Any], ListSchema) => String,
    RenderHeader: (RenderContext, FieldSchema) => String
  ): SPMgr = {
    val __obj = js.Dynamic.literal(NewGroup = js.Any.fromFunction2(NewGroup), RenderField = js.Any.fromFunction4(RenderField), RenderFieldByName = js.Any.fromFunction4(RenderFieldByName), RenderHeader = js.Any.fromFunction2(RenderHeader))
    __obj.asInstanceOf[SPMgr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SPMgr] (val x: Self) extends AnyVal {
    
    inline def setNewGroup(value: (StringDictionary[Any], String) => Boolean): Self = StObject.set(x, "NewGroup", js.Any.fromFunction2(value))
    
    inline def setRenderField(value: (RenderContext, FieldSchema, StringDictionary[Any], ListSchema) => String): Self = StObject.set(x, "RenderField", js.Any.fromFunction4(value))
    
    inline def setRenderFieldByName(value: (RenderContext, String, StringDictionary[Any], ListSchema) => String): Self = StObject.set(x, "RenderFieldByName", js.Any.fromFunction4(value))
    
    inline def setRenderHeader(value: (RenderContext, FieldSchema) => String): Self = StObject.set(x, "RenderHeader", js.Any.fromFunction2(value))
  }
}
