package typings.rmcTabs

import typings.rmcTabs.anon.MozTransform
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def getPxStyle(value: String): String = js.native
  def getPxStyle(value: String, unit: String): String = js.native
  def getPxStyle(value: String, unit: String, vertical: Boolean): String = js.native
  def getPxStyle(value: Double): String = js.native
  def getPxStyle(value: Double, unit: String): String = js.native
  def getPxStyle(value: Double, unit: String, vertical: Boolean): String = js.native
  def getTransformPropValue(v: js.Any): MozTransform = js.native
  def setPxStyle(el: HTMLElement, value: String): Unit = js.native
  def setPxStyle(el: HTMLElement, value: String, unit: String): Unit = js.native
  def setPxStyle(el: HTMLElement, value: String, unit: String, vertical: Boolean): Unit = js.native
  def setPxStyle(el: HTMLElement, value: String, unit: String, vertical: Boolean, useLeft: Boolean): Unit = js.native
  def setPxStyle(el: HTMLElement, value: Double): Unit = js.native
  def setPxStyle(el: HTMLElement, value: Double, unit: String): Unit = js.native
  def setPxStyle(el: HTMLElement, value: Double, unit: String, vertical: Boolean): Unit = js.native
  def setPxStyle(el: HTMLElement, value: Double, unit: String, vertical: Boolean, useLeft: Boolean): Unit = js.native
  def setTransform(style: js.Any, v: js.Any): Unit = js.native
}

