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
    getProviderName: js.Function0[java.lang.String],
    getRegion: js.Function0[java.lang.String],
    getServerlessDeploymentBucketName: js.Function0[java.lang.String],
    getStage: js.Function0[java.lang.String]
  ): Aws = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProviderName")(getProviderName)
    __obj.updateDynamic("getRegion")(getRegion)
    __obj.updateDynamic("getServerlessDeploymentBucketName")(getServerlessDeploymentBucketName)
    __obj.updateDynamic("getStage")(getStage)
    __obj.asInstanceOf[Aws]
  }
}

