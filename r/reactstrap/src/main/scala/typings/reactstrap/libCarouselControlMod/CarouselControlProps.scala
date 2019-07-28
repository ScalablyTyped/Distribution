package typings.reactstrap.libCarouselControlMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.reactstrap.reactstrapMod.CSSModule
import typings.reactstrap.reactstrapStrings.next
import typings.reactstrap.reactstrapStrings.prev
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselControlProps
  extends HTMLProps[HTMLElement]
     with /* s */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var direction: prev | next
  var directionText: String
  def onClickHandler(): Unit
}

object CarouselControlProps {
  @scala.inline
  def apply(
    direction: prev | next,
    directionText: String,
    onClickHandler: () => Unit,
    HTMLProps: HTMLProps[HTMLElement] = null,
    StringDictionary: /* s */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null
  ): CarouselControlProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText, onClickHandler = js.Any.fromFunction0(onClickHandler))
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselControlProps]
  }
}

