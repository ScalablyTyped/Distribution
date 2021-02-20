package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait ExtJS
  extends Browser
     with IExtJSAjax
     with IExtJSComponent
     with IExtJSDataView
     with IExtJSElement
     with IExtJSFormField
     with IExtJSGrid
     with IExtJSObservable
     with IExtJSStore
     with IExtJSCore {
  
  def assertMaxNumberOfGlobalExtOverrides(maxNumber: Double, description: js.Any): Unit = js.native
  
  def assertNoGlobalExtOverrides(): Unit = js.native
  def assertNoGlobalExtOverrides(description: String): Unit = js.native
  
  def assertNoLayoutTriggered(fn: js.Function, scope: js.Any): Unit = js.native
  def assertNoLayoutTriggered(fn: js.Function, scope: js.Any, description: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesAtLeastNTimes(observable: js.Any, event: String, n: Double, desc: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesOnce(observable: js.Any, event: String, desc: String): Unit = js.native
  
  def getTotalLayoutCounter(): Double = js.native
  
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: String, callback: js.Function): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(
    observable: js.Any,
    event: String,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def wontFire(observable: js.Any, event: String, desc: String): Unit = js.native
}
