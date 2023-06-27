package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <select> HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement)
  */
@js.native
trait HTMLSelectElement
  extends StObject
     with HTMLElement
     with /* standard dom */
/* name */ NumberDictionary[HTMLOptionElement | HTMLOptGroupElement] {
  
  def add(element: HTMLOptGroupElement): Unit = js.native
  def add(element: HTMLOptGroupElement, before: Double): Unit = js.native
  def add(element: HTMLOptGroupElement, before: HTMLElement): Unit = js.native
  /**
    * Adds an element to the areas, controlRange, or options collection.
    * @param element Variant of type Number that specifies the index position in the collection where the element is placed. If no value is given, the method places the element at the end of the collection.
    * @param before Variant of type Object that specifies an element to insert before, or null to append the object to the collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/add)
    */
  /* standard dom */
  def add(element: HTMLOptionElement): Unit = js.native
  def add(element: HTMLOptionElement, before: Double): Unit = js.native
  def add(element: HTMLOptionElement, before: HTMLElement): Unit = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/autocomplete) */
  /* standard dom */
  var autocomplete: java.lang.String = js.native
  
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/checkValidity)
    */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/disabled) */
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /**
    * Retrieves a reference to the form that the object is embedded in.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/form)
    */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /**
    * Retrieves a select object or an object from an options collection.
    * @param name Variant of type Number or String that specifies the object or collection to retrieve. If this parameter is an integer, it is the zero-based index of the object. If this parameter is a string, all objects with matching name or id properties are retrieved, and a collection is returned if more than one match is made.
    * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a collection is returned.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/item)
    */
  /* standard dom */
  def item(index: Double): HTMLOptionElement | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[HTMLOptionElement]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/labels) */
  /* standard dom */
  val labels: NodeListOf[HTMLLabelElement] = js.native
  
  /**
    * Sets or retrieves the number of objects in a collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/length)
    */
  /* standard dom */
  var length: Double = js.native
  
  /**
    * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/multiple)
    */
  /* standard dom */
  var multiple: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the name of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/name)
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /**
    * Retrieves a select object or an object from an options collection.
    * @param namedItem A String that specifies the name or id property of the object to retrieve. A collection is returned if more than one match is made.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/namedItem)
    */
  /* standard dom */
  def namedItem(name: java.lang.String): HTMLOptionElement | Null = js.native
  
  /**
    * Returns an HTMLOptionsCollection of the list of options.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/options)
    */
  /* standard dom */
  val options: HTMLOptionsCollection = js.native
  
  /* standard dom */
  def remove(index: Double): Unit = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/reportValidity) */
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /**
    * When present, marks an element that can't be submitted without a value.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/required)
    */
  /* standard dom */
  var required: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the index of the selected option in a select object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedIndex)
    */
  /* standard dom */
  var selectedIndex: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedOptions) */
  /* standard dom */
  val selectedOptions: HTMLCollectionOf[HTMLOptionElement] = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/setCustomValidity)
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /**
    * Sets or retrieves the number of rows in the list box.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/size)
    */
  /* standard dom */
  var size: Double = js.native
  
  /**
    * Retrieves the type of select control based on the value of the MULTIPLE attribute.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type)
    */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validationMessage)
    */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validity)
    */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /**
    * Sets or retrieves the value which is returned to the server when the form control is submitted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/value)
    */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/willValidate)
    */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
