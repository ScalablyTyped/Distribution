package typings.serverless.pluginsAwsProviderAwsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aws extends js.Object {
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
    getStage: () => String
  ): Aws = {
    val __obj = js.Dynamic.literal(getProviderName = js.Any.fromFunction0(getProviderName), getRegion = js.Any.fromFunction0(getRegion), getServerlessDeploymentBucketName = js.Any.fromFunction0(getServerlessDeploymentBucketName), getStage = js.Any.fromFunction0(getStage))
  
    __obj.asInstanceOf[Aws]
  }
}

