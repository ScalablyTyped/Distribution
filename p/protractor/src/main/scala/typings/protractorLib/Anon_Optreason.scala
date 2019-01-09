package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Optreason
  extends org.scalablytyped.runtime.Instantiable1[
      /* resolver */ js.Function2[
        /* resolve */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IFulfilledCallback[js.Object], 
        /* reject */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IRejectedCallback, 
        scala.Unit
      ], 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Object]
    ] {
  /**
    * Creates a promise that is immediately rejected with the given reason.
    *
    * @param {*=} opt_reason The rejection reason.
    * @return {!ManagedPromise<?>} A new rejected promise.
    */
  def reject(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Nothing] = js.native
  def reject(opt_reason: js.Any): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Nothing] = js.native
  /**
    * Creates a promise that is immediately resolved with the given value.
    *
    * @param {T=} opt_value The value to resolve.
    * @return {!ManagedPromise<T>} A promise resolved with the given value.
    * @template T
    */
  def resolve[T](): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  def resolve[T](opt_value: T): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
}

