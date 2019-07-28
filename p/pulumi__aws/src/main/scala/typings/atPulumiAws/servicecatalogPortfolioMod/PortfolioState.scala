package typings.atPulumiAws.servicecatalogPortfolioMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortfolioState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.undefined
  val createdTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * Description of the portfolio
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the portfolio.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the person or organization who owns the portfolio.
    */
  val providerName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object PortfolioState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    createdTime: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    providerName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): PortfolioState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortfolioState]
  }
}

