package typings.sirenParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  trait Assertion extends StObject {
    
    def classes(classes: String*): Unit
    
    def href(href: String): Unit
    
    def method(method: String): Unit
    
    def name(name: String): Unit
    
    def rels(rels: String*): Unit
    
    def title(title: String): Unit
    
    def `type`(`type`: String): Unit
    
    def value(value: Any): Unit
  }
  object Assertion {
    
    inline def apply(
      classes: /* repeated */ String => Unit,
      href: String => Unit,
      method: String => Unit,
      name: String => Unit,
      rels: /* repeated */ String => Unit,
      title: String => Unit,
      `type`: String => Unit,
      value: Any => Unit
    ): Assertion = {
      val __obj = js.Dynamic.literal(classes = js.Any.fromFunction1(classes), href = js.Any.fromFunction1(href), method = js.Any.fromFunction1(method), name = js.Any.fromFunction1(name), rels = js.Any.fromFunction1(rels), title = js.Any.fromFunction1(title), value = js.Any.fromFunction1(value))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Assertion]
    }
    
    extension [Self <: Assertion](x: Self) {
      
      inline def setClasses(value: /* repeated */ String => Unit): Self = StObject.set(x, "classes", js.Any.fromFunction1(value))
      
      inline def setHref(value: String => Unit): Self = StObject.set(x, "href", js.Any.fromFunction1(value))
      
      inline def setMethod(value: String => Unit): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setName(value: String => Unit): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      inline def setRels(value: /* repeated */ String => Unit): Self = StObject.set(x, "rels", js.Any.fromFunction1(value))
      
      inline def setTitle(value: String => Unit): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setType(value: String => Unit): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setValue(value: Any => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  trait KeyFilter extends StObject {
    
    var `with`: Assertion
  }
  object KeyFilter {
    
    inline def apply(`with`: Assertion): KeyFilter = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyFilter]
    }
    
    extension [Self <: KeyFilter](x: Self) {
      
      inline def setWith(value: Assertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeComparison extends StObject {
    
    var sirenAction: Assertion
    
    var sirenActions: Assertion
    
    var sirenEntities: Assertion
    
    var sirenEntity: Assertion
    
    var sirenField: Assertion
    
    var sirenFields: Assertion
    
    var sirenLink: Assertion
    
    var sirenLinks: Assertion
    
    var sirenProperties: Assertion
    
    var sirenProperty: Assertion
  }
  object TypeComparison {
    
    inline def apply(
      sirenAction: Assertion,
      sirenActions: Assertion,
      sirenEntities: Assertion,
      sirenEntity: Assertion,
      sirenField: Assertion,
      sirenFields: Assertion,
      sirenLink: Assertion,
      sirenLinks: Assertion,
      sirenProperties: Assertion,
      sirenProperty: Assertion
    ): TypeComparison = {
      val __obj = js.Dynamic.literal(sirenAction = sirenAction.asInstanceOf[js.Any], sirenActions = sirenActions.asInstanceOf[js.Any], sirenEntities = sirenEntities.asInstanceOf[js.Any], sirenEntity = sirenEntity.asInstanceOf[js.Any], sirenField = sirenField.asInstanceOf[js.Any], sirenFields = sirenFields.asInstanceOf[js.Any], sirenLink = sirenLink.asInstanceOf[js.Any], sirenLinks = sirenLinks.asInstanceOf[js.Any], sirenProperties = sirenProperties.asInstanceOf[js.Any], sirenProperty = sirenProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeComparison]
    }
    
    extension [Self <: TypeComparison](x: Self) {
      
      inline def setSirenAction(value: Assertion): Self = StObject.set(x, "sirenAction", value.asInstanceOf[js.Any])
      
      inline def setSirenActions(value: Assertion): Self = StObject.set(x, "sirenActions", value.asInstanceOf[js.Any])
      
      inline def setSirenEntities(value: Assertion): Self = StObject.set(x, "sirenEntities", value.asInstanceOf[js.Any])
      
      inline def setSirenEntity(value: Assertion): Self = StObject.set(x, "sirenEntity", value.asInstanceOf[js.Any])
      
      inline def setSirenField(value: Assertion): Self = StObject.set(x, "sirenField", value.asInstanceOf[js.Any])
      
      inline def setSirenFields(value: Assertion): Self = StObject.set(x, "sirenFields", value.asInstanceOf[js.Any])
      
      inline def setSirenLink(value: Assertion): Self = StObject.set(x, "sirenLink", value.asInstanceOf[js.Any])
      
      inline def setSirenLinks(value: Assertion): Self = StObject.set(x, "sirenLinks", value.asInstanceOf[js.Any])
      
      inline def setSirenProperties(value: Assertion): Self = StObject.set(x, "sirenProperties", value.asInstanceOf[js.Any])
      
      inline def setSirenProperty(value: Assertion): Self = StObject.set(x, "sirenProperty", value.asInstanceOf[js.Any])
    }
  }
}
