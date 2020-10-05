package typings.rxjs

import typings.rxjs.ajaxObservableMod.AjaxErrorNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxjsStrings {
  @js.native
  sealed trait AjaxError extends AjaxErrorNames
  
  @js.native
  sealed trait AjaxTimeoutError extends AjaxErrorNames
  
  @js.native
  sealed trait C extends js.Object
  
  @js.native
  sealed trait E extends js.Object
  
  @js.native
  sealed trait N extends js.Object
  
  @js.native
  sealed trait arraybuffer extends js.Object
  
  @js.native
  sealed trait blob extends js.Object
  
  @js.native
  sealed trait forkJoin extends js.Object
  
  @scala.inline
  def AjaxError: AjaxError = "AjaxError".asInstanceOf[AjaxError]
  @scala.inline
  def AjaxTimeoutError: AjaxTimeoutError = "AjaxTimeoutError".asInstanceOf[AjaxTimeoutError]
  @scala.inline
  def C: C = "C".asInstanceOf[C]
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def forkJoin: forkJoin = "forkJoin".asInstanceOf[forkJoin]
}

