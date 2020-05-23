package typings.relaxedJson

import typings.relaxedJson.anon.Duplicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relaxed-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(text: String): js.Object = js.native
  def parse(text: String, opts: Duplicate): js.Object = js.native
  def parse(text: String, reviver: Reviver): js.Object = js.native
  def stringify(obj: js.Any): String = js.native
  def transform(text: String): String = js.native
  type Reviver = js.ThisFunction2[/* this */ js.Object, /* key */ String, /* value */ js.Any, js.Any]
}

