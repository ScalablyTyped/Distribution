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

