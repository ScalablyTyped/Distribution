package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement)
  */
@js.native
trait HTMLOutputElement
  extends StObject
     with HTMLElement {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/checkValidity) */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/defaultValue) */
  /* standard dom */
  var defaultValue: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/form) */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/htmlFor) */
  /* standard dom */
  val htmlFor: DOMTokenList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/labels) */
  /* standard dom */
  val labels: NodeListOf[HTMLLabelElement] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/name) */
  /* standard dom */
  var name: java.lang.String = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/reportValidity) */
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/setCustomValidity) */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /**
    * Returns the string "output".
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/type)
    */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validationMessage) */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validity) */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /**
    * Returns the element's current value.
    *
    * Can be set, to change the value.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/value)
    */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/willValidate) */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
