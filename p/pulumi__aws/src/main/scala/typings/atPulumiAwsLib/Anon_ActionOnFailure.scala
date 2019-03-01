package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnFailure extends js.Object {
  var actionOnFailure: java.lang.String
  var hadoopJarStep: Anon_ArgsJar
  var name: java.lang.String
}

object Anon_ActionOnFailure {
  @scala.inline
  def apply(actionOnFailure: java.lang.String, hadoopJarStep: Anon_ArgsJar, name: java.lang.String): Anon_ActionOnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionOnFailure")(actionOnFailure)
    __obj.updateDynamic("hadoopJarStep")(hadoopJarStep)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_ActionOnFailure]
  }
}

