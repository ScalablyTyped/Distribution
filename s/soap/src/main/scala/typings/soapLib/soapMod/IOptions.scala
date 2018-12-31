package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends IWsdlBaseOptions
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var customDeserializer: js.UndefOr[js.Any] = js.undefined
  var disableCache: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var envelopeKey: js.UndefOr[java.lang.String] = js.undefined
  // wsdl options that only work for client
  var forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined
  var httpClient: js.UndefOr[HttpClient] = js.undefined
  var request: js.UndefOr[
    js.Function2[
      /* options */ js.Any, 
      /* callback */ js.UndefOr[
        js.Function3[/* error */ js.Any, /* res */ js.Any, /* body */ js.Any, scala.Unit]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

