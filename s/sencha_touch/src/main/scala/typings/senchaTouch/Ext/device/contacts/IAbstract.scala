package typings.senchaTouch.Ext.device.contacts

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IObservable {
  /** [Method] Returns an Array of contact objects
    * @param config Object
    * @returns Object[] An array of contact objects.
    */
  var getContacts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Returns the value of includeImages
    * @returns Boolean
    */
  var getIncludeImages: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns localized user readable label for a contact field i e
    * @param config Object
    * @returns String user readable string
    */
  var getLocalizedLabel: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
    * @param config Object
    * @returns String base64 string
    */
  var getThumbnail: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], String]] = js.native
  /** [Config Option] (Boolean) */
  var includeImages: js.UndefOr[Boolean] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of includeImages
    * @param includeImages Boolean The new value.
    */
  var setIncludeImages: js.UndefOr[js.Function1[/* includeImages */ js.UndefOr[Boolean], Unit]] = js.native
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
    def setGetContacts(value: /* config */ js.UndefOr[js.Any] => Array): Self = this.set("getContacts", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetContacts: Self = this.set("getContacts", js.undefined)
    @scala.inline
    def setGetIncludeImages(value: () => Boolean): Self = this.set("getIncludeImages", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIncludeImages: Self = this.set("getIncludeImages", js.undefined)
    @scala.inline
    def setGetLocalizedLabel(value: /* config */ js.UndefOr[js.Any] => String): Self = this.set("getLocalizedLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetLocalizedLabel: Self = this.set("getLocalizedLabel", js.undefined)
    @scala.inline
    def setGetThumbnail(value: /* config */ js.UndefOr[js.Any] => String): Self = this.set("getThumbnail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetThumbnail: Self = this.set("getThumbnail", js.undefined)
    @scala.inline
    def setIncludeImages(value: Boolean): Self = this.set("includeImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeImages: Self = this.set("includeImages", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setSetIncludeImages(value: /* includeImages */ js.UndefOr[Boolean] => Unit): Self = this.set("setIncludeImages", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIncludeImages: Self = this.set("setIncludeImages", js.undefined)
  }
  
}

