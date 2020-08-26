package typings.pulumiAws.getSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionStackArgs extends js.Object {
  /**
    * If more than one result is returned, use the most
    * recent solution stack.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * A regex string to apply to the solution stack list returned
    * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
    * AWS documentation for reference solution stack names.
    */
  val nameRegex: String = js.native
}

object GetSolutionStackArgs {
  @scala.inline
  def apply(nameRegex: String): GetSolutionStackArgs = {
    val __obj = js.Dynamic.literal(nameRegex = nameRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionStackArgs]
  }
  @scala.inline
  implicit class GetSolutionStackArgsOps[Self <: GetSolutionStackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNameRegex(value: String): Self = this.set("nameRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
  }
  
}

