package typings.sirenParser

import typings.sirenParser.fieldMod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("siren-parser/Action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(action: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(action.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  @JSImport("siren-parser/Action", "FieldType")
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
  
  @js.native
  trait Action extends StObject {
    
    var `class`: js.UndefOr[js.Array[String]] = js.native
    
    var fields: js.UndefOr[js.Array[Field]] = js.native
    
    def getField(fieldName: String): js.UndefOr[Field] = js.native
    def getField(fieldName: js.RegExp): js.UndefOr[Field] = js.native
    
    def getFieldByClass(fieldClass: String): js.UndefOr[Field] = js.native
    def getFieldByClass(fieldClass: js.RegExp): js.UndefOr[Field] = js.native
    
    def getFieldByClasses(fieldClasses: js.Array[String | js.RegExp]): js.UndefOr[Field] = js.native
    
    def getFieldByName(fieldName: String): js.UndefOr[Field] = js.native
    def getFieldByName(fieldName: js.RegExp): js.UndefOr[Field] = js.native
    
    def getFieldByType(fieldType: String): js.UndefOr[Field] = js.native
    def getFieldByType(fieldType: js.RegExp): js.UndefOr[Field] = js.native
    
    def getFieldsByClass(fieldClass: String): js.Array[Field] = js.native
    def getFieldsByClass(fieldClass: js.RegExp): js.Array[Field] = js.native
    
    def getFieldsByClasses(fieldClasses: js.Array[String | js.RegExp]): js.Array[Field] = js.native
    
    def getFieldsByType(fieldType: String): js.Array[Field] = js.native
    def getFieldsByType(fieldType: js.RegExp): js.Array[Field] = js.native
    
    def hasClass(cls: String): Boolean = js.native
    def hasClass(cls: js.RegExp): Boolean = js.native
    
    def hasField(fieldName: String): Boolean = js.native
    def hasField(fieldName: js.RegExp): Boolean = js.native
    
    def hasFieldByClass(fieldClass: String): Boolean = js.native
    def hasFieldByClass(fieldClass: js.RegExp): Boolean = js.native
    
    def hasFieldByName(fieldName: String): Boolean = js.native
    def hasFieldByName(fieldName: js.RegExp): Boolean = js.native
    
    def hasFieldByType(fieldType: String): Boolean = js.native
    def hasFieldByType(fieldType: js.RegExp): Boolean = js.native
    
    var href: String = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
}
