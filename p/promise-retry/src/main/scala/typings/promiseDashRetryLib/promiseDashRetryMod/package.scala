package typings
package promiseDashRetryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashRetryMod {
  /**
    * A function that is retryable, by having implicitly-bound params for both an error handler and an attempt number.
    *
    * @param retry The retry callback upon any rejection. Essentially throws the error on in the form of a { retried: err }
    * wrapper, and tags it with a 'code' field of value "EPROMISERETRY" so that it is recognised as needing retrying. Call
    * this from the catch() block when you want to retry a rejected attempt.
    * @param attempt The number of the attempt.
    * @returns A Promise for anything (eg. a HTTP response).
    */
  type RetryableFn[ResolutionType] = js.Function2[
    /* retry */ js.Function1[/* error */ js.Any, scala.Nothing], 
    /* attempt */ scala.Double, 
    js.Promise[ResolutionType]
  ]
}
