package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionsApi extends js.Object {
  def create(workspace: java.lang.String, body: CreateCollectionRequest): CreateCollectionResponse = js.native
  def create(workspace: java.lang.String, body: CreateCollectionRequest, callback: RequestCallback): CreateCollectionResponse = js.native
  def get(workspace: java.lang.String, collection: java.lang.String): GetCollectionResponse = js.native
  def get(workspace: java.lang.String, collection: java.lang.String, callback: RequestCallback): GetCollectionResponse = js.native
  def list(): ListCollectionsResponse = js.native
  def list(callback: RequestCallback): ListCollectionsResponse = js.native
  def remove(workspace: java.lang.String, collection: java.lang.String): DeleteCollectionResponse = js.native
  def remove(workspace: java.lang.String, collection: java.lang.String, callback: RequestCallback): DeleteCollectionResponse = js.native
  def workspace(workspace: java.lang.String): ListCollectionsResponse = js.native
  def workspace(workspace: java.lang.String, callback: RequestCallback): ListCollectionsResponse = js.native
}

