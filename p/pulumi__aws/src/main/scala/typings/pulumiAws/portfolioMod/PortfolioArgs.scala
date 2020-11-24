package typings.pulumiAws.portfolioMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortfolioArgs extends js.Object {
  
  /**
    * Description of the portfolio
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the portfolio.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the person or organization who owns the portfolio.
    */
  val providerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object PortfolioArgs {
  
  @scala.inline
  def apply(): PortfolioArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortfolioArgs]
  }
  
  @scala.inline
  implicit class PortfolioArgsOps[Self <: PortfolioArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProviderName(value: Input[String]): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
