package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingConfig extends js.Object {
  /**
    * A map that defines the proportion of events that should be sent to different versions of a lambda function.
    */
  var additionalVersionWeights: js.UndefOr[StringDictionary[Double]] = js.native
}

object AliasRoutingConfig {
  @scala.inline
  def apply(): AliasRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfig]
  }
  @scala.inline
  implicit class AliasRoutingConfigOps[Self <: AliasRoutingConfig] (val x: Self) extends AnyVal {
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
    def setAdditionalVersionWeights(value: StringDictionary[Double]): Self = this.set("additionalVersionWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalVersionWeights: Self = this.set("additionalVersionWeights", js.undefined)
  }
  
}

