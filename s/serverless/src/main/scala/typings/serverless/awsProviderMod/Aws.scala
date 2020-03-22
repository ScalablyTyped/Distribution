package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.AnonRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aws extends js.Object {
  var naming: StringDictionary[js.Function0[String]] = js.native
  def getAccountId(): js.Promise[String] = js.native
  def getProviderName(): String = js.native
  def getRegion(): String = js.native
  def getServerlessDeploymentBucketName(): String = js.native
  def getStage(): String = js.native
  def request(service: String, method: String): js.Promise[_] = js.native
  def request(service: String, method: String, params: js.Object): js.Promise[_] = js.native
  def request(service: String, method: String, params: js.Object, options: AnonRegion): js.Promise[_] = js.native
}

