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
    Ext: js.Function0[js.Any],
    clickCQ: js.Function3[java.lang.String, js.Any, js.Function, js.Any],
    clickComponentQuery: js.Function3[java.lang.String, js.Any, js.Function, js.Any],
    compositeQuery: js.Function3[java.lang.String, js.Any, scala.Boolean, js.Array[stdLib.HTMLElement]],
    cq: js.Function1[java.lang.String, js.Any],
    cq1: js.Function1[java.lang.String, js.Any],
    getExt: js.Function0[js.Any],
    knownBugIn: js.Function3[java.lang.String, js.Function, java.lang.String, js.Any],
    requireOk: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Ext")(Ext)
    __obj.updateDynamic("clickCQ")(clickCQ)
    __obj.updateDynamic("clickComponentQuery")(clickComponentQuery)
    __obj.updateDynamic("compositeQuery")(compositeQuery)
    __obj.updateDynamic("cq")(cq)
    __obj.updateDynamic("cq1")(cq1)
    __obj.updateDynamic("getExt")(getExt)
    __obj.updateDynamic("knownBugIn")(knownBugIn)
    __obj.updateDynamic("requireOk")(requireOk)
    __obj.asInstanceOf[IExtJSCore]
  }
}

