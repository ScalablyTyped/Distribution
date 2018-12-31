package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IElement extends js.Object {
  def chainClick(elements: js.Array[_], callback: js.Function): scala.Unit = js.native
  def clickSelector(selector: java.lang.String, callback: js.Function): scala.Unit = js.native
  def clickSelector(selector: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def clickSelector(selector: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def clickSelector(selector: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def contentLike(el: js.Any, text: java.lang.String): scala.Unit = js.native
  def contentLike(el: js.Any, text: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def contentNotLike(el: js.Any, text: java.lang.String): scala.Unit = js.native
  def contentNotLike(el: js.Any, text: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def elementIsAt(el: js.Any, xy: js.Array[scala.Double], allowChildren: scala.Boolean): scala.Unit = js.native
  def elementIsAt(
    el: js.Any,
    xy: js.Array[scala.Double],
    allowChildren: scala.Boolean,
    description: java.lang.String
  ): scala.Unit = js.native
  def elementIsInView(el: js.Any): scala.Unit = js.native
  def elementIsNotTopElement(el: js.Any, allowChildren: scala.Boolean): scala.Unit = js.native
  def elementIsNotTopElement(el: js.Any, allowChildren: scala.Boolean, description: java.lang.String): scala.Unit = js.native
  def elementIsNotVisible(el: js.Any): scala.Unit = js.native
  def elementIsNotVisible(el: js.Any, description: java.lang.String): scala.Unit = js.native
  def elementIsTop(el: js.Any, allowChildren: scala.Boolean): scala.Boolean = js.native
  def elementIsTopElement(el: js.Any, allowChildren: scala.Boolean): scala.Unit = js.native
  def elementIsTopElement(el: js.Any, allowChildren: scala.Boolean, description: java.lang.String): scala.Unit = js.native
  def elementIsTopElement(el: js.Any, allowChildren: scala.Boolean, description: java.lang.String, strict: js.Any): scala.Unit = js.native
  def elementIsVisible(el: js.Any): scala.Unit = js.native
  def elementIsVisible(el: js.Any, description: java.lang.String): scala.Unit = js.native
  def findCenter(el: js.Any): js.Array[scala.Double] = js.native
  def findCenter(el: js.Any, local: scala.Boolean): js.Array[scala.Double] = js.native
  def hasCls(el: js.Any, cls: java.lang.String): scala.Unit = js.native
  def hasCls(el: js.Any, cls: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def hasNotCls(el: js.Any, cls: java.lang.String): scala.Unit = js.native
  def hasNotCls(el: js.Any, cls: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def hasNotStyle(el: js.Any, property: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def hasNotStyle(el: js.Any, property: java.lang.String, value: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def hasStyle(el: js.Any, property: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def hasStyle(el: js.Any, property: java.lang.String, value: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def isElementVisible(el: js.Any): scala.Boolean = js.native
  def isInView(el: js.Any): scala.Unit = js.native
  def isInView(el: js.Any, description: java.lang.String): scala.Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: scala.Double): scala.Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: scala.Double, description: java.lang.String): scala.Unit = js.native
  def monkeyTest(el: js.Any, nbrInteractions: scala.Double, description: java.lang.String, callback: js.Function): scala.Unit = js.native
  def monkeyTest(
    el: js.Any,
    nbrInteractions: scala.Double,
    description: java.lang.String,
    callback: js.Function,
    scope: js.Any
  ): scala.Unit = js.native
  def scrollHorizontallyTo(el: js.Any, newLeft: scala.Double): scala.Double = js.native
  def scrollHorizontallyTo(el: js.Any, newLeft: scala.Double, delay: scala.Double): scala.Double = js.native
  def scrollHorizontallyTo(el: js.Any, newLeft: scala.Double, delay: scala.Double, callback: js.Function): scala.Double = js.native
  def scrollVerticallyTo(el: js.Any, newTop: scala.Double): scala.Double = js.native
  def scrollVerticallyTo(el: js.Any, newTop: scala.Double, delay: scala.Double): scala.Double = js.native
  def scrollVerticallyTo(el: js.Any, newTop: scala.Double, delay: scala.Double, callback: js.Function): scala.Double = js.native
  def selectorCountIs(selector: java.lang.String, count: scala.Double, description: java.lang.String): scala.Unit = js.native
  def selectorCountIs(selector: java.lang.String, root: js.Any, count: scala.Double, description: java.lang.String): scala.Unit = js.native
  def selectorExists(selector: java.lang.String): scala.Unit = js.native
  def selectorExists(selector: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def selectorIsAt(selector: java.lang.String, xy: js.Array[scala.Double], allowChildren: scala.Boolean): scala.Unit = js.native
  def selectorIsAt(
    selector: java.lang.String,
    xy: js.Array[scala.Double],
    allowChildren: scala.Boolean,
    description: java.lang.String
  ): scala.Unit = js.native
  def selectorNotExists(selector: java.lang.String): scala.Unit = js.native
  def selectorNotExists(selector: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def waitForContentLike(el: js.Any, text: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForContentLike(el: js.Any, text: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForContentLike(el: js.Any, text: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForContentNotLike(el: js.Any, text: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForContentNotLike(el: js.Any, text: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForContentNotLike(el: js.Any, text: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForElementNotTop(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForElementNotTop(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForElementNotTop(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForElementNotVisible(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForElementNotVisible(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForElementNotVisible(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForElementTop(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForElementTop(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForElementTop(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForElementVisible(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForElementVisible(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForElementVisible(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForScrollChange(el: js.Any, side: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForScrollChange(el: js.Any, side: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForScrollChange(el: js.Any, side: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForScrollLeftChange(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForScrollLeftChange(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForScrollLeftChange(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForScrollTopChange(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForScrollTopChange(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForScrollTopChange(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForSelector(selector: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForSelector(selector: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelector(selector: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForSelector(selector: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForSelector(selector: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelector(
    selector: java.lang.String,
    root: js.Any,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForSelectorAt(xy: js.Array[scala.Double], selector: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForSelectorAt(xy: js.Array[scala.Double], selector: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelectorAt(
    xy: js.Array[scala.Double],
    selector: java.lang.String,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[scala.Double], selector: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[scala.Double], selector: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelectorAtCursor(
    xy: js.Array[scala.Double],
    selector: java.lang.String,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForSelectorNotFound(selector: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForSelectorNotFound(selector: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelectorNotFound(selector: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForSelectorNotFound(selector: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForSelectorNotFound(selector: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelectorNotFound(
    selector: java.lang.String,
    root: js.Any,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForSelectors(selectors: js.Array[java.lang.String], callback: js.Function): scala.Unit = js.native
  def waitForSelectors(selectors: js.Array[java.lang.String], callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelectors(selectors: js.Array[java.lang.String], callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForSelectors(selectors: js.Array[java.lang.String], root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForSelectors(selectors: js.Array[java.lang.String], root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForSelectors(
    selectors: js.Array[java.lang.String],
    root: js.Any,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitUntilInView(el: js.Any, callback: js.Function): scala.Unit = js.native
  def waitUntilInView(el: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitUntilInView(el: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
}

