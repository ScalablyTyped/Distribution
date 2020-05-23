package typings.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fetcherMod {
  type BooleanMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  /** Differs from normal Fetch, has an extended Response type */
  type Fetch = js.Function2[
    /* input */ typings.std.RequestInfo, 
    /* init */ js.UndefOr[typings.std.RequestInit], 
    js.Promise[typings.rdflib.fetcherMod.ExtendedResponse]
  ]
  type FetchCallbacks = org.scalablytyped.runtime.StringDictionary[js.Array[typings.rdflib.fetcherMod.UserCallback]]
  type FetchQueue = org.scalablytyped.runtime.StringDictionary[js.Promise[typings.rdflib.fetcherMod.ExtendedResponse]]
  type MediatypesMap = org.scalablytyped.runtime.StringDictionary[typings.rdflib.anon.Q]
  type RequestedMap = org.scalablytyped.runtime.StringDictionary[typings.rdflib.fetcherMod.StatusValues]
  type Result = typings.std.Response
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - typings.rdflib.rdflibBooleans.`true`
    - typings.rdflib.rdflibStrings.done
    - typings.rdflib.rdflibNumbers.`401`
    - typings.rdflib.rdflibNumbers.`403`
    - typings.rdflib.rdflibNumbers.`404`
    - typings.rdflib.rdflibStrings.redirected
    - typings.rdflib.rdflibStrings.failed
    - typings.rdflib.rdflibStrings.parse_error
    - typings.rdflib.rdflibStrings.unsupported_protocol
    - typings.rdflib.rdflibStrings.timeout
    - / ** Any other HTTP status code * /
  scala.Double
  */
  type StatusValues = js.UndefOr[
    typings.rdflib.fetcherMod._StatusValues | (/** Any other HTTP status code */
  scala.Double)
  ]
  type TimeOutsMap = org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  type UserCallback = js.Function3[
    /* ok */ scala.Boolean, 
    /* message */ java.lang.String, 
    /* response */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
