package typings.reactLinkify.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: ReactNode = js.native
  /**
    * Custom anchor tag creator
    * Default to using exisint <a> tag with the provided href={decoratedHref}, key={key}
    * and children={decoratedText}, without additional styling
    */
  var componentDecorator: js.UndefOr[
    js.Function3[/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double, ReactNode]
  ] = js.native
  /**
    * Custom href decorator or mapper on the matched (url) href
    * Default to no transformation
    */
  var hrefDecorator: js.UndefOr[js.Function1[/* urlHref */ String, String]] = js.native
  /**
    * Custom matcher for (url), that returns each match with the matching information
    * Default to https://github.com/markdown-it/linkify-it's LinkifyIt().tlds(tlds).match
    */
  var matchDecorator: js.UndefOr[js.Function1[/* text */ String, js.Array[MatchInfo] | Null]] = js.native
  /**
    * Custom text decorator or mapper on the matched (url) text
    * Default to no transformation
    */
  var textDecorator: js.UndefOr[js.Function1[/* urlText */ String, String]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponentDecorator(value: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => ReactNode): Self = this.set("componentDecorator", js.Any.fromFunction3(value))
    @scala.inline
    def deleteComponentDecorator: Self = this.set("componentDecorator", js.undefined)
    @scala.inline
    def setHrefDecorator(value: /* urlHref */ String => String): Self = this.set("hrefDecorator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHrefDecorator: Self = this.set("hrefDecorator", js.undefined)
    @scala.inline
    def setMatchDecorator(value: /* text */ String => js.Array[MatchInfo] | Null): Self = this.set("matchDecorator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatchDecorator: Self = this.set("matchDecorator", js.undefined)
    @scala.inline
    def setTextDecorator(value: /* urlText */ String => String): Self = this.set("textDecorator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTextDecorator: Self = this.set("textDecorator", js.undefined)
  }
  
}

