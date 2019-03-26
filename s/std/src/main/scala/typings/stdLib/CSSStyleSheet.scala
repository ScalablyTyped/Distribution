package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSStyleSheet extends StyleSheet {
  val cssRules: CSSRuleList = js.native
  /** @deprecated */
  var cssText: java.lang.String = js.native
  /** @deprecated */
  val id: java.lang.String = js.native
  /** @deprecated */
  val imports: StyleSheetList = js.native
  /** @deprecated */
  val isAlternate: scala.Boolean = js.native
  /** @deprecated */
  val isPrefAlternate: scala.Boolean = js.native
  val ownerRule: CSSRule | scala.Null = js.native
  /** @deprecated */
  val owningElement: Element = js.native
  /** @deprecated */
  val pages: js.Any = js.native
  /** @deprecated */
  val readOnly: scala.Boolean = js.native
  val rules: CSSRuleList = js.native
  /** @deprecated */
  def addImport(bstrURL: java.lang.String): scala.Double = js.native
  def addImport(bstrURL: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  /** @deprecated */
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def deleteRule(): scala.Unit = js.native
  def deleteRule(index: scala.Double): scala.Unit = js.native
  def insertRule(rule: java.lang.String): scala.Double = js.native
  def insertRule(rule: java.lang.String, index: scala.Double): scala.Double = js.native
  /** @deprecated */
  def removeImport(lIndex: scala.Double): scala.Unit = js.native
  def removeRule(lIndex: scala.Double): scala.Unit = js.native
}

@JSGlobal("CSSStyleSheet")
@js.native
class CSSStyleSheetCls () extends CSSStyleSheet {
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /* CompleteClass */
  override val href: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val media: MediaList = js.native
  /* CompleteClass */
  override val ownerNode: Node = js.native
  /* CompleteClass */
  override val parentStyleSheet: StyleSheet | scala.Null = js.native
  /* CompleteClass */
  override val title: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}

@JSGlobal("CSSStyleSheet")
@js.native
object CSSStyleSheet
  extends org.scalablytyped.runtime.Instantiable0[CSSStyleSheet]

