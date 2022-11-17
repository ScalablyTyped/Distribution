package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating the options, layout, and presentation of <input> elements. */
@js.native
trait HTMLInputElement
  extends StObject
     with HTMLElement {
  
  /** Sets or retrieves a comma-separated list of content types. */
  /* standard dom */
  var accept: java.lang.String = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    * @deprecated
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /** Sets or retrieves a text alternative to the graphic. */
  /* standard dom */
  var alt: java.lang.String = js.native
  
  /** Specifies whether autocomplete is applied to an editable text field. */
  /* standard dom */
  var autocomplete: java.lang.String = js.native
  
  /* standard dom */
  var capture: java.lang.String = js.native
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /** Sets or retrieves the state of the check box or radio button. */
  /* standard dom */
  var checked: scala.Boolean = js.native
  
  /** Sets or retrieves the state of the check box or radio button. */
  /* standard dom */
  var defaultChecked: scala.Boolean = js.native
  
  /** Sets or retrieves the initial contents of the object. */
  /* standard dom */
  var defaultValue: java.lang.String = js.native
  
  /* standard dom */
  var dirName: java.lang.String = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Returns a FileList object on a file type input object. */
  /* standard dom */
  var files: FileList | Null = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /** Overrides the action attribute (where the data on a form is sent) on the parent form element. */
  /* standard dom */
  var formAction: java.lang.String = js.native
  
  /** Used to override the encoding (formEnctype attribute) specified on the form element. */
  /* standard dom */
  var formEnctype: java.lang.String = js.native
  
  /** Overrides the submit method attribute previously specified on a form element. */
  /* standard dom */
  var formMethod: java.lang.String = js.native
  
  /** Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option. */
  /* standard dom */
  var formNoValidate: scala.Boolean = js.native
  
  /** Overrides the target attribute on a form element. */
  /* standard dom */
  var formTarget: java.lang.String = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard dom */
  var height: Double = js.native
  
  /** When set, overrides the rendering of checkbox controls so that the current value is not visible. */
  /* standard dom */
  var indeterminate: scala.Boolean = js.native
  
  /* standard dom */
  val labels: NodeListOf[HTMLLabelElement] | Null = js.native
  
  /** Specifies the ID of a pre-defined datalist of options for an input element. */
  /* standard dom */
  val list: HTMLElement | Null = js.native
  
  /** Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field. */
  /* standard dom */
  var max: java.lang.String = js.native
  
  /** Sets or retrieves the maximum number of characters that the user can enter in a text control. */
  /* standard dom */
  var maxLength: Double = js.native
  
  /** Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field. */
  /* standard dom */
  var min: java.lang.String = js.native
  
  /* standard dom */
  var minLength: Double = js.native
  
  /** Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list. */
  /* standard dom */
  var multiple: scala.Boolean = js.native
  
  /** Sets or retrieves the name of the object. */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /** Gets or sets a string containing a regular expression that the user's input must match. */
  /* standard dom */
  var pattern: java.lang.String = js.native
  
  /** Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field. */
  /* standard dom */
  var placeholder: java.lang.String = js.native
  
  /* standard dom */
  var readOnly: scala.Boolean = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /** When present, marks an element that can't be submitted without a value. */
  /* standard dom */
  var required: scala.Boolean = js.native
  
  /** Makes the selection equal to the current object. */
  /* standard dom */
  def select(): Unit = js.native
  
  /* standard dom */
  var selectionDirection: "forward" | "backward" | "none" | Null = js.native
  
  /** Gets or sets the end position or offset of a text selection. */
  /* standard dom */
  var selectionEnd: Double | Null = js.native
  
  /** Gets or sets the starting position or offset of a text selection. */
  /* standard dom */
  var selectionStart: Double | Null = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /* standard dom */
  def setRangeText(replacement: java.lang.String): Unit = js.native
  /* standard dom */
  def setRangeText(replacement: java.lang.String, start: Double, end: Double): Unit = js.native
  def setRangeText(replacement: java.lang.String, start: Double, end: Double, selectionMode: SelectionMode): Unit = js.native
  
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    * @param direction The direction in which the selection is performed.
    */
  /* standard dom */
  def setSelectionRange(): Unit = js.native
  def setSelectionRange(start: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  @JSName("setSelectionRange")
  @scala.annotation.targetName("setSelectionRange_forward_backward_none")
  def setSelectionRange(start: Double, end: Double, direction: "forward" | "backward" | "none"): Unit = js.native
  @JSName("setSelectionRange")
  @scala.annotation.targetName("setSelectionRange_forward_backward_none")
  def setSelectionRange(start: Double, end: Null, direction: "forward" | "backward" | "none"): Unit = js.native
  def setSelectionRange(start: Null, end: Double): Unit = js.native
  @JSName("setSelectionRange")
  @scala.annotation.targetName("setSelectionRange_forward_backward_none")
  def setSelectionRange(start: Null, end: Double, direction: "forward" | "backward" | "none"): Unit = js.native
  @JSName("setSelectionRange")
  @scala.annotation.targetName("setSelectionRange_forward_backward_none")
  def setSelectionRange(start: Null, end: Null, direction: "forward" | "backward" | "none"): Unit = js.native
  
  /* standard dom */
  def showPicker(): Unit = js.native
  
  /* standard dom */
  var size: Double = js.native
  
  /** The address or URL of the a media resource that is to be considered. */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /** Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field. */
  /* standard dom */
  var step: java.lang.String = js.native
  
  /**
    * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
    * @param n Value to decrement the value by.
    */
  /* standard dom */
  def stepDown(): Unit = js.native
  def stepDown(n: Double): Unit = js.native
  
  /**
    * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
    * @param n Value to increment the value by.
    */
  /* standard dom */
  def stepUp(): Unit = js.native
  def stepUp(n: Double): Unit = js.native
  
  /** Returns the content type of the object. */
  /* standard dom */
  var `type`: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    * @deprecated
    */
  /* standard dom */
  var useMap: java.lang.String = js.native
  
  /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /** Returns a  ValidityState object that represents the validity states of an element. */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /** Returns the value of the data at the cursor's current position. */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /** Returns a Date object representing the form control's value, if applicable; otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based. */
  /* standard dom */
  var valueAsDate: js.Date | Null = js.native
  
  /** Returns the input field value as a number. */
  /* standard dom */
  var valueAsNumber: Double = js.native
  
  /* standard dom */
  val webkitEntries: js.Array[FileSystemEntry] = js.native
  
  /* standard dom */
  var webkitdirectory: scala.Boolean = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard dom */
  var width: Double = js.native
  
  /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
