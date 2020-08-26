package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait getOptions extends js.Object {
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Will embed firestore generated document ids inside each document in
    * your collections on the `id` property.
    */
  var withIds: js.UndefOr[Boolean] = js.native
  /**
    * will embed the DocumentReference inside each document in your
    * collection on the `ref` property.
    */
  var withRefs: js.UndefOr[Boolean] = js.native
}

object getOptions {
  @scala.inline
  def apply(): getOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[getOptions]
  }
  @scala.inline
  implicit class getOptionsOps[Self <: getOptions] (val x: Self) extends AnyVal {
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
    def setQuery(value: () => Unit): Self = this.set("query", js.Any.fromFunction0(value))
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setWithIds(value: Boolean): Self = this.set("withIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithIds: Self = this.set("withIds", js.undefined)
    @scala.inline
    def setWithRefs(value: Boolean): Self = this.set("withRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithRefs: Self = this.set("withRefs", js.undefined)
  }
  
}

