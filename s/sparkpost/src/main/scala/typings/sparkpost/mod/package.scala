package typings.sparkpost.mod

import typings.sparkpost.anon.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Callback[T] = js.Function2[/* err */ js.Error | SparkPostError | Null, /* res */ Response[T], Unit]

type Recipient = (RecipientWithAddress & BaseRecipient) | (RecipientWithMultichannelAddresses & BaseRecipient)

type ResultsCallback[T] = Callback[Results[T]]

type ResultsPromise[T] = js.Promise[Results[T]]
