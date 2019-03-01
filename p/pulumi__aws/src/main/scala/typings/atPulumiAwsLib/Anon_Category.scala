package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: java.lang.String
  var configuration: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var inputArtifacts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var outputArtifacts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var owner: java.lang.String
  var provider: java.lang.String
  var roleArn: js.UndefOr[java.lang.String] = js.undefined
  var runOrder: scala.Double
  var version: java.lang.String
}

object Anon_Category {
  @scala.inline
  def apply(
    category: java.lang.String,
    name: java.lang.String,
    owner: java.lang.String,
    provider: java.lang.String,
    runOrder: scala.Double,
    version: java.lang.String,
    configuration: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    inputArtifacts: js.Array[java.lang.String] = null,
    outputArtifacts: js.Array[java.lang.String] = null,
    roleArn: java.lang.String = null
  ): Anon_Category = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("runOrder")(runOrder)
    __obj.updateDynamic("version")(version)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts)
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_Category]
  }
}

