package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties and methods (beyond those on the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <object> element, representing external resources.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement)
  */
@js.native
trait HTMLObjectElement
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
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/align)
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/archive)
    */
  /* standard dom */
  var archive: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/border)
    */
  /* standard dom */
  var border: java.lang.String = js.native
  
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/checkValidity)
    */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /**
    * Sets or retrieves the URL of the file containing the compiled Java class.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/code)
    */
  /* standard dom */
  var code: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL of the component.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/codeBase)
    */
  /* standard dom */
  var codeBase: java.lang.String = js.native
  
  /**
    * Sets or retrieves the Internet media type for the code associated with the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/codeType)
    */
  /* standard dom */
  var codeType: java.lang.String = js.native
  
  /**
    * Retrieves the document object of the page or frame.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/contentDocument)
    */
  /* standard dom */
  val contentDocument: Document | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/contentWindow) */
  /* standard dom */
  val contentWindow: WindowProxy | Null = js.native
  
  /**
    * Sets or retrieves the URL that references the data of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/data)
    */
  /* standard dom */
  var data: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/declare)
    */
  /* standard dom */
  var declare: scala.Boolean = js.native
  
  /**
    * Retrieves a reference to the form that the object is embedded in.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/form)
    */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/getSVGDocument) */
  /* standard dom */
  def getSVGDocument(): Document | Null = js.native
  
  /**
    * Sets or retrieves the height of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/height)
    */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/hspace)
    */
  /* standard dom */
  var hspace: Double = js.native
  
  /**
    * Sets or retrieves the name of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/name)
    */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/reportValidity) */
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/setCustomValidity)
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /**
    * Sets or retrieves a message to be displayed while an object is loading.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/standby)
    */
  /* standard dom */
  var standby: java.lang.String = js.native
  
  /**
    * Sets or retrieves the MIME type of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/type)
    */
  /* standard dom */
  var `type`: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/useMap)
    */
  /* standard dom */
  var useMap: java.lang.String = js.native
  
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/validationMessage)
    */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/validity)
    */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/vspace)
    */
  /* standard dom */
  var vspace: Double = js.native
  
  /**
    * Sets or retrieves the width of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/width)
    */
  /* standard dom */
  var width: java.lang.String = js.native
  
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/willValidate)
    */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
