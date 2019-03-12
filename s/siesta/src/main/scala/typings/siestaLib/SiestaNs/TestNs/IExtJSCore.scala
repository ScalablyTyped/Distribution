package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
trait IExtJSCore extends js.Object {
  def Ext(): js.Any
  def clickCQ(selector: java.lang.String, root: js.Any, callback: js.Function): js.Any
  def clickComponentQuery(selector: java.lang.String, root: js.Any, callback: js.Function): js.Any
  def compositeQuery(selector: java.lang.String, root: js.Any, allowEmpty: scala.Boolean): js.Array[stdLib.HTMLElement]
  def cq(selector: java.lang.String): js.Any
  def cq1(selector: java.lang.String): js.Any
  def getExt(): js.Any
  def knownBugIn(frameworkVersion: java.lang.String, fn: js.Function, reason: java.lang.String): js.Any
  def requireOk(args: js.Any*): scala.Unit
}

object IExtJSCore {
  @scala.inline
  def apply(
    Ext: () => js.Any,
    clickCQ: (java.lang.String, js.Any, js.Function) => js.Any,
    clickComponentQuery: (java.lang.String, js.Any, js.Function) => js.Any,
    compositeQuery: (java.lang.String, js.Any, scala.Boolean) => js.Array[stdLib.HTMLElement],
    cq: java.lang.String => js.Any,
    cq1: java.lang.String => js.Any,
    getExt: () => js.Any,
    knownBugIn: (java.lang.String, js.Function, java.lang.String) => js.Any,
    requireOk: /* repeated */ js.Any => scala.Unit
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal(Ext = js.Any.fromFunction0(Ext), clickCQ = js.Any.fromFunction3(clickCQ), clickComponentQuery = js.Any.fromFunction3(clickComponentQuery), compositeQuery = js.Any.fromFunction3(compositeQuery), cq = js.Any.fromFunction1(cq), cq1 = js.Any.fromFunction1(cq1), getExt = js.Any.fromFunction0(getExt), knownBugIn = js.Any.fromFunction3(knownBugIn), requireOk = js.Any.fromFunction1(requireOk))
  
    __obj.asInstanceOf[IExtJSCore]
  }
}

