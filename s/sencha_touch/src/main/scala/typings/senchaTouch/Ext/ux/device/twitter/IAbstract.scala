package typings.senchaTouch.Ext.ux.device.twitter

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Pops up a Twitter compose sheet view with your specified tweet
    * @param config Object An object which contains the following config options:
    */
  var compose: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets Tweets from Twitter Mentions
    * @param config Object An object which contains the following config options:
    */
  var getMentions: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets Tweets from Twitter Timeline
    * @param config Object An object which contains the following config options:
    */
  var getPublicTimeline: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets a specific Twitter user info
    * @param config Object An object which contains the following config options:
    */
  var getTwitterRequest: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets a specific Twitter user info
    * @param config Object An object which contains the following config options:
    */
  var getTwitterUsername: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setCompose(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("compose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompose: Self = this.set("compose", js.undefined)
    @scala.inline
    def setGetMentions(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getMentions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetMentions: Self = this.set("getMentions", js.undefined)
    @scala.inline
    def setGetPublicTimeline(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getPublicTimeline", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPublicTimeline: Self = this.set("getPublicTimeline", js.undefined)
    @scala.inline
    def setGetTwitterRequest(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getTwitterRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTwitterRequest: Self = this.set("getTwitterRequest", js.undefined)
    @scala.inline
    def setGetTwitterUsername(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getTwitterUsername", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTwitterUsername: Self = this.set("getTwitterUsername", js.undefined)
  }
  
}

