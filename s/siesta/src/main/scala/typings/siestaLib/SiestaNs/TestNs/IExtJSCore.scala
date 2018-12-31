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

