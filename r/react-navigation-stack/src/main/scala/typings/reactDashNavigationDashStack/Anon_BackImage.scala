package typings.reactDashNavigationDashStack

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNavigationDashStack.libTypescriptViewsHeaderBackButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackImage extends js.Object {
  var backImage: js.Function1[/* hasTintColor */ Props, Element]
  var pressColorAndroid: String
  var tintColor: String
  var truncatedTitle: String
}

object Anon_BackImage {
  @scala.inline
  def apply(
    backImage: /* hasTintColor */ Props => Element,
    pressColorAndroid: String,
    tintColor: String,
    truncatedTitle: String
  ): Anon_BackImage = {
    val __obj = js.Dynamic.literal(backImage = js.Any.fromFunction1(backImage), pressColorAndroid = pressColorAndroid.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackImage]
  }
}

