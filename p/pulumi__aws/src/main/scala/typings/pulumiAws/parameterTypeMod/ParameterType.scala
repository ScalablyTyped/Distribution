package typings.pulumiAws.parameterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.String
  - typings.pulumiAws.pulumiAwsStrings.StringList
  - typings.pulumiAws.pulumiAwsStrings.SecureString
*/
trait ParameterType extends js.Object

object ParameterType {
  @scala.inline
  def SecureString: typings.pulumiAws.pulumiAwsStrings.SecureString = this.cast("SecureString")
  @scala.inline
  def String: typings.pulumiAws.pulumiAwsStrings.String = this.cast("String")
  @scala.inline
  def StringList: typings.pulumiAws.pulumiAwsStrings.StringList = this.cast("StringList")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

