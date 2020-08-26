package typings.pulumiAws.aliasMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the alias.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the fleet and/or routing type to use for the alias.
    */
  val routingStrategy: Input[AliasRoutingStrategy] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object AliasArgs {
  @scala.inline
  def apply(routingStrategy: Input[AliasRoutingStrategy]): AliasArgs = {
    val __obj = js.Dynamic.literal(routingStrategy = routingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
  @scala.inline
  implicit class AliasArgsOps[Self <: AliasArgs] (val x: Self) extends AnyVal {
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
    def setRoutingStrategy(value: Input[AliasRoutingStrategy]): Self = this.set("routingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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

