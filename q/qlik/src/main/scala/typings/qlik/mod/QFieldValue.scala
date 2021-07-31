package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFieldValue extends StObject {
  
  var qElemNumber: Double = js.native
  
  var qFrequency: js.UndefOr[String] = js.native
  
  // TODO
  var qNum: js.UndefOr[String] = js.native
  
  var qState: js.Any = js.native
  
  var qText: String = js.native
  
  def select(): js.Promise[js.Any] = js.native
  def select(toggle: Boolean): js.Promise[js.Any] = js.native
  def select(toggle: Boolean, softlock: Boolean): js.Promise[js.Any] = js.native
  def select(toggle: Unit, softlock: Boolean): js.Promise[js.Any] = js.native
}
