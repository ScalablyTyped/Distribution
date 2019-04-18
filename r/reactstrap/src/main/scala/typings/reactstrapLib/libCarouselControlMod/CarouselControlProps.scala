package typings
package reactstrapLib.libCarouselControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselControlProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* s */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var direction: reactstrapLib.reactstrapLibStrings.prev | reactstrapLib.reactstrapLibStrings.next
  var directionText: java.lang.String
  def onClickHandler(): scala.Unit
}

object CarouselControlProps {
  @scala.inline
  def apply(
    direction: reactstrapLib.reactstrapLibStrings.prev | reactstrapLib.reactstrapLibStrings.next,
    directionText: java.lang.String,
    onClickHandler: () => scala.Unit,
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* s */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null
  ): CarouselControlProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText, onClickHandler = js.Any.fromFunction0(onClickHandler))
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselControlProps]
  }
}

