package typings
package serverlessLib.pluginsAwsProviderAwsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aws extends js.Object {
  def getProviderName(): java.lang.String
  def getRegion(): java.lang.String
  def getServerlessDeploymentBucketName(): java.lang.String
  def getStage(): java.lang.String
}

object Aws {
  @scala.inline
  def apply(
    getProviderName: () => java.lang.String,
    getRegion: () => java.lang.String,
    getServerlessDeploymentBucketName: () => java.lang.String,
    getStage: () => java.lang.String
  ): Aws = {
    val __obj = js.Dynamic.literal(getProviderName = js.Any.fromFunction0(getProviderName), getRegion = js.Any.fromFunction0(getRegion), getServerlessDeploymentBucketName = js.Any.fromFunction0(getServerlessDeploymentBucketName), getStage = js.Any.fromFunction0(getStage))
  
    __obj.asInstanceOf[Aws]
  }
}

