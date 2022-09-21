package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IElement extends StObject {
  
  def chainClick(elements: js.Array[Any], callback: js.Function): Unit = js.native
  
  def clickSelector(selector: String, callback: js.Function): Unit = js.native
  def clickSelector(selector: String, callback: js.Function, scope: Any): Unit = js.native
  def clickSelector(selector: String, root: Any, callback: js.Function): Unit = js.native
  def clickSelector(selector: String, root: Any, callback: js.Function, scope: Any): Unit = js.native
  
  def contentLike(el: Any, text: String): Unit = js.native
  def contentLike(el: Any, text: String, description: String): Unit = js.native
  
  def contentNotLike(el: Any, text: String): Unit = js.native
  def contentNotLike(el: Any, text: String, description: String): Unit = js.native
  
  def elementIsAt(el: Any, xy: js.Array[Double], allowChildren: Boolean): Unit = js.native
  def elementIsAt(el: Any, xy: js.Array[Double], allowChildren: Boolean, description: String): Unit = js.native
  
  def elementIsInView(el: Any): Unit = js.native
  
  def elementIsNotTopElement(el: Any, allowChildren: Boolean): Unit = js.native
  def elementIsNotTopElement(el: Any, allowChildren: Boolean, description: String): Unit = js.native
  
  def elementIsNotVisible(el: Any): Unit = js.native
  def elementIsNotVisible(el: Any, description: String): Unit = js.native
  
  def elementIsTop(el: Any, allowChildren: Boolean): Boolean = js.native
  
  def elementIsTopElement(el: Any, allowChildren: Boolean, description: String, strict: Any): Unit = js.native
  def elementIsTopElement(el: Any, allowChildren: Boolean, description: Unit, strict: Any): Unit = js.native
  
  def elementIsVisible(el: Any): Unit = js.native
  def elementIsVisible(el: Any, description: String): Unit = js.native
  
  def findCenter(el: Any): js.Array[Double] = js.native
  def findCenter(el: Any, local: Boolean): js.Array[Double] = js.native
  
  def hasCls(el: Any, cls: String): Unit = js.native
  def hasCls(el: Any, cls: String, description: String): Unit = js.native
  
  def hasNotCls(el: Any, cls: String): Unit = js.native
  def hasNotCls(el: Any, cls: String, description: String): Unit = js.native
  
  def hasNotStyle(el: Any, property: String, value: String): Unit = js.native
  def hasNotStyle(el: Any, property: String, value: String, description: String): Unit = js.native
  
  def hasStyle(el: Any, property: String, value: String): Unit = js.native
  def hasStyle(el: Any, property: String, value: String, description: String): Unit = js.native
  
  def isElementVisible(el: Any): Boolean = js.native
  
  def isInView(el: Any): Unit = js.native
  def isInView(el: Any, description: String): Unit = js.native
  
  def monkeyTest(el: Any, nbrInteractions: Double): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: String): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: String, callback: js.Function): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: String, callback: js.Function, scope: Any): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: String, callback: Unit, scope: Any): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: Unit, callback: js.Function): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: Unit, callback: js.Function, scope: Any): Unit = js.native
  def monkeyTest(el: Any, nbrInteractions: Double, description: Unit, callback: Unit, scope: Any): Unit = js.native
  
  def scrollHorizontallyTo(el: Any, newLeft: Double): Double = js.native
  def scrollHorizontallyTo(el: Any, newLeft: Double, delay: Double): Double = js.native
  def scrollHorizontallyTo(el: Any, newLeft: Double, delay: Double, callback: js.Function): Double = js.native
  def scrollHorizontallyTo(el: Any, newLeft: Double, delay: Unit, callback: js.Function): Double = js.native
  
  def scrollVerticallyTo(el: Any, newTop: Double): Double = js.native
  def scrollVerticallyTo(el: Any, newTop: Double, delay: Double): Double = js.native
  def scrollVerticallyTo(el: Any, newTop: Double, delay: Double, callback: js.Function): Double = js.native
  def scrollVerticallyTo(el: Any, newTop: Double, delay: Unit, callback: js.Function): Double = js.native
  
  def selectorCountIs(selector: String, count: Double, description: String): Unit = js.native
  def selectorCountIs(selector: String, root: Any, count: Double, description: String): Unit = js.native
  
  def selectorExists(selector: String): Unit = js.native
  def selectorExists(selector: String, description: String): Unit = js.native
  
  def selectorIsAt(selector: String, xy: js.Array[Double], allowChildren: Boolean): Unit = js.native
  def selectorIsAt(selector: String, xy: js.Array[Double], allowChildren: Boolean, description: String): Unit = js.native
  
  def selectorNotExists(selector: String): Unit = js.native
  def selectorNotExists(selector: String, description: String): Unit = js.native
  
  def waitForContentLike(el: Any, text: String, callback: js.Function): Unit = js.native
  def waitForContentLike(el: Any, text: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForContentLike(el: Any, text: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForContentLike(el: Any, text: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForContentNotLike(el: Any, text: String, callback: js.Function): Unit = js.native
  def waitForContentNotLike(el: Any, text: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForContentNotLike(el: Any, text: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForContentNotLike(el: Any, text: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForElementNotTop(el: Any, callback: js.Function): Unit = js.native
  def waitForElementNotTop(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForElementNotTop(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForElementNotTop(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForElementNotVisible(el: Any, callback: js.Function): Unit = js.native
  def waitForElementNotVisible(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForElementNotVisible(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForElementNotVisible(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForElementTop(el: Any, callback: js.Function): Unit = js.native
  def waitForElementTop(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForElementTop(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForElementTop(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForElementVisible(el: Any, callback: js.Function): Unit = js.native
  def waitForElementVisible(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForElementVisible(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForElementVisible(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForScrollChange(el: Any, side: String, callback: js.Function): Unit = js.native
  def waitForScrollChange(el: Any, side: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForScrollChange(el: Any, side: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForScrollChange(el: Any, side: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForScrollLeftChange(el: Any, callback: js.Function): Unit = js.native
  def waitForScrollLeftChange(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForScrollLeftChange(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForScrollLeftChange(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForScrollTopChange(el: Any, callback: js.Function): Unit = js.native
  def waitForScrollTopChange(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForScrollTopChange(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForScrollTopChange(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForSelector(selector: String, callback: js.Function): Unit = js.native
  def waitForSelector(selector: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelector(selector: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelector(selector: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  def waitForSelector(selector: String, root: Any, callback: js.Function): Unit = js.native
  def waitForSelector(selector: String, root: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelector(selector: String, root: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelector(selector: String, root: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function): Unit = js.native
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelectorAt(xy: js.Array[Double], selector: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function): Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelectorAtCursor(xy: js.Array[Double], selector: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForSelectorNotFound(selector: String, callback: js.Function): Unit = js.native
  def waitForSelectorNotFound(selector: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelectorNotFound(selector: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelectorNotFound(selector: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: Any, callback: js.Function): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelectorNotFound(selector: String, root: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForSelectors(selectors: js.Array[String], callback: js.Function): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], callback: js.Function, scope: Any): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: Any, callback: js.Function): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForSelectors(selectors: js.Array[String], root: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitUntilInView(el: Any, callback: js.Function): Unit = js.native
  def waitUntilInView(el: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitUntilInView(el: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitUntilInView(el: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
}
