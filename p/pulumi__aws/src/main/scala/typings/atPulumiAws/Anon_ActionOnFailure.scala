package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnFailure extends js.Object {
  var actionOnFailure: String
  var hadoopJarStep: Anon_ArgsJar
  var name: String
}

object Anon_ActionOnFailure {
  @scala.inline
  def apply(actionOnFailure: String, hadoopJarStep: Anon_ArgsJar, name: String): Anon_ActionOnFailure = {
    val __obj = js.Dynamic.literal(actionOnFailure = actionOnFailure, hadoopJarStep = hadoopJarStep, name = name)
  
    __obj.asInstanceOf[Anon_ActionOnFailure]
  }
}

