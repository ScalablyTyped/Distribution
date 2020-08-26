package typings.senchaTouch.Ext.dataview

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexBar extends IComponent {
  /** [Config Option] (Boolean) */
  var alphabet: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of letters
    * @returns Array
    */
  var getLetters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of listPrefix
    * @returns String
    */
  var getListPrefix: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns true when direction is horizontal  */
  var isHorizontal: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true when direction is vertical  */
  var isVertical: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Array) */
  var letters: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var listPrefix: js.UndefOr[String] = js.native
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of letters
    * @param letters Array The new value.
    */
  var setLetters: js.UndefOr[js.Function1[/* letters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of listPrefix
    * @param listPrefix String The new value.
    */
  var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var store: js.UndefOr[Boolean] = js.native
}

object IIndexBar {
  @scala.inline
  def apply(): IIndexBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndexBar]
  }
  @scala.inline
  implicit class IIndexBarOps[Self <: IIndexBar] (val x: Self) extends AnyVal {
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
    def setAlphabet(value: Boolean): Self = this.set("alphabet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphabet: Self = this.set("alphabet", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    @scala.inline
    def setGetLetters(value: () => Array): Self = this.set("getLetters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLetters: Self = this.set("getLetters", js.undefined)
    @scala.inline
    def setGetListPrefix(value: () => String): Self = this.set("getListPrefix", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetListPrefix: Self = this.set("getListPrefix", js.undefined)
    @scala.inline
    def setIsHorizontal(value: () => Unit): Self = this.set("isHorizontal", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsHorizontal: Self = this.set("isHorizontal", js.undefined)
    @scala.inline
    def setIsVertical(value: () => Unit): Self = this.set("isVertical", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsVertical: Self = this.set("isVertical", js.undefined)
    @scala.inline
    def setItemSelector(value: Boolean): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    @scala.inline
    def setLetters(value: Array): Self = this.set("letters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetters: Self = this.set("letters", js.undefined)
    @scala.inline
    def setListPrefix(value: String): Self = this.set("listPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListPrefix: Self = this.set("listPrefix", js.undefined)
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    @scala.inline
    def setSetLetters(value: /* letters */ js.UndefOr[Array] => Unit): Self = this.set("setLetters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLetters: Self = this.set("setLetters", js.undefined)
    @scala.inline
    def setSetListPrefix(value: /* listPrefix */ js.UndefOr[String] => Unit): Self = this.set("setListPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetListPrefix: Self = this.set("setListPrefix", js.undefined)
    @scala.inline
    def setStore(value: Boolean): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
  
}

