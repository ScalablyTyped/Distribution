package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet. */
@js.native
trait CSSStyleSheet
  extends StObject
     with StyleSheet {
  
  def addRule(): Double = js.native
  def addRule(selector: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: java.lang.String, style: Unit, index: Double): Double = js.native
  def addRule(selector: Unit, style: java.lang.String): Double = js.native
  def addRule(selector: Unit, style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: Unit, style: Unit, index: Double): Double = js.native
  
  val cssRules: CSSRuleList = js.native
  
  def deleteRule(index: Double): Unit = js.native
  
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  
  val ownerRule: CSSRule | Null = js.native
  
  def removeRule(): Unit = js.native
  def removeRule(index: Double): Unit = js.native
  
  val rules: CSSRuleList = js.native
}
