package typings.sirenParser

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @JSImport("siren-parser/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(field: js.Object): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(field.asInstanceOf[js.Any]).asInstanceOf[Field]
  
  @js.native
  sealed trait FieldType extends StObject
  @JSImport("siren-parser/Field", "FieldType")
  @js.native
  object FieldType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldType & String] = js.native
    
    @js.native
    sealed trait Checkbox
      extends StObject
         with FieldType
    /* "checkbox" */ val Checkbox: typings.sirenParser.fieldMod.FieldType.Checkbox & String = js.native
    
    @js.native
    sealed trait Color
      extends StObject
         with FieldType
    /* "color" */ val Color: typings.sirenParser.fieldMod.FieldType.Color & String = js.native
    
    @js.native
    sealed trait Date
      extends StObject
         with FieldType
    /* "date" */ val Date: typings.sirenParser.fieldMod.FieldType.Date & String = js.native
    
    @js.native
    sealed trait DateTime
      extends StObject
         with FieldType
    /* "datetime" */ val DateTime: typings.sirenParser.fieldMod.FieldType.DateTime & String = js.native
    
    @js.native
    sealed trait Email
      extends StObject
         with FieldType
    /* "email" */ val Email: typings.sirenParser.fieldMod.FieldType.Email & String = js.native
    
    @js.native
    sealed trait File
      extends StObject
         with FieldType
    /* "file" */ val File: typings.sirenParser.fieldMod.FieldType.File & String = js.native
    
    @js.native
    sealed trait Hidden
      extends StObject
         with FieldType
    /* "hidden" */ val Hidden: typings.sirenParser.fieldMod.FieldType.Hidden & String = js.native
    
    @js.native
    sealed trait LocalDateTime
      extends StObject
         with FieldType
    /* "datetime-local" */ val LocalDateTime: typings.sirenParser.fieldMod.FieldType.LocalDateTime & String = js.native
    
    @js.native
    sealed trait Month
      extends StObject
         with FieldType
    /* "month" */ val Month: typings.sirenParser.fieldMod.FieldType.Month & String = js.native
    
    @js.native
    sealed trait Number
      extends StObject
         with FieldType
    /* "number" */ val Number: typings.sirenParser.fieldMod.FieldType.Number & String = js.native
    
    @js.native
    sealed trait Password
      extends StObject
         with FieldType
    /* "password" */ val Password: typings.sirenParser.fieldMod.FieldType.Password & String = js.native
    
    @js.native
    sealed trait Radio
      extends StObject
         with FieldType
    /* "radio" */ val Radio: typings.sirenParser.fieldMod.FieldType.Radio & String = js.native
    
    @js.native
    sealed trait Range
      extends StObject
         with FieldType
    /* "range" */ val Range: typings.sirenParser.fieldMod.FieldType.Range & String = js.native
    
    @js.native
    sealed trait Search
      extends StObject
         with FieldType
    /* "search" */ val Search: typings.sirenParser.fieldMod.FieldType.Search & String = js.native
    
    @js.native
    sealed trait Telephone
      extends StObject
         with FieldType
    /* "tel" */ val Telephone: typings.sirenParser.fieldMod.FieldType.Telephone & String = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with FieldType
    /* "text" */ val Text: typings.sirenParser.fieldMod.FieldType.Text & String = js.native
    
    @js.native
    sealed trait Time
      extends StObject
         with FieldType
    /* "time" */ val Time: typings.sirenParser.fieldMod.FieldType.Time & String = js.native
    
    @js.native
    sealed trait Url
      extends StObject
         with FieldType
    /* "url" */ val Url: typings.sirenParser.fieldMod.FieldType.Url & String = js.native
    
    @js.native
    sealed trait Week
      extends StObject
         with FieldType
    /* "week" */ val Week: typings.sirenParser.fieldMod.FieldType.Week & String = js.native
  }
  
  @js.native
  trait Field extends StObject {
    
    var `class`: js.UndefOr[js.Array[String]] = js.native
    
    def hasClass(cls: String): Boolean = js.native
    def hasClass(cls: RegExp): Boolean = js.native
    
    var name: String = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[FieldType] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
}
