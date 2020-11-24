package typings.qlikVisualizationextensions.ExtensionAPI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExtension extends js.Object {
  
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
  implicit class IExtensionOps[Self <: IExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setDefinition(value: IDefinition): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setInitialProperties(value: IInitialProperties): Self = this.set("initialProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialProperties: Self = this.set("initialProperties", js.undefined)
    
    @scala.inline
    def setPaint(value: (/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any]) => Unit): Self = this.set("paint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePaint: Self = this.set("paint", js.undefined)
    
    @scala.inline
    def setSupport(value: ISupport): Self = this.set("support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupport: Self = this.set("support", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
