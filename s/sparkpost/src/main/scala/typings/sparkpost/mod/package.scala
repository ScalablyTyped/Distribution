package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[
    /* err */ typings.std.Error | typings.sparkpost.mod.SparkPostError | scala.Null, 
    /* res */ typings.sparkpost.mod.Response[T], 
    scala.Unit
  ]
  type Recipient = (typings.sparkpost.mod.RecipientWithAddress | typings.sparkpost.mod.RecipientWithMultichannelAddresses) with typings.sparkpost.mod.BaseRecipient
  type ResultsCallback[T] = typings.sparkpost.mod.Callback[typings.sparkpost.anon.Results[T]]
  type ResultsPromise[T] = js.Promise[typings.sparkpost.anon.Results[T]]
}
