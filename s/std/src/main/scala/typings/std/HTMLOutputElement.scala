package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements. */
@js.native
trait HTMLOutputElement
  extends StObject
     with HTMLElement {
  
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
  
  def checkValidity(): scala.Boolean = js.native
  
  var defaultValue: java.lang.String = js.native
  
  val form: HTMLFormElement | Null = js.native
  
  val htmlFor: DOMTokenList = js.native
  
  val labels: NodeListOf[HTMLLabelElement] = js.native
  
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
  
  def reportValidity(): scala.Boolean = js.native
  
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  val `type`: java.lang.String = js.native
  
  val validationMessage: java.lang.String = js.native
  
  val validity: ValidityState = js.native
  
  var value: java.lang.String = js.native
  
  val willValidate: scala.Boolean = js.native
}
