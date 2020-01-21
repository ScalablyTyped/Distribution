package typings.reactNavigationStack

import typings.react.mod._Global_.JSX.Element
import typings.reactNavigationStack.backButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackImage extends js.Object {
  var backImage: js.Function1[/* hasTintColor */ Props, Element]
  var pressColorAndroid: String
  var tintColor: String
  var truncatedTitle: String
}

object AnonBackImage {
  @scala.inline
  def apply(
    backImage: /* hasTintColor */ Props => Element,
    pressColorAndroid: String,
    tintColor: String,
    truncatedTitle: String
  ): AnonBackImage = {
    val __obj = js.Dynamic.literal(backImage = js.Any.fromFunction1(backImage), pressColorAndroid = pressColorAndroid.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackImage]
  }
}

