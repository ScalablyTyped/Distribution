package typings
package senecaLib.senecaMod.SNSNs

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
  extends /* fieldname */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def apply(canon: js.Any, seneca: js.Any): scala.Unit = js.native
  @JSName("list$")
  def list$(query: EntityDataWithQuery, callback: EntityListCallback): scala.Unit = js.native
  @JSName("load$")
  def load$(id: DatabaseID, callback: EntityLoadCallback): scala.Unit = js.native
  @JSName("load$")
  def load$(id: EntityDataWithQuery, callback: EntityLoadCallback): scala.Unit = js.native
  // there appear to be many more variants of make$(), but its unclear that they are intended for the public API
  @JSName("make$")
  def make$(): Entity = js.native
  @JSName("make$")
  def make$(base: java.lang.String, name: java.lang.String): Entity = js.native
  @JSName("make$")
  def make$(name: java.lang.String): Entity = js.native
  @JSName("make$")
  def make$(zone: java.lang.String, base: java.lang.String, name: java.lang.String): Entity = js.native
  @JSName("remove$")
  def remove$(id: DatabaseID, callback: EntityRemoveCallback): scala.Unit = js.native
  @JSName("remove$")
  def remove$(id: EntityDataWithQuery, callback: EntityRemoveCallback): scala.Unit = js.native
  @JSName("save$")
  def save$(callback: EntitySaveCallback): scala.Unit = js.native
  @JSName("save$")
  def save$(props: EntityDataWithQuery, callback: EntitySaveCallback): scala.Unit = js.native
}

