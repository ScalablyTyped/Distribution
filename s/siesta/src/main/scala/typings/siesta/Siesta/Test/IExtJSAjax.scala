package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IExtJSAjax extends StObject {
  
  def ajaxRequestAndThen(url: String, callback: js.Function, scope: js.Any): Unit = js.native
  
  def isAjaxLoading(): Unit = js.native
  def isAjaxLoading(`object`: js.Any): Unit = js.native
  def isAjaxLoading(`object`: js.Any, description: String): Unit = js.native
  def isAjaxLoading(`object`: Unit, description: String): Unit = js.native
  
  def waitForAjaxRequest(callback: js.Function): Unit = js.native
  def waitForAjaxRequest(callback: js.Function, scope: js.Any): Unit = js.native
  def waitForAjaxRequest(callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForAjaxRequest(callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  def waitForAjaxRequest(`object`: js.Any, callback: js.Function): Unit = js.native
  def waitForAjaxRequest(`object`: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForAjaxRequest(`object`: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForAjaxRequest(`object`: js.Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
}
