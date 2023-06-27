package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet)
  */
@js.native
trait CSSStyleSheet
  extends StObject
     with StyleSheet {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/addRule)
    */
  /* standard dom */
  def addRule(): Double = js.native
  def addRule(selector: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: java.lang.String, style: Unit, index: Double): Double = js.native
  def addRule(selector: Unit, style: java.lang.String): Double = js.native
  def addRule(selector: Unit, style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: Unit, style: Unit, index: Double): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules) */
  /* standard dom */
  val cssRules: CSSRuleList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/deleteRule) */
  /* standard dom */
  def deleteRule(index: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/insertRule) */
  /* standard dom */
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/ownerRule) */
  /* standard dom */
  val ownerRule: CSSRule | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/removeRule)
    */
  /* standard dom */
  def removeRule(): Unit = js.native
  def removeRule(index: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace) */
  /* standard dom */
  def replace(text: java.lang.String): js.Promise[CSSStyleSheet] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync) */
  /* standard dom */
  def replaceSync(text: java.lang.String): Unit = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/rules)
    */
  /* standard dom */
  val rules: CSSRuleList = js.native
}
