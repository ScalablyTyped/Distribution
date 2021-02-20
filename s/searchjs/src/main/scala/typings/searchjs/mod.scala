package typings.searchjs

import typings.searchjs.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("searchjs", "matchArray")
  @js.native
  def matchArray(ary: js.Array[_], search: js.Any): js.Any = js.native
  
  @JSImport("searchjs", "matchObject")
  @js.native
  def matchObject(obj: js.Any, search: js.Any): js.Any = js.native
  
  @JSImport("searchjs", "resetDefaults")
  @js.native
  def resetDefaults(): Unit = js.native
  
  @JSImport("searchjs", "setDefaults")
  @js.native
  def setDefaults(options: End): Unit = js.native
  
  @JSImport("searchjs", "singleMatch")
  @js.native
  def singleMatch(field: js.Any, s: js.Any, text: Boolean, word: Boolean, start: Boolean, end: Boolean): js.Any = js.native
}
