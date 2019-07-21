package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeysApi extends js.Object {
  def create(body: CreateApiKeyRequest): CreateApiKeyResponse = js.native
  def create(body: CreateApiKeyRequest, callback: RequestCallback): CreateApiKeyResponse = js.native
  def list(): ListApiKeysResponse = js.native
  def list(callback: RequestCallback): ListApiKeysResponse = js.native
  def remove(name: java.lang.String): DeleteApiKeyResponse = js.native
  def remove(name: java.lang.String, callback: RequestCallback): DeleteApiKeyResponse = js.native
}

