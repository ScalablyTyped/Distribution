package typings.rxjsCompat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @typedef {Object} Rx.Symbol
  * @property {Symbol|string} rxSubscriber A symbol to use as a property name to
  * retrieve an "Rx safe" Observer from an object. "Rx safety" can be defined as
  * an object that has all of the traits of an Rx Subscriber, including the
  * ability to add and remove subscriptions to the subscription chain and
  * guarantees involving event triggering (can't "next" after unsubscription,
  * etc).
  * @property {Symbol|string} observable A symbol to use as a property name to
  * retrieve an Observable as defined by the [ECMAScript "Observable" spec](https://github.com/zenparsing/es-observable).
  * @property {Symbol|string} iterator The ES6 symbol to use as a property name
  * to retrieve an iterator from an object.
  */
@JSImport("rxjs-compat", "Symbol")
@js.native
object Symbol extends js.Object {
  var iterator: js.Symbol = js.native
  var observable: String | js.Symbol = js.native
  var rxSubscriber: String | js.Symbol = js.native
}

