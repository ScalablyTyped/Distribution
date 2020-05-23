package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet. */
@js.native
trait CSSStyleSheet extends StyleSheet {
  val cssRules: CSSRuleList = js.native
  val ownerRule: CSSRule | Null = js.native
  val rules: CSSRuleList = js.native
  def addRule(): Double = js.native
  def addRule(selector: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String, index: Double): Double = js.native
  def deleteRule(index: Double): Unit = js.native
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  def removeRule(): Unit = js.native
  def removeRule(index: Double): Unit = js.native
}

