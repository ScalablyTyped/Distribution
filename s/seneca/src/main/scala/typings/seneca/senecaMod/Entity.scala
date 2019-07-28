package typings.seneca.senecaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: senecas documented use of:
//    var product = seneca.make('product')
//    product.name = 'Apple'
// causes this error: error TS2339: Property 'name' does not exist on type 'Entity'.
// Change such references to: product['name']
@js.native
trait Entity
  extends /* fieldname */ StringDictionary[js.Any] {
  def apply(canon: js.Any, seneca: js.Any): Unit = js.native
  @JSName("list$")
  def list$(query: EntityDataWithQuery, callback: EntityListCallback): Unit = js.native
  @JSName("load$")
  def load$(id: DatabaseID, callback: EntityLoadCallback): Unit = js.native
  @JSName("load$")
  def load$(id: EntityDataWithQuery, callback: EntityLoadCallback): Unit = js.native
  // there appear to be many more variants of make$(), but its unclear that they are intended for the public API
  @JSName("make$")
  def make$(): Entity = js.native
  @JSName("make$")
  def make$(base: String, name: String): Entity = js.native
  @JSName("make$")
  def make$(name: String): Entity = js.native
  @JSName("make$")
  def make$(zone: String, base: String, name: String): Entity = js.native
  @JSName("remove$")
  def remove$(id: DatabaseID, callback: EntityRemoveCallback): Unit = js.native
  @JSName("remove$")
  def remove$(id: EntityDataWithQuery, callback: EntityRemoveCallback): Unit = js.native
  @JSName("save$")
  def save$(callback: EntitySaveCallback): Unit = js.native
  @JSName("save$")
  def save$(props: EntityDataWithQuery, callback: EntitySaveCallback): Unit = js.native
}

