package typings.siesta.Siesta.Test

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
trait IExtJSCore extends js.Object {
  def Ext(): js.Any
  def clickCQ(selector: String, root: js.Any, callback: js.Function): js.Any
  def clickComponentQuery(selector: String, root: js.Any, callback: js.Function): js.Any
  def compositeQuery(selector: String, root: js.Any, allowEmpty: Boolean): js.Array[HTMLElement]
  def cq(selector: String): js.Any
  def cq1(selector: String): js.Any
  def getExt(): js.Any
  def knownBugIn(frameworkVersion: String, fn: js.Function, reason: String): js.Any
  def requireOk(args: js.Any*): Unit
}

object IExtJSCore {
  @scala.inline
  def apply(
    Ext: () => js.Any,
    clickCQ: (String, js.Any, js.Function) => js.Any,
    clickComponentQuery: (String, js.Any, js.Function) => js.Any,
    compositeQuery: (String, js.Any, Boolean) => js.Array[HTMLElement],
    cq: String => js.Any,
    cq1: String => js.Any,
    getExt: () => js.Any,
    knownBugIn: (String, js.Function, String) => js.Any,
    requireOk: /* repeated */ js.Any => Unit
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal(Ext = js.Any.fromFunction0(Ext), clickCQ = js.Any.fromFunction3(clickCQ), clickComponentQuery = js.Any.fromFunction3(clickComponentQuery), compositeQuery = js.Any.fromFunction3(compositeQuery), cq = js.Any.fromFunction1(cq), cq1 = js.Any.fromFunction1(cq1), getExt = js.Any.fromFunction0(getExt), knownBugIn = js.Any.fromFunction3(knownBugIn), requireOk = js.Any.fromFunction1(requireOk))
  
    __obj.asInstanceOf[IExtJSCore]
  }
}

