package typings.sharepoint.global

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object IE8Support {
  
  @JSGlobal("IE8Support")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayIndexOf[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def arrayIndexOf[T](array: js.Array[T], item: T, startIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def attachDOMContentLoaded(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachDOMContentLoaded")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getComputedStyle(domObj: HTMLElement, camelStyleName: String, dashStyleName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(domObj.asInstanceOf[js.Any], camelStyleName.asInstanceOf[js.Any], dashStyleName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stopPropagation(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
