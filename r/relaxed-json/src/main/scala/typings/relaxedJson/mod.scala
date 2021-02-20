package typings.relaxedJson

import typings.relaxedJson.anon.Duplicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("relaxed-json", "parse")
  @js.native
  def parse(text: String): js.Object = js.native
  @JSImport("relaxed-json", "parse")
  @js.native
  def parse(text: String, opts: Duplicate): js.Object = js.native
  @JSImport("relaxed-json", "parse")
  @js.native
  def parse(text: String, reviver: Reviver): js.Object = js.native
  
  @JSImport("relaxed-json", "stringify")
  @js.native
  def stringify(obj: js.Any): String = js.native
  
  @JSImport("relaxed-json", "transform")
  @js.native
  def transform(text: String): String = js.native
  
  type Reviver = js.ThisFunction2[/* this */ js.Object, /* key */ String, /* value */ js.Any, js.Any]
}
