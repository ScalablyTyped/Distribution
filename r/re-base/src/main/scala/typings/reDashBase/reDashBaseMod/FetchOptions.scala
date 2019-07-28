package typings.reDashBase.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[Boolean] = js.undefined
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * The callback function that will be invoked with an error that occurs
    * reading data from the specified endpoint.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  /**
    * The callback function that will be invoked with the data from the
    * specified endpoint when the endpoint changes.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    context: js.Object,
    asArray: js.UndefOr[Boolean] = js.undefined,
    onFailure: () => Unit = null,
    queries: js.Object = null,
    `then`: /* result */ js.Any => Unit = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal(context = context)
    if (!js.isUndefined(asArray)) __obj.updateDynamic("asArray")(asArray)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction0(onFailure))
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[FetchOptions]
  }
}

