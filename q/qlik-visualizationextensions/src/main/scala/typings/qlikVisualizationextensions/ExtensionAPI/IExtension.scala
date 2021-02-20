package typings.qlikVisualizationextensions.ExtensionAPI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExtension extends StObject {
  
  var controller: js.UndefOr[js.Any] = js.native
  
  var definition: js.UndefOr[IDefinition] = js.native
  
  var initialProperties: js.UndefOr[IInitialProperties] = js.native
  
  var paint: js.UndefOr[js.Function2[/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any], Unit]] = js.native
  
  var support: js.UndefOr[ISupport] = js.native
  
  var template: js.UndefOr[String] = js.native
}
object IExtension {
  
  @scala.inline
  def apply(): IExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExtension]
  }
  
  @scala.inline
  implicit class IExtensionMutableBuilder[Self <: IExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setDefinition(value: IDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setInitialProperties(value: IInitialProperties): Self = StObject.set(x, "initialProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPropertiesUndefined: Self = StObject.set(x, "initialProperties", js.undefined)
    
    @scala.inline
    def setPaint(value: (/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "paint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setSupport(value: ISupport): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
