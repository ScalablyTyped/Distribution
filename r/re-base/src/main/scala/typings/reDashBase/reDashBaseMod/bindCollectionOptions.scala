package typings.reDashBase.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bindCollectionOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The state property to bind the collection to.
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Will embed firestore generated document ids inside each document in
    * your collections on the `id` property.
    */
  var withIds: js.UndefOr[Boolean] = js.undefined
  /**
    * will embed the DocumentReference inside each document in your
    * collection on the `ref` property.
    */
  var withRefs: js.UndefOr[Boolean] = js.undefined
}

object bindCollectionOptions {
  @scala.inline
  def apply(
    context: js.Object,
    onFailure: () => Unit = null,
    query: () => Unit = null,
    state: String = null,
    `then`: () => Unit = null,
    withIds: js.UndefOr[Boolean] = js.undefined,
    withRefs: js.UndefOr[Boolean] = js.undefined
  ): bindCollectionOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction0(onFailure))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction0(query))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    if (!js.isUndefined(withIds)) __obj.updateDynamic("withIds")(withIds.asInstanceOf[js.Any])
    if (!js.isUndefined(withRefs)) __obj.updateDynamic("withRefs")(withRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[bindCollectionOptions]
  }
}

