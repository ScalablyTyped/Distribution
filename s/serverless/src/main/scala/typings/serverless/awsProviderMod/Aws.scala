package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aws extends js.Object {
  var naming: StringDictionary[js.Function0[String]]
  def getProviderName(): String
  def getRegion(): String
  def getServerlessDeploymentBucketName(): String
  def getStage(): String
}

object Aws {
  @scala.inline
  def apply(
    getProviderName: () => String,
    getRegion: () => String,
    getServerlessDeploymentBucketName: () => String,
    getStage: () => String,
    naming: StringDictionary[js.Function0[String]]
  ): Aws = {
    val __obj = js.Dynamic.literal(getProviderName = js.Any.fromFunction0(getProviderName), getRegion = js.Any.fromFunction0(getRegion), getServerlessDeploymentBucketName = js.Any.fromFunction0(getServerlessDeploymentBucketName), getStage = js.Any.fromFunction0(getStage), naming = naming.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aws]
  }
}

