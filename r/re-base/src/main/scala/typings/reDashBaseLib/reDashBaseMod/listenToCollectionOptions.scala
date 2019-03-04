package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenToCollectionOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function that receives the created ref as its only argument. You
    * can chain any Firestore queries you want to perform. See
    * [Using Firestore Queries](https://github.com/tylermcginnis/re-base#firestorequeries).
    */
  var query: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Will embed firestore generated document ids inside each document in
    * your collections on the `id` property.
    */
  var withIds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * will embed the DocumentReference inside each document in your
    * collection on the `ref` property.
    */
  var withRefs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback that will be called with the data.
    */
  def `then`(): scala.Unit
}

object listenToCollectionOptions {
  @scala.inline
  def apply(
    context: js.Object,
    `then`: js.Function0[scala.Unit],
    onFailure: js.Function0[scala.Unit] = null,
    query: js.Function0[scala.Unit] = null,
    withIds: js.UndefOr[scala.Boolean] = js.undefined,
    withRefs: js.UndefOr[scala.Boolean] = js.undefined
  ): listenToCollectionOptions = {
    val __obj = js.Dynamic.literal(context = context)
    __obj.updateDynamic("then")(`then`)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(withIds)) __obj.updateDynamic("withIds")(withIds)
    if (!js.isUndefined(withRefs)) __obj.updateDynamic("withRefs")(withRefs)
    __obj.asInstanceOf[listenToCollectionOptions]
  }
}

