package typings.atPulumiAws.servicecatalogPortfolioMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortfolioArgs extends js.Object {
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

object PortfolioArgs {
  @scala.inline
  def apply(
    description: Input[String] = null,
    name: Input[String] = null,
    providerName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): PortfolioArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortfolioArgs]
  }
}

