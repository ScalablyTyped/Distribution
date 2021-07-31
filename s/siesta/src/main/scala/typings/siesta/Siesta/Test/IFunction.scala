package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IFunction extends StObject {
  
  def isCalled(fn: String, host: js.Any, desc: String): Unit = js.native
  def isCalled(fn: js.Function, host: js.Any, desc: String): Unit = js.native
  
  def isCalledNTimes(fn: String, host: js.Any, n: Double, desc: String): Unit = js.native
  def isCalledNTimes(fn: js.Function, host: js.Any, n: Double, desc: String): Unit = js.native
  
  def isCalledOnce(fn: String, host: js.Any, desc: String): Unit = js.native
  def isCalledOnce(fn: js.Function, host: js.Any, desc: String): Unit = js.native
  
  def isntCalled(fn: String, host: js.Any, n: Double, desc: String): Unit = js.native
  def isntCalled(fn: js.Function, host: js.Any, n: Double, desc: String): Unit = js.native
  
  def methodIsCalled(fn: String, className: String, desc: String): Unit = js.native
  def methodIsCalled(fn: String, className: js.Function, desc: String): Unit = js.native
  def methodIsCalled(fn: js.Function, className: String, desc: String): Unit = js.native
  def methodIsCalled(fn: js.Function, className: js.Function, desc: String): Unit = js.native
  
  def methodIsCalledNTimes(fn: String, className: String, n: Double, desc: String): Unit = js.native
  def methodIsCalledNTimes(fn: String, className: js.Function, n: Double, desc: String): Unit = js.native
  def methodIsCalledNTimes(fn: js.Function, className: String, n: Double, desc: String): Unit = js.native
  def methodIsCalledNTimes(fn: js.Function, className: js.Function, n: Double, desc: String): Unit = js.native
  
  def methodIsntCalled(fn: String, className: String, desc: String): Unit = js.native
  def methodIsntCalled(fn: String, className: js.Function, desc: String): Unit = js.native
  def methodIsntCalled(fn: js.Function, className: String, desc: String): Unit = js.native
  def methodIsntCalled(fn: js.Function, className: js.Function, desc: String): Unit = js.native
}
