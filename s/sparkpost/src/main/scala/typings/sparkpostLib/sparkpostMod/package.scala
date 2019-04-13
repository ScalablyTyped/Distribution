package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparkpostMod {
  type Callback[T] = js.Function2[
    /* err */ stdLib.Error | SparkPostError | scala.Null, 
    /* res */ Response[T], 
    scala.Unit
  ]
  type Recipient = (RecipientWithAddress | RecipientWithMultichannelAddresses) with BaseRecipient
  type ResultsCallback[T] = Callback[sparkpostLib.Anon_Results[T]]
  type ResultsPromise[T] = js.Promise[sparkpostLib.Anon_Results[T]]
}
