package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparkpostMod {
  import typings.sparkpost.Anon_Results
  import typings.std.Error

  type Callback[T] = js.Function2[/* err */ Error | SparkPostError | Null, /* res */ Response[T], Unit]
  type Recipient = (RecipientWithAddress | RecipientWithMultichannelAddresses) with BaseRecipient
  type ResultsCallback[T] = Callback[Anon_Results[T]]
  type ResultsPromise[T] = js.Promise[Anon_Results[T]]
}
