package typings.pulumiAws.configurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationState extends js.Object {
  /**
    * The ARN of the configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The broker configuration in XML format.
    * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
    * for supported parameters and format of the XML.
    */
  val data: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The type of broker engine.
    */
  val engineType: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the broker engine.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The latest revision of the configuration.
    */
  val latestRevision: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the configuration
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ConfigurationState {
  @scala.inline
  def apply(): ConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationState]
  }
  @scala.inline
  implicit class ConfigurationStateOps[Self <: ConfigurationState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setData(value: Input[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEngineType(value: Input[String]): Self = this.set("engineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineType: Self = this.set("engineType", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setLatestRevision(value: Input[Double]): Self = this.set("latestRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestRevision: Self = this.set("latestRevision", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

