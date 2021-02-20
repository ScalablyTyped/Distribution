package typings.sharepoint.global

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object IE8Support {
  
  @JSGlobal("IE8Support.arrayIndexOf")
  @js.native
  def arrayIndexOf[T](array: js.Array[T], item: T): Double = js.native
  @JSGlobal("IE8Support.arrayIndexOf")
  @js.native
  def arrayIndexOf[T](array: js.Array[T], item: T, startIdx: Double): Double = js.native
  
  @JSGlobal("IE8Support.attachDOMContentLoaded")
  @js.native
  def attachDOMContentLoaded(handler: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("IE8Support.getComputedStyle")
  @js.native
  def getComputedStyle(domObj: HTMLElement, camelStyleName: String, dashStyleName: String): String = js.native
  
  @JSGlobal("IE8Support.stopPropagation")
  @js.native
  def stopPropagation(evt: Event): Unit = js.native
}
