package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait getOptions extends js.Object {
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
}

