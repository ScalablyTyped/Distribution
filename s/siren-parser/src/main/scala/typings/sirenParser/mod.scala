package typings.sirenParser

import typings.sirenParser.actionMod.Action
import typings.sirenParser.linkMod.Link
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("siren-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(entity: String): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any]).asInstanceOf[Entity]
  inline def default(entity: js.Object): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any]).asInstanceOf[Entity]
  
  @JSImport("siren-parser", "FieldType")
  @js.native
  object FieldType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sirenParser.fieldMod.FieldType & String] = js.native
    
    /* "checkbox" */ val Checkbox: typings.sirenParser.fieldMod.FieldType.Checkbox & String = js.native
    
    /* "color" */ val Color: typings.sirenParser.fieldMod.FieldType.Color & String = js.native
    
    /* "date" */ val Date: typings.sirenParser.fieldMod.FieldType.Date & String = js.native
    
    /* "datetime" */ val DateTime: typings.sirenParser.fieldMod.FieldType.DateTime & String = js.native
    
    /* "email" */ val Email: typings.sirenParser.fieldMod.FieldType.Email & String = js.native
    
    /* "file" */ val File: typings.sirenParser.fieldMod.FieldType.File & String = js.native
    
    /* "hidden" */ val Hidden: typings.sirenParser.fieldMod.FieldType.Hidden & String = js.native
    
    /* "datetime-local" */ val LocalDateTime: typings.sirenParser.fieldMod.FieldType.LocalDateTime & String = js.native
    
    /* "month" */ val Month: typings.sirenParser.fieldMod.FieldType.Month & String = js.native
    
    /* "number" */ val Number: typings.sirenParser.fieldMod.FieldType.Number & String = js.native
    
    /* "password" */ val Password: typings.sirenParser.fieldMod.FieldType.Password & String = js.native
    
    /* "radio" */ val Radio: typings.sirenParser.fieldMod.FieldType.Radio & String = js.native
    
    /* "range" */ val Range: typings.sirenParser.fieldMod.FieldType.Range & String = js.native
    
    /* "search" */ val Search: typings.sirenParser.fieldMod.FieldType.Search & String = js.native
    
    /* "tel" */ val Telephone: typings.sirenParser.fieldMod.FieldType.Telephone & String = js.native
    
    /* "text" */ val Text: typings.sirenParser.fieldMod.FieldType.Text & String = js.native
    
    /* "time" */ val Time: typings.sirenParser.fieldMod.FieldType.Time & String = js.native
    
    /* "url" */ val Url: typings.sirenParser.fieldMod.FieldType.Url & String = js.native
    
    /* "week" */ val Week: typings.sirenParser.fieldMod.FieldType.Week & String = js.native
  }
  
  object global {
    
    object D2L {
      
      object Hypermedia {
        
        object Siren {
          
          @JSGlobal("D2L.Hypermedia.Siren")
          @js.native
          val ^ : js.Any = js.native
          
          inline def Parse(siren: String): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(siren.asInstanceOf[js.Any]).asInstanceOf[Entity]
          inline def Parse(siren: js.Object): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(siren.asInstanceOf[js.Any]).asInstanceOf[Entity]
        }
      }
    }
  }
  
  @js.native
  trait Entity extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.native
    
    var `class`: js.UndefOr[js.Array[String]] = js.native
    
    var entities: js.UndefOr[js.Array[Entity]] = js.native
    
    def getAction(actionName: String): js.UndefOr[Action] = js.native
    def getAction(actionName: RegExp): js.UndefOr[Action] = js.native
    
    def getActionByClass(actionClass: String): js.UndefOr[Action] = js.native
    def getActionByClass(actionClass: RegExp): js.UndefOr[Action] = js.native
    
    def getActionByClasses(actionClasses: js.Array[String | RegExp]): js.UndefOr[Action] = js.native
    
    def getActionByMethod(actionMethod: String): js.UndefOr[Action] = js.native
    def getActionByMethod(actionMethod: RegExp): js.UndefOr[Action] = js.native
    
    def getActionByName(actionName: String): js.UndefOr[Action] = js.native
    def getActionByName(actionName: RegExp): js.UndefOr[Action] = js.native
    
    def getActionByType(actionType: String): js.UndefOr[Action] = js.native
    def getActionByType(actionType: RegExp): js.UndefOr[Action] = js.native
    
    def getActionsByClass(actionClass: String): js.Array[Action] = js.native
    def getActionsByClass(actionClass: RegExp): js.Array[Action] = js.native
    
    def getActionsByClasses(actionClasses: js.Array[String | RegExp]): js.Array[Action] = js.native
    
    def getActionsByMethod(actionMethod: String): js.Array[Action] = js.native
    def getActionsByMethod(actionMethod: RegExp): js.Array[Action] = js.native
    
    def getActionsByType(actionType: String): js.Array[Action] = js.native
    def getActionsByType(actionType: RegExp): js.Array[Action] = js.native
    
    def getLink(linkRel: String): js.UndefOr[Link] = js.native
    def getLink(linkRel: RegExp): js.UndefOr[Link] = js.native
    
    def getLinkByClass(linkClass: String): js.UndefOr[Link] = js.native
    def getLinkByClass(linkClass: RegExp): js.UndefOr[Link] = js.native
    
    def getLinkByClasses(linkClasses: js.Array[String | RegExp]): js.UndefOr[Link] = js.native
    
    def getLinkByRel(linkRel: String): js.UndefOr[Link] = js.native
    def getLinkByRel(linkRel: RegExp): js.UndefOr[Link] = js.native
    
    def getLinkByRels(linkRels: js.Array[String | RegExp]): js.UndefOr[Link] = js.native
    
    def getLinkByType(linkType: String): js.UndefOr[Link] = js.native
    def getLinkByType(linkType: RegExp): js.UndefOr[Link] = js.native
    
    def getLinks(linkRel: String): js.Array[Link] = js.native
    def getLinks(linkRel: RegExp): js.Array[Link] = js.native
    
    def getLinksByClass(linkClass: String): js.Array[Link] = js.native
    def getLinksByClass(linkClass: RegExp): js.Array[Link] = js.native
    
    def getLinksByClasses(linkClasses: js.Array[String | RegExp]): js.Array[Link] = js.native
    
    def getLinksByRel(linkRel: String): js.Array[Link] = js.native
    def getLinksByRel(linkRel: RegExp): js.Array[Link] = js.native
    
    def getLinksByRels(linkRels: js.Array[String | RegExp]): js.Array[Link] = js.native
    
    def getLinksByType(linkType: String): js.Array[Link] = js.native
    def getLinksByType(linkType: RegExp): js.Array[Link] = js.native
    
    def getSubEntities(entityRel: String): js.Array[Entity] = js.native
    def getSubEntities(entityRel: RegExp): js.Array[Entity] = js.native
    
    def getSubEntitiesByClass(entityClass: String): js.Array[Entity] = js.native
    def getSubEntitiesByClass(entityClass: RegExp): js.Array[Entity] = js.native
    
    def getSubEntitiesByClasses(entityClasses: js.Array[String | RegExp]): js.Array[Entity] = js.native
    
    def getSubEntitiesByRel(entityRel: String): js.Array[Entity] = js.native
    def getSubEntitiesByRel(entityRel: RegExp): js.Array[Entity] = js.native
    
    def getSubEntitiesByRels(entityRels: js.Array[String | RegExp]): js.Array[Entity] = js.native
    
    def getSubEntitiesByType(entityType: String): js.Array[Entity] = js.native
    def getSubEntitiesByType(entityType: RegExp): js.Array[Entity] = js.native
    
    def getSubEntity(entityRel: String): js.UndefOr[Entity] = js.native
    def getSubEntity(entityRel: RegExp): js.UndefOr[Entity] = js.native
    
    def getSubEntityByClass(entityClass: String): js.UndefOr[Entity] = js.native
    def getSubEntityByClass(entityClass: RegExp): js.UndefOr[Entity] = js.native
    
    def getSubEntityByClasses(entityClasses: js.Array[String | RegExp]): js.UndefOr[Entity] = js.native
    
    def getSubEntityByRel(entityRel: String): js.UndefOr[Entity] = js.native
    def getSubEntityByRel(entityRel: RegExp): js.UndefOr[Entity] = js.native
    
    def getSubEntityByRels(entityRels: js.Array[String | RegExp]): js.UndefOr[Entity] = js.native
    
    def getSubEntityByType(entityType: String): js.UndefOr[Entity] = js.native
    def getSubEntityByType(entityType: RegExp): js.UndefOr[Entity] = js.native
    
    def hasAction(actionName: String): Boolean = js.native
    def hasAction(actionName: RegExp): Boolean = js.native
    
    def hasActionByClass(actionClass: String): Boolean = js.native
    def hasActionByClass(actionClass: RegExp): Boolean = js.native
    
    def hasActionByMethod(actionMethod: String): Boolean = js.native
    def hasActionByMethod(actionMethod: RegExp): Boolean = js.native
    
    def hasActionByName(actionName: String): Boolean = js.native
    def hasActionByName(actionName: RegExp): Boolean = js.native
    
    def hasActionByType(actionType: String): Boolean = js.native
    def hasActionByType(actionType: RegExp): Boolean = js.native
    
    def hasClass(cls: String): Boolean = js.native
    def hasClass(cls: RegExp): Boolean = js.native
    
    def hasEntity(entityRel: String): Boolean = js.native
    def hasEntity(entityRel: RegExp): Boolean = js.native
    
    def hasEntityByClass(entityClass: String): Boolean = js.native
    def hasEntityByClass(entityClass: RegExp): Boolean = js.native
    
    def hasEntityByRel(entityRel: String): Boolean = js.native
    def hasEntityByRel(entityRel: RegExp): Boolean = js.native
    
    def hasEntityByType(entityType: String): Boolean = js.native
    def hasEntityByType(entityType: RegExp): Boolean = js.native
    
    def hasLink(linkRel: String): Boolean = js.native
    def hasLink(linkRel: RegExp): Boolean = js.native
    
    def hasLinkByClass(linkClass: String): Boolean = js.native
    def hasLinkByClass(linkClass: RegExp): Boolean = js.native
    
    def hasLinkByRel(linkRel: String): Boolean = js.native
    def hasLinkByRel(linkRel: RegExp): Boolean = js.native
    
    def hasLinkByType(linkType: String): Boolean = js.native
    def hasLinkByType(linkType: RegExp): Boolean = js.native
    
    def hasProperty(property: String): Boolean = js.native
    def hasProperty(property: RegExp): Boolean = js.native
    
    def hasSubEntityByClass(entityClass: String): Boolean = js.native
    def hasSubEntityByClass(entityClass: RegExp): Boolean = js.native
    
    def hasSubEntityByRel(entityRel: String): Boolean = js.native
    def hasSubEntityByRel(entityRel: RegExp): Boolean = js.native
    
    def hasSubEntityByType(entityType: String): Boolean = js.native
    def hasSubEntityByType(entityType: RegExp): Boolean = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var links: js.UndefOr[js.Array[Link]] = js.native
    
    var properties: js.UndefOr[js.Object] = js.native
    
    // embedded link properties
    var rel: js.UndefOr[js.Array[String]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
}
