package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationsApi extends js.Object {
  def create(body: CreateIntegrationRequest): CreateIntegrationResponse = js.native
  def create(body: CreateIntegrationRequest, callback: RequestCallback): CreateIntegrationResponse = js.native
  def get(integration: java.lang.String): GetIntegrationResponse = js.native
  def get(integration: java.lang.String, callback: RequestCallback): GetIntegrationResponse = js.native
  def list(): ListIntegrationsResponse = js.native
  def list(callback: RequestCallback): ListIntegrationsResponse = js.native
  def remove(integration: java.lang.String): DeleteIntegrationResponse = js.native
  def remove(integration: java.lang.String, callback: RequestCallback): DeleteIntegrationResponse = js.native
}

