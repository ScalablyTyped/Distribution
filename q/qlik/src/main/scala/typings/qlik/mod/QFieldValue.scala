package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFieldValue extends js.Object {
  
  var qElemNumber: Double = js.native
  
  var qFrequency: js.UndefOr[String] = js.native
  
   // TODO
  var qNum: js.UndefOr[String] = js.native
  
  var qState: js.Any = js.native
  
  var qText: String = js.native
  
  def select(): js.Promise[_] = js.native
  def select(toggle: js.UndefOr[scala.Nothing], softlock: Boolean): js.Promise[_] = js.native
  def select(toggle: Boolean): js.Promise[_] = js.native
  def select(toggle: Boolean, softlock: Boolean): js.Promise[_] = js.native
}
