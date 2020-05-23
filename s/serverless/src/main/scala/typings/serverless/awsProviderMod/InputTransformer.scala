package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTransformer extends js.Object {
  var inputPathsMap: StringDictionary[String]
  var inputTemplate: String
}

object InputTransformer {
  @scala.inline
  def apply(inputPathsMap: StringDictionary[String], inputTemplate: String): InputTransformer = {
    val __obj = js.Dynamic.literal(inputPathsMap = inputPathsMap.asInstanceOf[js.Any], inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransformer]
  }
}

