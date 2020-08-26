package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait listenToCollectionOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object = js.native
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.native
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
  /**
    * A callback that will be called with the data.
    */
  def `then`(): Unit = js.native
}

object listenToCollectionOptions {
  @scala.inline
  def apply(context: js.Object, `then`: () => Unit): listenToCollectionOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[listenToCollectionOptions]
  }
  @scala.inline
  implicit class listenToCollectionOptionsOps[Self <: listenToCollectionOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setThen(value: () => Unit): Self = this.set("then", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFailure(value: () => Unit): Self = this.set("onFailure", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
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

