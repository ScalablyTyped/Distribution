package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TranslatableString extends StObject
/** An enumeration of all the translatable strings used by `@rjsf/core` and its themes. The value of each of the
  * enumeration keys is expected to be the actual english string. Some strings contain replaceable parameter values
  * as indicated by `%1`, `%2`, etc. The number after the `%` indicates the order of the parameter. The ordering of
  * parameters is important because some languages may choose to put the second parameter before the first in its
  * translation. Also, some strings are rendered using `markdown-to-jsx` and thus support markdown and inline html.
  */
@JSImport("@rjsf/utils", "TranslatableString")
@js.native
object TranslatableString extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TranslatableString & String] = js.native
  
  /** Add button title, used by AddButton */
  @js.native
  sealed trait AddButton
    extends StObject
       with TranslatableString
  /* "Add" */ val AddButton: typings.rjsfUtils.mod.TranslatableString.AddButton & String = js.native
  
  /** Add button title, used by AddButton */
  @js.native
  sealed trait AddItemButton
    extends StObject
       with TranslatableString
  /* "Add Item" */ val AddItemButton: typings.rjsfUtils.mod.TranslatableString.AddItemButton & String = js.native
  
  /** Aria date label, used by DateWidget */
  @js.native
  sealed trait AriaDateLabel
    extends StObject
       with TranslatableString
  /* "Select a date" */ val AriaDateLabel: typings.rjsfUtils.mod.TranslatableString.AriaDateLabel & String = js.native
  
  /** Fallback title of an array item, used by ArrayField */
  @js.native
  sealed trait ArrayItemTitle
    extends StObject
       with TranslatableString
  /* "Item" */ val ArrayItemTitle: typings.rjsfUtils.mod.TranslatableString.ArrayItemTitle & String = js.native
  
  /** Clear label, used by AltDateWidget */
  @js.native
  sealed trait ClearLabel
    extends StObject
       with TranslatableString
  /* "Clear" */ val ClearLabel: typings.rjsfUtils.mod.TranslatableString.ClearLabel & String = js.native
  
  /** Close label, used by ErrorList */
  @js.native
  sealed trait CloseLabel
    extends StObject
       with TranslatableString
  /* "Close" */ val CloseLabel: typings.rjsfUtils.mod.TranslatableString.CloseLabel & String = js.native
  
  /** Copy button title, used by IconButton */
  @js.native
  sealed trait CopyButton
    extends StObject
       with TranslatableString
  /* "Copy" */ val CopyButton: typings.rjsfUtils.mod.TranslatableString.CopyButton & String = js.native
  
  /** Decrement button aria label, used by UpDownWidget */
  @js.native
  sealed trait DecrementAriaLabel
    extends StObject
       with TranslatableString
  /* "Decrease value by 1" */ val DecrementAriaLabel: typings.rjsfUtils.mod.TranslatableString.DecrementAriaLabel & String = js.native
  
  /** Errors label, used by ErrorList */
  @js.native
  sealed trait ErrorsLabel
    extends StObject
       with TranslatableString
  /* "Errors" */ val ErrorsLabel: typings.rjsfUtils.mod.TranslatableString.ErrorsLabel & String = js.native
  
  /** File name, type and size info, where %1, %2 and %3 will be replaced by the file name, file type and file size as
    * provided by FileWidget
    */
  @js.native
  sealed trait FilesInfo
    extends StObject
       with TranslatableString
  /* "<strong>%1</strong> (%2, %3 bytes)" */ val FilesInfo: typings.rjsfUtils.mod.TranslatableString.FilesInfo & String = js.native
  
  /** Increment button aria label, used by UpDownWidget */
  @js.native
  sealed trait IncrementAriaLabel
    extends StObject
       with TranslatableString
  /* "Increase value by 1" */ val IncrementAriaLabel: typings.rjsfUtils.mod.TranslatableString.IncrementAriaLabel & String = js.native
  
  /** Invalid object field configuration as provided by the ObjectField */
  @js.native
  sealed trait InvalidObjectField
    extends StObject
       with TranslatableString
  /* "Invalid \"%1\" object field configuration: <em>%2</em>." */ val InvalidObjectField: typings.rjsfUtils.mod.TranslatableString.InvalidObjectField & String = js.native
  
  /** Key label, where %1 will be replaced by the label as provided by WrapIfAdditionalTemplate */
  @js.native
  sealed trait KeyLabel
    extends StObject
       with TranslatableString
  /* "%1 Key" */ val KeyLabel: typings.rjsfUtils.mod.TranslatableString.KeyLabel & String = js.native
  
  /** Missing items reason, used by ArrayField */
  @js.native
  sealed trait MissingItems
    extends StObject
       with TranslatableString
  /* "Missing items definition" */ val MissingItems: typings.rjsfUtils.mod.TranslatableString.MissingItems & String = js.native
  
  /** Move down button title, used by IconButton */
  @js.native
  sealed trait MoveDownButton
    extends StObject
       with TranslatableString
  /* "Move down" */ val MoveDownButton: typings.rjsfUtils.mod.TranslatableString.MoveDownButton & String = js.native
  
  /** Move up button title, used by IconButton */
  @js.native
  sealed trait MoveUpButton
    extends StObject
       with TranslatableString
  /* "Move up" */ val MoveUpButton: typings.rjsfUtils.mod.TranslatableString.MoveUpButton & String = js.native
  
  /** New additionalProperties string default value, used by ObjectField */
  @js.native
  sealed trait NewStringDefault
    extends StObject
       with TranslatableString
  /* "New Value" */ val NewStringDefault: typings.rjsfUtils.mod.TranslatableString.NewStringDefault & String = js.native
  
  /** No label, used by BooleanField */
  @js.native
  sealed trait NoLabel
    extends StObject
       with TranslatableString
  /* "No" */ val NoLabel: typings.rjsfUtils.mod.TranslatableString.NoLabel & String = js.native
  
  /** Now label, used by AltDateWidget */
  @js.native
  sealed trait NowLabel
    extends StObject
       with TranslatableString
  /* "Now" */ val NowLabel: typings.rjsfUtils.mod.TranslatableString.NowLabel & String = js.native
  
  /** Option prefix, where %1 will be replaced with the option index as provided by MultiSchemaField */
  @js.native
  sealed trait OptionPrefix
    extends StObject
       with TranslatableString
  /* "Option %1" */ val OptionPrefix: typings.rjsfUtils.mod.TranslatableString.OptionPrefix & String = js.native
  
  /** File preview label, used by FileWidget */
  @js.native
  sealed trait PreviewLabel
    extends StObject
       with TranslatableString
  /* "Preview" */ val PreviewLabel: typings.rjsfUtils.mod.TranslatableString.PreviewLabel & String = js.native
  
  /** Remove button title, used by IconButton */
  @js.native
  sealed trait RemoveButton
    extends StObject
       with TranslatableString
  /* "Remove" */ val RemoveButton: typings.rjsfUtils.mod.TranslatableString.RemoveButton & String = js.native
  
  /** Option prefix, where %1 and %2 will be replaced by the schema title and option index, respectively as provided by
    * MultiSchemaField
    */
  @js.native
  sealed trait TitleOptionPrefix
    extends StObject
       with TranslatableString
  /* "%1 option %2" */ val TitleOptionPrefix: typings.rjsfUtils.mod.TranslatableString.TitleOptionPrefix & String = js.native
  
  /** Unknown field type reason, where %1 will be replaced with the type as provided by SchemaField */
  @js.native
  sealed trait UnknownFieldType
    extends StObject
       with TranslatableString
  /* "Unknown field type %1" */ val UnknownFieldType: typings.rjsfUtils.mod.TranslatableString.UnknownFieldType & String = js.native
  
  /** Unsupported field schema, used by UnsupportedField */
  @js.native
  sealed trait UnsupportedField
    extends StObject
       with TranslatableString
  /* "Unsupported field schema." */ val UnsupportedField: typings.rjsfUtils.mod.TranslatableString.UnsupportedField & String = js.native
  
  /** Unsupported field schema, where %1 will be replaced by the idSchema.$id as provided by UnsupportedField */
  @js.native
  sealed trait UnsupportedFieldWithId
    extends StObject
       with TranslatableString
  /* "Unsupported field schema for field <code>%1</code>." */ val UnsupportedFieldWithId: typings.rjsfUtils.mod.TranslatableString.UnsupportedFieldWithId & String = js.native
  
  /** Unsupported field schema, where %1 and %2 will be replaced by the idSchema.$id and reason strings, respectively,
    * as provided by UnsupportedField
    */
  @js.native
  sealed trait UnsupportedFieldWithIdAndReason
    extends StObject
       with TranslatableString
  /* "Unsupported field schema for field <code>%1</code>: <em>%2</em>." */ val UnsupportedFieldWithIdAndReason: typings.rjsfUtils.mod.TranslatableString.UnsupportedFieldWithIdAndReason & String = js.native
  
  /** Unsupported field schema, where %1 will be replaced by the reason string as provided by UnsupportedField */
  @js.native
  sealed trait UnsupportedFieldWithReason
    extends StObject
       with TranslatableString
  /* "Unsupported field schema: <em>%1</em>." */ val UnsupportedFieldWithReason: typings.rjsfUtils.mod.TranslatableString.UnsupportedFieldWithReason & String = js.native
  
  /** Yes label, used by BooleanField */
  @js.native
  sealed trait YesLabel
    extends StObject
       with TranslatableString
  /* "Yes" */ val YesLabel: typings.rjsfUtils.mod.TranslatableString.YesLabel & String = js.native
}
