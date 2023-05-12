package typings.select2.mod

import typings.select2.anon.Require
import typings.select2.anon.Reset
import typings.select2.mod.global.JQuery
import typings.select2.select2Strings.close
import typings.select2.select2Strings.data
import typings.select2.select2Strings.destroy
import typings.select2.select2Strings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2Plugin[TElement] extends StObject {
  
  def apply(): JQuery[TElement] = js.native
  /**
    * Closes the dropdown
    */
  def apply(method: close): JQuery[TElement] = js.native
  /**
    * Get the data object of the current selection
    */
  def apply(method: data): js.Array[OptionData] = js.native
  /**
    * Reverts changes to DOM done by Select2. Any selection done via Select2 will be preserved.
    */
  def apply(method: destroy): JQuery[TElement] = js.native
  /**
    * Opens the dropdown
    */
  def apply(method: open): JQuery[TElement] = js.native
  // eslint-disable-next-line no-unnecessary-generics
  def apply[Result, RemoteResult](options: Options[Result, RemoteResult]): JQuery[TElement] = js.native
  
  var amd: Require = js.native
  
  var defaults: Reset = js.native
}
