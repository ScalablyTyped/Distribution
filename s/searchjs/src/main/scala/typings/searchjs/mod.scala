package typings.searchjs

import typings.searchjs.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("searchjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def matchArray(ary: js.Array[_], search: js.Any): js.Any = js.native
  
  def matchObject(obj: js.Any, search: js.Any): js.Any = js.native
  
  def resetDefaults(): Unit = js.native
  
  def setDefaults(options: End): Unit = js.native
  
  def singleMatch(field: js.Any, s: js.Any, text: Boolean, word: Boolean, start: Boolean, end: Boolean): js.Any = js.native
}
