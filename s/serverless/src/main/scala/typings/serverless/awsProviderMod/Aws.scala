package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aws extends StObject {
  
  def getAccountId(): js.Promise[String] = js.native
  
  def getProviderName(): String = js.native
  
  def getRegion(): String = js.native
  
  def getServerlessDeploymentBucketName(): String = js.native
  
  def getStage(): String = js.native
  
  var naming: StringDictionary[js.Function0[String]] = js.native
  
  def request(service: String, method: String): js.Promise[_] = js.native
  def request(service: String, method: String, params: js.UndefOr[scala.Nothing], options: Region): js.Promise[_] = js.native
  def request(service: String, method: String, params: js.Object): js.Promise[_] = js.native
  def request(service: String, method: String, params: js.Object, options: Region): js.Promise[_] = js.native
}
