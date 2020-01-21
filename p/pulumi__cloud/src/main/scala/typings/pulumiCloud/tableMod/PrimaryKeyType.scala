package typings.pulumiCloud.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiCloud.pulumiCloudStrings.string
  - typings.pulumiCloud.pulumiCloudStrings.number
  - typings.pulumiCloud.pulumiCloudStrings.boolean
*/
trait PrimaryKeyType extends js.Object

object PrimaryKeyType {
  @scala.inline
  def boolean: typings.pulumiCloud.pulumiCloudStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.pulumiCloud.pulumiCloudStrings.number = this.cast("number")
  @scala.inline
  def string: typings.pulumiCloud.pulumiCloudStrings.string = this.cast("string")
}

