package typings.reactDashLinkify.reactDashLinkifyMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * Custom anchor tag creator
    * Default to using exisint <a> tag with the provided href={decoratedHref}, key={key}
    * and children={decoratedText}, without additional styling
    */
  var componentDecorator: js.UndefOr[
    js.Function3[/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double, ReactNode]
  ] = js.undefined
  /**
    * Custom href decorator or mapper on the matched (url) href
    * Default to no transformation
    */
  var hrefDecorator: js.UndefOr[js.Function1[/* urlHref */ String, String]] = js.undefined
  /**
    * Custom matcher for (url), that returns each match with the matching information
    * Default to https://github.com/markdown-it/linkify-it's LinkifyIt().tlds(tlds).match
    */
  var matchDecorator: js.UndefOr[js.Function1[/* text */ String, js.Array[MatchInfo] | Null]] = js.undefined
  /**
    * Custom text decorator or mapper on the matched (url) text
    * Default to no transformation
    */
  var textDecorator: js.UndefOr[js.Function1[/* urlText */ String, String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    componentDecorator: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => ReactNode = null,
    hrefDecorator: /* urlHref */ String => String = null,
    matchDecorator: /* text */ String => js.Array[MatchInfo] | Null = null,
    textDecorator: /* urlText */ String => String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentDecorator != null) __obj.updateDynamic("componentDecorator")(js.Any.fromFunction3(componentDecorator))
    if (hrefDecorator != null) __obj.updateDynamic("hrefDecorator")(js.Any.fromFunction1(hrefDecorator))
    if (matchDecorator != null) __obj.updateDynamic("matchDecorator")(js.Any.fromFunction1(matchDecorator))
    if (textDecorator != null) __obj.updateDynamic("textDecorator")(js.Any.fromFunction1(textDecorator))
    __obj.asInstanceOf[Props]
  }
}

