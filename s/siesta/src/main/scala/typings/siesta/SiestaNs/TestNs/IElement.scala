package typings.siesta.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IElement extends js.Object {
  def chainClick(elements: js.Array[_], callback: js.Function): Unit = js.native
  def clickSelector(selector: String, callback: js.Function): Unit = js.native
  def clickSelector(selector: String, callback: js.Function, scope: js.Any): Unit = js.native
  def clickSelector(selector: String, root: js.Any, callback: js.Function): Unit = js.native
  def clickSelector(selector: String, root: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def contentLike(el: js.Any, text: String): Unit = js.native
  def contentLike(el: js.Any, text: String, description: String): Unit = js.native
  def contentNotLike(el: js.Any, text: String): Unit = js.native
  def contentNotLike(el: js.Any, text: String, description: String): Unit = js.native
  def elementIsAt(el: js.Any, xy: js.Array[Double], allowChildren: Boolean): Unit = js.native
  def elementIsAt(el: js.Any, xy: js.Array[Double], allowChildren: Boolean, description: String): Unit = js.native
  def elementIsInView(el: js.Any): Unit = js.native
  def elementIsNotTopElement(el: js.Any, allowChildren: Boolean): Unit = js.native
  def elementIsNotTopElement(el: js.Any, allowChildren: Boolean, description: String): Unit = js.native
  def elementIsNotVisible(el: js.Any): Unit = js.native
  def elementIsNotVisible(el: js.Any, description: String): Unit = js.native
  def elementIsTop(el: js.Any, allowChildren: Boolean): Boolean = js.native
  def elementIsTopElement(el: js.Any, allowChildren: Boolean): Unit = js.native
  def elementIsTopElement(el: js.Any, allowChildren: Boolean, description: String): Unit = js.native
  def elementIsTopElement(el: js.Any, allowChildren: Boolean, description: String, strict: js.Any): Unit = js.native
  def elementIsVisible(el: js.Any): Unit = js.native
  def elementIsVisible(el: js.Any, description: String): Unit = js.native
  def findCenter(el: js.Any): js.Array[Double] = js.native
  def findCenter(el: js.Any, local: Boolean): js.Array[Double] = js.native
  def hasCls(el: js.Any, cls: String): Unit = js.native
  def hasCls(el: js.Any, cls: String, description: String): Unit = js.native
  def hasNotCls(el: js.Any, cls: String): Unit = js.native
  def hasNotCls(el: js.Any, cls: String, description: String): Unit = js.native
  def hasNotStyle(el: js.Any, property: String, value: String): Unit = js.native
  def hasNotStyle(el: js.Any, property: String, value: String, description: String): Unit = js.native
  def hasStyle(el: js.Any, property: String, value: String): Unit = js.native
  def hasStyle(el: js.Any, property: String, value: String, description: String): Unit = js.native
  def isElementVisible(el: js.Any): Boolean = js.native
  def isInView(el: js.Any): Unit = js.native
  def isInView(el: js.Any, description: String): Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: Double): Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: Double, description: String): Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: Double, description: String, callback: js.Function): Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: Double, description: String, callback: js.Function, scope: js.Any): Unit = js.native
  def scrollHorizontallyTo(el: js.Any, newLeft: Double): Double = js.native
  def scrollHorizontallyTo(el: js.Any, newLeft: Double, delay: Double): Double = js.native
  def scrollHorizontallyTo(el: js.Any, newLeft: Double, delay: Double, callback: js.Function): Double = js.native
  def scrollVerticallyTo(el: js.Any, newTop: Double): Double = js.native
  def scrollVerticallyTo(el: js.Any, newTop: Double, delay: Double): Double = js.native
  def scrollVerticallyTo(el: js.Any, newTop: Double, delay: Double, callback: js.Function): Double = js.native
  def selectorCountIs(selector: String, count: Double, description: String): Unit = js.native
  def selectorCountIs(selector: String, root: js.Any, count: Double, description: String): Unit = js.native
  def selectorExists(selector: String): Unit = js.native
  def selectorExists(selector: String, description: String): Unit = js.native
  def selectorIsAt(selector: String, xy: js.Array[Double], allowChildren: Boolean): Unit = js.native
  def selectorIsAt(selector: String, xy: js.Array[Double], allowChildren: Boolean, description: String): Unit = js.native
  def selectorNotExists(selector: String): Unit = js.native
  def selectorNotExists(selector: String, description: String): Unit = js.native
  def waitForContentLike(el: js.Any, text: String, callback: js.Function): Unit = js.native
  def waitForContentLike(el: js.Any, text: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForContentLike(el: js.Any, text: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForContentNotLike(el: js.Any, text: String, callback: js.Function): Unit = js.native
  def waitForContentNotLike(el: js.Any, text: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForContentNotLike(el: js.Any, text: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForElementNotTop(el: js.Any, callback: js.Function): Unit = js.native
  def waitForElementNotTop(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForElementNotTop(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForElementNotVisible(el: js.Any, callback: js.Function): Unit = js.native
  def waitForElementNotVisible(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForElementNotVisible(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForElementTop(el: js.Any, callback: js.Function): Unit = js.native
  def waitForElementTop(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForElementTop(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForElementVisible(el: js.Any, callback: js.Function): Unit = js.native
  def waitForElementVisible(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForElementVisible(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForScrollChange(el: js.Any, side: String, callback: js.Function): Unit = js.native
  def waitForScrollChange(el: js.Any, side: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForScrollChange(el: js.Any, side: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForScrollLeftChange(el: js.Any, callback: js.Function): Unit = js.native
  def waitForScrollLeftChange(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForScrollLeftChange(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForScrollTopChange(el: js.Any, callback: js.Function): Unit = js.native
  def waitForScrollTopChange(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForScrollTopChange(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelector(selector: String, callback: js.Function): Unit = js.native
  def waitForSelector(selector: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelector(selector: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelector(selector: String, root: js.Any, callback: js.Function): Unit = js.native
  def waitForSelector(selector: String, root: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelector(selector: String, root: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function): Unit = js.native
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function): Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelectorNotFound(selector: String, callback: js.Function): Unit = js.native
  def waitForSelectorNotFound(selector: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelectorNotFound(selector: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: js.Any, callback: js.Function): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], callback: js.Function): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: js.Any, callback: js.Function): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitUntilInView(el: js.Any, callback: js.Function): Unit = js.native
  def waitUntilInView(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitUntilInView(el: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
}

