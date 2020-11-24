package typings.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait ITextSelection extends js.Object {
  
  def getSelectedText(el: js.Any): String = js.native
  
  def selectText(el: js.Any): Unit = js.native
  def selectText(el: js.Any, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def selectText(el: js.Any, start: Double): Unit = js.native
  def selectText(el: js.Any, start: Double, end: Double): Unit = js.native
}
