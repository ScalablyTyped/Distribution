package typings.riot.anon

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes[InitialProps] extends js.Object {
  var attributes: js.UndefOr[js.Array[AttributeExpressionData]] = js.undefined
  var props: js.UndefOr[InitialProps] = js.undefined
  var slots: js.UndefOr[js.Array[SlotBindingData]] = js.undefined
}

object Attributes {
  @scala.inline
  def apply[InitialProps](
    attributes: js.Array[AttributeExpressionData] = null,
    props: InitialProps = null,
    slots: js.Array[SlotBindingData] = null
  ): Attributes[InitialProps] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes[InitialProps]]
  }
}

