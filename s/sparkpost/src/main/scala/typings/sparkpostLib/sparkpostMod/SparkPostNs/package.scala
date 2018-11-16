package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SparkPostNs {
  type Callback[T] = js.Function2[
    /* err */ nodeLib.Error | SparkPostError | scala.Null, 
    /* res */ Response[T], 
    scala.Unit
  ]
  type Recipient = (RecipientWithAddress | RecipientWithMultichannelAddresses) with BaseRecipient
  type ResultsCallback[T] = Callback[sparkpostLib.Anon_Results[T]]
  type ResultsPromise[T] = stdLib.Promise[sparkpostLib.Anon_Results[T]]
}
