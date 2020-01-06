package typings.atPulumiAws.ssmParameterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.String
  - typings.atPulumiAws.atPulumiAwsStrings.StringList
  - typings.atPulumiAws.atPulumiAwsStrings.SecureString
*/
trait ParameterType extends js.Object

object ParameterType {
  @scala.inline
  def SecureString: typings.atPulumiAws.atPulumiAwsStrings.SecureString = this.cast("SecureString")
  @scala.inline
  def String: typings.atPulumiAws.atPulumiAwsStrings.String = this.cast("String")
  @scala.inline
  def StringList: typings.atPulumiAws.atPulumiAwsStrings.StringList = this.cast("StringList")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

