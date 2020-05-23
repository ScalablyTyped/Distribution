package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A <select> HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface. */
@js.native
trait HTMLSelectElement
  extends HTMLElement
     with /* name */ NumberDictionary[HTMLOptionElement | HTMLOptGroupElement] {
  var autocomplete: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | Null = js.native
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  var length: Double = js.native
  /**
    * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
    */
  var multiple: scala.Boolean = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  val options: HTMLOptionsCollection = js.native
  /**
    * When present, marks an element that can't be submitted without a value.
    */
  var required: scala.Boolean = js.native
  /**
    * Sets or retrieves the index of the selected option in a select object.
    */
  var selectedIndex: Double = js.native
  val selectedOptions: HTMLCollectionOf[HTMLOptionElement] = js.native
  /**
    * Sets or retrieves the number of rows in the list box.
    */
  var size: Double = js.native
  /**
    * Retrieves the type of select control based on the value of the MULTIPLE attribute.
    */
  val `type`: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Sets or retrieves the value which is returned to the server when the form control is submitted.
    */
  var value: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  def add(element: HTMLOptGroupElement): Unit = js.native
  def add(element: HTMLOptGroupElement, before: Double): Unit = js.native
  def add(element: HTMLOptGroupElement, before: HTMLElement): Unit = js.native
  /**
    * Adds an element to the areas, controlRange, or options collection.
    * @param element Variant of type Number that specifies the index position in the collection where the element is placed. If no value is given, the method places the element at the end of the collection.
    * @param before Variant of type Object that specifies an element to insert before, or null to append the object to the collection.
    */
  def add(element: HTMLOptionElement): Unit = js.native
  def add(element: HTMLOptionElement, before: Double): Unit = js.native
  def add(element: HTMLOptionElement, before: HTMLElement): Unit = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /**
    * Retrieves a select object or an object from an options collection.
    * @param name Variant of type Number or String that specifies the object or collection to retrieve. If this parameter is an integer, it is the zero-based index of the object. If this parameter is a string, all objects with matching name or id properties are retrieved, and a collection is returned if more than one match is made.
    * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a collection is returned.
    */
  def item(index: Double): Element | Null = js.native
  /**
    * Retrieves a select object or an object from an options collection.
    * @param namedItem A String that specifies the name or id property of the object to retrieve. A collection is returned if more than one match is made.
    */
  def namedItem(name: java.lang.String): HTMLOptionElement | Null = js.native
  def remove(index: Double): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
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
  def reportValidity(): scala.Boolean = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): Unit = js.native
}

