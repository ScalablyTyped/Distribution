package typings.pulumiAws.namedQueryMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedQueryState extends js.Object {
  /**
    * The database to which the query belongs.
    */
  val database: js.UndefOr[Input[String]] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: js.UndefOr[Input[String]] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: js.UndefOr[Input[String]] = js.native
}

object NamedQueryState {
  @scala.inline
  def apply(): NamedQueryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedQueryState]
  }
  @scala.inline
  implicit class NamedQueryStateOps[Self <: NamedQueryState] (val x: Self) extends AnyVal {
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
    def setDatabase(value: Input[String]): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQuery(value: Input[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setWorkgroup(value: Input[String]): Self = this.set("workgroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkgroup: Self = this.set("workgroup", js.undefined)
  }
  
}

